package com.sc.core.service;

import com.codeborne.selenide.SelenideElement;
import com.sc.core.constant.SelectorTemplates;
import org.openqa.selenium.By;
import org.springframework.stereotype.Service;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Selenide.$;

@Service
public class ActionService {
    private static final String SCROLL_INTO_CENTER_CONFIG = "{behavior: \"instant\", block: \"center\", inline: \"center\"}";

    /**
     * Метод для работы с dropdown элементами для выбора конкретного значения
     * @param dropdown Выпадашка из которой мы хотим выбрать значение
     * @param value Текстовое значение нашего элемента
     */
    public void selectValueIntoDropdown(SelenideElement dropdown, String value) {
        dropdown.click();
        getElementBySelectorAndText(SelectorTemplates.DROPDOWN_ITEM_TEMPLATE, value).should(appear).click();
    }

    public SelenideElement scrollToElementInTop(SelenideElement scrollToElement) {
        return scrollToElement.scrollIntoView(SCROLL_INTO_CENTER_CONFIG);
    }

    private SelenideElement getElementBySelectorAndText(String selectorTemplate, String value) {
        return $(By.xpath(String.format(selectorTemplate, value)));
    }
}
