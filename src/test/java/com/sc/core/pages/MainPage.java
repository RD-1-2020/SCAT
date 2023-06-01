package com.sc.core.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.springframework.stereotype.Service;

import static com.codeborne.selenide.Selenide.$;

@Service
public class MainPage {
    public SelenideElement exitButton() {
        return $(By.xpath("//div[@class='user-dropdown-menu dropdown-menu show']//a[@class='line']"));
    }

    public SelenideElement userMenu() {
        return $(By.xpath("//div[@class='user-menu dropdown']//a[@class='dropdown-toggle']"));
    }

    public SelenideElement userMenuIcon() {
        return $(By.xpath("//span[@class='dt-icon dt-icon-user']"));
    }

    public SelenideElement roleLabel() {
        return $(By.xpath("//div[@class='user-dropdown-menu dropdown-menu show']//div[1]//div//span"));
    }

    public SelenideElement mfcLabel() {
        return $(By.xpath("//div[@class='user-dropdown-menu dropdown-menu show']//div[2]//div//span"));
    }

    public SelenideElement displayNameLabel() {
        return $(By.xpath("//a[@class='dropdown-toggle']"));
    }

    public SelenideElement eqIcon() {
        return $(By.xpath("//app-queue-console//svg-icon"));
    }

    public SelenideElement eqWindowHeader() {
        return $(By.xpath("//div[@class='dt-navbar-container']//div[@class='modal-header']//h1"));
    }

    public SelenideElement eqCloseMenuButton() {
        return $(By.xpath("//button[@class='close']"));
    }

    public SelenideElement pageTitle() {
        return $(By.xpath("//div/h2"));
    }

    public SelenideElement activeTab() {
        return $(By.xpath("//a[@class='dt-navbar-page navigate-components active']"));
    }
}
