package com.sc.steps.order;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.sc.core.constant.Message;
import com.sc.core.holder.TestDataHolder;
import com.sc.core.pages.order.OrderWizardPage;
import com.sc.core.service.ActionService;
import com.sc.core.service.element.DropdownService;
import com.sc.core.service.element.GridService;
import io.cucumber.java.en.And;
import org.apache.commons.lang3.StringUtils;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import java.time.Duration;

public class OrderWizardSteps {
    @Autowired
    private OrderWizardPage orderWizardPage;

    @Autowired
    private DropdownService dropdownService;

    @Autowired
    private GridService gridService;

    @Autowired
    private TestDataHolder testDataHolder;

    @Autowired
    private ActionService actionService;

    @Value("${non.electronic.service.title.without.sub.department:}")
    private String nonElectronicServiceTitle;

    @Value("${electronic.service.title.without.sub.department:}")
    private String electronicServiceTitle;

    @Value("${fl.requester.display.name}")
    private String flDisplayName;

    @Value("${ip.requester.display.name}")
    private String ipDisplayName;

    @Value("${ul.requester.display.name}")
    private String ulDisplayName;

    @And("Выбрал заявителя ФЛ")
    public void selectFlRequester() {
        dropdownService.selectValueIntoDropdownWithSearch(orderWizardPage.requesterDropdown(), orderWizardPage.requesterDropdownSearch(), flDisplayName);
    }

    @And("Выбрал заявителя ИП")
    public void selectIpRequester() {
        dropdownService.selectValueIntoDropdownWithSearch(orderWizardPage.requesterDropdown(), orderWizardPage.requesterDropdownSearch(), ipDisplayName);
    }

    @And("Выбрал заявителя ЮЛ")
    public void selectUlRequester() {
        dropdownService.selectValueIntoDropdownWithSearch(orderWizardPage.requesterDropdown(), orderWizardPage.requesterDropdownSearch(), ulDisplayName);
    }

    @And("Выбрал неэлектронную услугу")
    public void selectNonElectronicService() {
        gridService.searchRowAndCheckCheckbox(nonElectronicServiceTitle);
        testDataHolder.setServiceTitle(nonElectronicServiceTitle);
    }

    @And("Выбрал способ уведомления по СМС для {int} заявителей")
    public void selectNotificationSms(int requesterNumber) {
        orderWizardPage.smsPanelRadio(requesterNumber).click();
    }

    @And("Подождали загрузки виджета 2.0 максимум {int} секунд")
    public void waitLoadFormAnyTime(int seconds) {
        orderWizardPage.widget20FormBody().should(Condition.visible, Duration.ofSeconds(seconds));
    }

    @And("Нажал на основное действие {string}")
    public void changeStatusTo(String statusTitle) {
        orderWizardPage.mainActionButtonByText(statusTitle).click();
    }

    @And("Закрыли окно валидации формы заявления")
    public void closeValidationWindow() {
        orderWizardPage.closeValidateWindowButton().click();
    }

    @And("Запомнил информацию по заявлению")
    public void saveOrderInfo() {
        String orderNumber = orderWizardPage.wizardTitleLabel().text().trim();
        String orderId = orderWizardPage.orderIdLabel().text().trim();

        Assert.assertNotEquals(Message.NEW_ORDER_WIZARD_TITLE, orderNumber);

        testDataHolder.setOrderNumber(orderNumber);
        testDataHolder.setOrderId(orderId);

        orderWizardPage.expandMainInfoLink().click();

        SelenideElement departmentTitleElement = orderWizardPage.departmentTitleLabel();
        String departmentTitle = actionService.scrollToElementInCenter(departmentTitleElement).text();

        Assert.assertFalse(StringUtils.isBlank(departmentTitle));
        testDataHolder.setDepartmentTitle(departmentTitle);
    }

    @And("Выбрал электронную услугу")
    public void selectElectronicService() {
        gridService.searchRowAndCheckCheckbox(electronicServiceTitle);
        testDataHolder.setServiceTitle(electronicServiceTitle);
    }
}
