package com.sc.steps;

import com.codeborne.selenide.Condition;
import com.sc.core.pages.ModalWindowPage;
import com.sc.core.pages.order.OrderWizardPage;
import com.sc.core.service.ActionService;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

import static com.sc.core.constant.SelectorTemplates.*;

public class GlobalSteps {

    @Autowired
    private ActionService actionService;

    @Autowired
    private ModalWindowPage modalWindowPage;

    @Autowired
    private OrderWizardPage orderWizardPage;

    @When("Подождали {int} секунд")
    public void waitAnySeconds(int sec) {
        LockSupport.parkNanos(TimeUnit.MILLISECONDS.toNanos(sec * 1_000L));
    }

    @When("Нажал на кнопку {string}")
    public void clickToButtonByText(String buttonTitle) {
        actionService.getElementBySelectorAndText(BUTTON_BY_TEXT_SELECTOR, buttonTitle).click();
    }

    @When("Закрыл активное окно")
    public void closeActiveModalWindow() {
        modalWindowPage.closeButton().click();
    }

    @When("Нажал на кнопку {string} в окне {string}")
    public void clickToButtonByText(String buttonTitle, String windowSelector) {
        actionService.getElementBySelectorAndText(BUTTON_BY_TEXT_INSIDE_MODAL_SELECTOR, windowSelector, buttonTitle).click();
    }

    @Then("Нет открытых модальных окно")
    public void checkNotActiveModal() {
        modalWindowPage.modalWindow().should(Condition.disappear);
    }

    @And("Нажал на гипертекст {string}")
    public void clickToHyperlinkByText(String text) {
        actionService.getElementBySelectorAndText(LINK_BY_TEXT_SELECTOR, text).click();
    }

    @And("В модальном окне смены статуса подтвердил смену статуса")
    public void submitChangeStatus() {
        orderWizardPage.changeStatusModalSubmitButton().click();
    }
}
