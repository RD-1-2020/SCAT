package com.sc.core.service;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.springframework.stereotype.Service;

import static com.codeborne.selenide.Selenide.$;

@Service
public class LeftNavbarPage {

    public SelenideElement navbarMenuIcon() {
        return $(By.xpath("//app-dt-page-sidebar//a[@title='Меню']"));
    }

    public SelenideElement navbarRequesterMenuItem() {
        return $(By.xpath("//app-dt-page-sidebar//a[@href='#/customers']"));
    }

    public SelenideElement navbarOrderMenuItem() {
        return $(By.xpath("//app-dt-page-sidebar//a[@href='#/orders']"));
    }
}
