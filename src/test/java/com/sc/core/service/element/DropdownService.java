package com.sc.core.service.element;

import com.codeborne.selenide.SelenideElement;
import com.sc.core.constant.SelectorTemplates;
import com.sc.core.service.ActionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.codeborne.selenide.Condition.appear;

@Service
public class DropdownService {

    @Autowired
    private ActionService actionService;

    /**
     * Метод для работы с dropdown элементами для выбора конкретного значения
     * @param dropdown Выпадашка из которой мы хотим выбрать значение
     * @param value Текстовое значение нашего элемента
     */
    public void selectValueIntoDropdown(SelenideElement dropdown, String value) {
        dropdown.click();
        actionService.getElementBySelectorAndText(SelectorTemplates.DROPDOWN_ITEM_TEMPLATE, value).should(appear).click();
    }

    public void selectValueIntoDropdownWithSearch(SelenideElement dropdown, SelenideElement searchInput, String value) {
        dropdown.click();
        searchInput.sendKeys(value);
        actionService.getElementBySelectorAndText(SelectorTemplates.DROPDOWN_ITEM_TEMPLATE, value).should(appear).click();
    }
}
