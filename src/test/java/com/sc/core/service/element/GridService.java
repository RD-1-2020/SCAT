package com.sc.core.service.element;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.sc.core.constant.SelectorTemplates;
import com.sc.core.pages.DefaultGridPage;
import com.sc.core.service.ActionService;
import io.cucumber.datatable.DataTable;
import org.openqa.selenium.By;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

import static com.sc.core.constant.SelectorTemplates.LINK_BY_TEXT_SELECTOR;

@Service
public class GridService {
    private static final Long GRID_LOAD_TIMEOUT = 1_500L;

    @Autowired
    private DefaultGridPage defaultGridPage;

    @Autowired
    private ActionService actionService;

    public void searchRowAndCheckCheckbox(String value) {
        SelenideElement searchInput = defaultGridPage.searchInput();

        searchInput.clear();
        searchInput.sendKeys(value);

        defaultGridPage.searchButton().click();
        LockSupport.parkNanos(TimeUnit.MILLISECONDS.toNanos(GRID_LOAD_TIMEOUT));

        actionService.getElementBySelectorAndText(SelectorTemplates.GRID_ITEM_RADIOBUTTON_TEMPLATE, value).should(Condition.visible).click();
    }

    public SelenideElement searchRow(String value) {
        SelenideElement searchInput = defaultGridPage.searchInput();

        searchInput.clear();
        searchInput.sendKeys(value);

        defaultGridPage.searchButton().click();
        LockSupport.parkNanos(TimeUnit.MILLISECONDS.toNanos(GRID_LOAD_TIMEOUT));

        return actionService.getElementBySelectorAndText(SelectorTemplates.GRID_ITEM_TITLE_TEMPLATE, value).should(Condition.visible);
    }

    public SelenideElement searchCellInsideRow(SelenideElement row, String text) {
        return row.$(By.xpath(String.format(SelectorTemplates.ANY_BY_TEXT_SELECTOR, text)));
    }

    public void doAdditionalAction(SelenideElement selenideElement, String action) {
        defaultGridPage.additionalActionsButton(selenideElement).click();
        actionService.getElementBySelectorAndText(LINK_BY_TEXT_SELECTOR, action).should(Condition.visible).click();
    }

    public void checkAdditionalActionsIsVisible(SelenideElement selenideElement, DataTable actionRowTable) {
        defaultGridPage.additionalActionsButton(selenideElement).click();

        actionRowTable.asLists().forEach(row -> row.forEach(action -> {
            actionService.getElementBySelectorAndText(LINK_BY_TEXT_SELECTOR, action).should(Condition.visible);
        }));
    }
}
