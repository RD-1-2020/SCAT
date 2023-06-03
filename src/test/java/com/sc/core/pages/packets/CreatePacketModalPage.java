package com.sc.core.pages.packets;

import com.codeborne.selenide.SelenideElement;
import com.sc.core.utils.ShadowDomUtils;
import org.openqa.selenium.By;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreatePacketModalPage {

    @Autowired
    private ShadowDomUtils shadowDomUtils;

    public SelenideElement serviceDropdown() {
        return shadowDomUtils.getElementFromShadowDoom(By.xpath("//div[./label[text()='Услуга']]//dt-combobox"), By.cssSelector(".dt-select-value-text"));
    }

    public SelenideElement departmentDropdown() {
        return shadowDomUtils.getElementFromShadowDoom(By.xpath("//div[./label[text()='Ведомство']]//dt-combobox"), By.cssSelector(".dt-select-value-text"));
    }

    public SelenideElement subDepartmentDropdown() {
        return shadowDomUtils.getElementFromShadowDoom(By.xpath("//div[./label[text()='Подразделение ведомства']]//dt-combobox"), By.cssSelector(".dt-select-value-text"));
    }
}
