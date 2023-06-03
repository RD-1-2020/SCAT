package com.sc.core.pages.auth;

import com.codeborne.selenide.SelenideElement;
import com.sc.core.utils.ShadowDomUtils;
import org.openqa.selenium.By;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.codeborne.selenide.Selenide.$;

@Service
public class AuthorizationPage {

    @Autowired
    private ShadowDomUtils shadowDomUtils;

    public SelenideElement passwordInput() {
        return $(By.name("password"));
    }

    public SelenideElement loginInput() {
        return $(By.name("snils"));
    }

    public SelenideElement loginButton() {
        return $(By.xpath("//button[normalize-space(text())='Войти']"));
    }

    public SelenideElement esiaLoginLink() {
        return $(By.xpath("//div[@class='esia-login']/a"));
    }

    public SelenideElement filialDropdown() {
        return shadowDomUtils.getElementFromShadowDoom(By.xpath("(//dt-combobox)[1]"), By.cssSelector(".dt-select-value-text"));
    }

    public SelenideElement roleDropdown() {
        return shadowDomUtils.getElementFromShadowDoom(By.xpath("(//dt-combobox)[2]"), By.cssSelector(".dt-select-value-text"));
    }

    public SelenideElement damaskWindowDropdown() {
        return shadowDomUtils.getElementFromShadowDoom(By.xpath("(//dt-combobox)[3]"), By.cssSelector(".dt-select-value-text"));
    }

    public SelenideElement errorMessageLabel() {
        return $(By.xpath("//h1"));
    }

    public SelenideElement alertMessageLabel() {
        return $(By.xpath("//div[@class='alert alert-danger']"));
    }

    public SelenideElement backButton() {
        return $(By.xpath("//button[normalize-space(text())='Назад']"));
    }

    public SelenideElement nextButton() {
        return $(By.xpath("//button[normalize-space(text())='Продолжить']"));
    }

    public SelenideElement smartcallLineInput() {
        return $(By.xpath("//input[@class='form-control ng-untouched ng-pristine ng-valid']"));
    }
}
