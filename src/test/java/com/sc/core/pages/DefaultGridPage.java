package com.sc.core.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.springframework.stereotype.Service;

import static com.codeborne.selenide.Selenide.$;

@Service
public class DefaultGridPage {

    public SelenideElement searchInput() {
        return $(By.xpath("//input[@name='search']"));
    }

    public SelenideElement searchButton() {
        return $(By.xpath("//button[@class='btn btn-primary dt-grid-apply-search']"));
    }

    public SelenideElement readActionButton(SelenideElement row) {
        return row.$(By.xpath(".//i[@class='dt-icon dt-icon-eye']"));
    }

    public SelenideElement additionalActionsButton(SelenideElement row) {
        return row.$(By.xpath(".//i[@class='dt-icon dt-icon-more']"));
    }

    public SelenideElement editActionButton(SelenideElement row) {
        return row.$(By.xpath(".//i[@class='dt-icon dt-icon-edit']"));
    }
}
