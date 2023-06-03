package com.sc.core.pages.order;

import com.codeborne.selenide.SelenideElement;
import com.sc.core.service.ActionService;
import com.sc.core.utils.ShadowDomUtils;
import org.openqa.selenium.By;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.codeborne.selenide.Selenide.$;
import static com.sc.core.constant.SelectorTemplates.BUTTON_BY_TEXT_SELECTOR;
import static com.sc.core.constant.SelectorTemplates.WIZARD_MAIN_ACTION_TEMPLATE;

@Service
public class OrderWizardPage {

    @Autowired
    private ShadowDomUtils shadowDomUtils;

    @Autowired
    private ActionService actionService;

    public SelenideElement requesterDropdown() {
        return shadowDomUtils.getElementFromShadowDoom(By.xpath("//dt-combobox"), By.cssSelector(".dt-select-value-text"));
    }

    public SelenideElement requesterDropdownSearch() {
        return shadowDomUtils.getElementFromShadowDoom(By.xpath("//dt-combobox"), By.cssSelector(".dt-select-search"));
    }

    public SelenideElement nextButton() {
        return actionService.getElementBySelectorAndText(BUTTON_BY_TEXT_SELECTOR, "Продолжить");
    }

    public SelenideElement closeValidateWindowButton() {
        return $(By.xpath("//app-validation-error//button[normalize-space(text())='Продолжить']"));
    }

    public SelenideElement widget20FormBody() {
        return $(By.id("formId-body"));
    }

    public SelenideElement phonePanelRadio(int panelNumber) {
        return $(By.xpath("//div[@class='panel panel-info dt-form-panel'][" + panelNumber + "]//div[@class='notification-methods'][1]"));
    }

    public SelenideElement smsPanelRadio(int panelNumber) {
        return $(By.xpath("//div[@class='panel panel-info dt-form-panel'][" + panelNumber + "]//div[@class='notification-methods'][2]"));
    }

    public SelenideElement emailPanelRadio(int panelNumber) {
        return $(By.xpath("//div[@class='panel panel-info dt-form-panel'][" + panelNumber + "]//div[@class='notification-methods'][3]"));
    }

    public SelenideElement notNotifyPanelRadio(int panelNumber) {
        return $(By.xpath("//div[@class='panel panel-info dt-form-panel'][" + panelNumber + "]//div[@class='notification-methods'][4]"));
    }

    public SelenideElement mainActionButtonByText(String actionTitle) {
        return actionService.getElementBySelectorAndText(WIZARD_MAIN_ACTION_TEMPLATE, actionTitle);
    }

    public SelenideElement wizardTitleLabel() {
        return $(By.id("modal-basic-title"));
    }

    public SelenideElement changeStatusModalSubmitButton() {
        return nextButton();
    }

    public SelenideElement departmentTitleLabel() {
        return $(By.xpath("//app-order-short-info-common//app-dt-collapsed-panel//div/div[6]"));
    }

    public SelenideElement expandMainInfoLink() {
        return $(By.xpath("//app-order-short-info-common//app-dt-collapsed-panel//div[@class='dt-link-icon']"));
    }
}
