package com.sc.core.pages.requester;

import com.codeborne.selenide.SelenideElement;
import com.sc.core.utils.ShadowDomUtils;
import org.openqa.selenium.By;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.codeborne.selenide.Selenide.$;

@Service
public class RequesterCardPage {
    @Autowired
    private ShadowDomUtils shadowDomUtils;

    public SelenideElement documentTypeDropdown() {
        return shadowDomUtils.getElementFromShadowDoom(By.xpath("(//dt-combobox)[3]"), By.cssSelector(".dt-select"));
    }

    public SelenideElement clearDocumentTypeButton() {
        return shadowDomUtils.getElementFromShadowDoom(By.xpath("(//dt-combobox)[3]"), By.cssSelector(".dt-select-clear"));
    }

    public SelenideElement dulSeriesInput() {
        return $(By.xpath("//input[@id='passportSeries']"));
    }

    public SelenideElement dulNumberInput() {
        return $(By.xpath("//input[@id='passportNo']"));
    }

    public SelenideElement missClickElement() {
        return $(By.xpath("//h4[@class='subform-header-title']"));
    }

    public SelenideElement notUniqueDulLabel() {
        return $(By.xpath("//div[@class='d-flex flex-wrap-grow-2 two-control-container']//div[3]"));
    }

    public SelenideElement requiredSeriesErrorMessageLabel() {
        return $(By.xpath("//div[@class='d-flex flex-wrap-grow-2 two-control-container']//div[@class='invalid-feedback']"));
    }

    public SelenideElement requiredNumberErrorMessageLabel() {
        return $(By.xpath("//div[@class='d-flex flex-wrap-grow-2 two-control-container']//following-sibling::div//div//div"));
    }

    public SelenideElement requiredDocumentTypeErrorMessageLabel() {
        return $(By.xpath("//div[./label[@for='documentType']]//div[@class='invalid-feedback']"));
    }
}
