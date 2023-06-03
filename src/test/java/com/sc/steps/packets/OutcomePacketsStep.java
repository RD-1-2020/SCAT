package com.sc.steps.packets;

import com.codeborne.selenide.Condition;
import com.sc.core.holder.TestDataHolder;
import com.sc.core.pages.DefaultGridPage;
import com.sc.core.pages.MainPage;
import com.sc.core.pages.packets.OutcomePacketsPage;
import com.sc.core.service.element.GridService;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.springframework.beans.factory.annotation.Autowired;

public class OutcomePacketsStep {

    @Autowired
    private TestDataHolder testDataHolder;

    @Autowired
    private OutcomePacketsPage outcomePacketsPage;

    @Autowired
    private GridService gridService;

    @Autowired
    private MainPage mainPage;

    @Autowired
    private DefaultGridPage defaultGridPage;

    @And("Появился тост с номером нового исходящего пакета")
    public void checkNewOutcomeToast() {
        String createPacketToastMessage = mainPage.activeToast().should(Condition.visible).text();
        testDataHolder.setOutcomePacketsNumberFromToast(createPacketToastMessage);
    }

    @Then("Созданный исходящий пакет отобразился в гриде")
    public void checkOutcomePackets() {
        gridService.searchRow(testDataHolder.getOutcomePacketsNumber()).should(Condition.visible);
    }

    @Then("Исходящий пакет в статусе {string}")
    public void checkOutcomePacketsStatus(String statusTitle) {
        outcomePacketsPage.outcomePacketsStatus(statusTitle).should(Condition.visible);
    }

    @And("Исходящий пакет доступен для редактирования")
    public void checkOutcomePacketsNotReadonly() {
        defaultGridPage.editActionButton(gridService.searchRow(testDataHolder.getOutcomePacketsNumber())).should(Condition.visible);
    }

    @And("Исходящий пакет не доступен для редактирования")
    public void checkOutcomePacketsReadonly() {
        defaultGridPage.readActionButton(gridService.searchRow(testDataHolder.getOutcomePacketsNumber())).should(Condition.visible);
    }

    @And("Для исходящего пакета доступны действия")
    public void checkOutcomePacketsActions(DataTable dataTable) {
        gridService.checkAdditionalActionsIsVisible(gridService.searchRow(testDataHolder.getOutcomePacketsNumber()), dataTable);
    }

    @And("Выполнил действие с исходящем пакетом {string}")
    public void doAction(String action) {
        gridService.doAdditionalAction(gridService.searchRow(testDataHolder.getOutcomePacketsNumber()), action);
    }
}
