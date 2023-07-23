package com.sc.core.service.autocreate;

import com.codeborne.selenide.Condition;
import com.sc.core.pages.auth.AuthorizationPage;
import com.sc.core.pages.order.OrderWizardPage;
import com.sc.core.service.ActionService;
import com.sc.core.service.element.CheckableElementService;
import com.sc.core.service.element.DropdownService;
import com.sc.core.service.element.GridService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.open;
import static com.sc.core.constant.SelectorTemplates.BUTTON_BY_TEXT_INSIDE_MODAL_SELECTOR;
import static com.sc.core.constant.SelectorTemplates.BUTTON_BY_TEXT_SELECTOR;

@Service
public class AutoCreateOrderService {
    private final static Logger logger = LoggerFactory.getLogger(AutoCreateOrderService.class);
    private static final String NEXT_BUTTON_TITLE = "Продолжить";
    private static final int MAX_TRY_WAIT_FORM = 10;

    @Autowired
    private DropdownService dropdownService;

    @Autowired
    private AuthorizationPage authorizationPage;

    @Autowired
    private ActionService actionService;

    @Autowired
    private OrderWizardPage orderWizardPage;

    @Autowired
    private GridService gridService;

    @Autowired
    private CheckableElementService checkableElementService;

    @Value("${auto.create.service.server.address:http://192.168.141.185:8080/cpgu/}")
    private String autoCreateBaseUrl;

    @Value("${auto.create.user.snils:00000000000}")
    private String universalSnils;

    @Value("${auto.create.user.password:123}")
    private String universalPassword;

    public void createOrderInOneThread(String mfcDisplayName, String roleName, Integer countForInvoker, String requesterFullDisplayName, String serviceTitle) {
        logger.info("[AUTO_CREATE]: Worker for create order {} is started!", countForInvoker);

        try {
            doAuth(mfcDisplayName, roleName);
        } catch (Throwable exception) {
            logger.error("[AUTO_CREATE]: On Auth something went wrong", exception);
            throw exception;
        }


        for (int i = 0; i < countForInvoker; i++) {
            logger.info("[AUTO_CREATE]: Try create order {}", i);

            try {
                actionService.getElementBySelectorAndText(BUTTON_BY_TEXT_SELECTOR, "Создать заявление").should(Condition.enabled).click();
                skipEqWindow();

                selectRequester(requesterFullDisplayName);
                selectService(serviceTitle);
                workWithOrderForm();
                orderWizardPage.smsPanelRadio(1).click();

                actionService.getElementBySelectorAndText(BUTTON_BY_TEXT_SELECTOR, "Сохранить").should(Condition.enabled).click();

                logger.info("[AUTO_CREATE]: Order {} is created!", i);
            } catch (Throwable exception) {
                closeModal();
                logger.error("[AUTO_CREATE]: On create order something went wrong, try ignore it...", exception);
            }
        }

        logger.info("[AUTO_CREATE]: Worker done work, worker is stopped!");
    }

    private void skipComplexOrderWindow() {
        try {
            checkableElementService.check("Обычное заявление");
            actionService.getElementBySelectorAndText(BUTTON_BY_TEXT_INSIDE_MODAL_SELECTOR, "app-create-single-complex-order-modal", NEXT_BUTTON_TITLE).click();
        } catch (Throwable exception) {
            // ignore service is not complex
        }
    }

    private void skipEqWindow() {
        try {
            checkableElementService.check("Продолжить работу без приёма талона");
            checkableElementService.check("Я ознакомлен о недопустимости создания заявления без приёма по талону");
            clickNextButton();
        } catch (Throwable exception) {
            // ignore no eq window
        }
    }

    private void workWithOrderForm() {
        boolean hasGoToNextStep = false;
        int tryCount = 0;

        while (!hasGoToNextStep) {
            try {
                LockSupport.parkNanos(TimeUnit.SECONDS.toNanos(3));

                clickNextButton();
                orderWizardPage.closeValidateWindowButton().click();

                orderWizardPage.smsPanelRadio(1).should(visible);
                hasGoToNextStep = true;
            } catch (Throwable exception) {
                LockSupport.parkNanos(TimeUnit.SECONDS.toNanos(3));
                tryCount++;
                // ignore form not loaded
            } finally {
                tryCount++;

                if (tryCount > MAX_TRY_WAIT_FORM) {
                    logger.error("[AUTO_CREATE]: Order form not loaded, tryCount more then " + MAX_TRY_WAIT_FORM + " times");
                    closeModal();
                    break;
                }
            }
        }
    }

    private void selectService(String serviceTitle) {
        gridService.searchRowAndCheckCheckbox(serviceTitle);
        clickNextButton();
        skipComplexOrderWindow();
    }

    private void selectRequester(String requesterFullDisplayName) {
        dropdownService.selectValueIntoDropdownWithSearch(orderWizardPage.requesterDropdown(), orderWizardPage.requesterDropdownSearch(), requesterFullDisplayName);
        clickNextButton();
    }

    private void doAuth(String testMfcDisplayName, String roleTitle) {
        open(autoCreateBaseUrl);

        authorizationPage.loginInput().should(visible, Duration.ofSeconds(20)).sendKeys(universalSnils);
        authorizationPage.passwordInput().sendKeys(universalPassword);
        authorizationPage.loginButton().click();

        dropdownService.selectValueIntoDropdown(authorizationPage.filialDropdown(), testMfcDisplayName);
        dropdownService.selectValueIntoDropdown(authorizationPage.roleDropdown(), roleTitle);

        authorizationPage.nextButton().click();
    }

    private void clickNextButton() {
        actionService.getElementBySelectorAndText(BUTTON_BY_TEXT_SELECTOR, NEXT_BUTTON_TITLE).should(Condition.enabled).click();
    }

    private void closeModal() {
        actionService.getElementBySelectorAndText(BUTTON_BY_TEXT_SELECTOR, "Закрыть").should(Condition.enabled).click();
    }
}
