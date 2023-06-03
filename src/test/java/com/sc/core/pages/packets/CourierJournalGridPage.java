package com.sc.core.pages.packets;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.springframework.stereotype.Service;

import static com.codeborne.selenide.Selenide.$;

@Service
public class CourierJournalGridPage {
    public SelenideElement courierNameInput() {
        return $(By.xpath("//div[./label[normalize-space(text())='ФИО курьера']]//input"));
    }
}
