package com.sc.core.pages;

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

    public SelenideElement packetsExpand() {
        return $(By.cssSelector("a[class='expand']"));
    }

    public SelenideElement navbarOutcomePacketsMenuItem() {
        return $(By.xpath("//a[@href='#/documents/outcome-packets']"));
    }

    public SelenideElement navbarCourierJournalMenuItem() {
        return $(By.xpath("//a[@href='#/documents/courier-journal']"));
    }

    public SelenideElement navbarIncomingPacketsMenuItem() {
        return $(By.xpath("//a[@href='#/documents/income-packets']"));
    }
}
