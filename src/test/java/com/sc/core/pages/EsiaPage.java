package com.sc.core.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.springframework.stereotype.Service;

import static com.codeborne.selenide.Selenide.$;

@Service
public class EsiaPage {
    public SelenideElement passwordInput() {
        return $(By.xpath("//input[@id=\"password\"]"));
    }

    public SelenideElement loginInput() {
        return $(By.xpath("//input[@id=\"login\"]"));
    }

    public SelenideElement loginButton() {
        return $(By.xpath("//button[normalize-space(text())='Войти']"));
    }

    public SelenideElement mainPageButton() {
        return $(By.xpath("//a[@class='auth_main']"));
    }
}
