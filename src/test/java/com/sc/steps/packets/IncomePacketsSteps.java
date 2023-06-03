package com.sc.steps.packets;

import com.codeborne.selenide.Condition;
import com.sc.core.holder.TestDataHolder;
import com.sc.core.pages.DefaultGridPage;
import com.sc.core.pages.ModalWindowPage;
import com.sc.core.service.element.GridService;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

public class IncomePacketsSteps {

    @Autowired
    private TestDataHolder testDataHolder;

    @Autowired
    private ModalWindowPage modalWindowPage;

    @Autowired
    private GridService gridService;

    @Autowired
    private DefaultGridPage defaultGridPage;

    @And("Появился тост с номером нового входящего пакета")
    public void checkNewOutcomeToast() {
        String createPacketToastMessage = modalWindowPage.modalContent("app-toast-modal").text();
        testDataHolder.setIncomePacketsNumberFromToast(createPacketToastMessage);
    }

    @Then("Входящий пакет доступен для редактирования")
    public void incomePacketsIsNotReadOnly() {
        defaultGridPage.editActionButton(gridService.searchRow(testDataHolder.getIncomePacketsNumber())).should(Condition.visible);
    }

    @Then("Входящий пакет не доступен для редактирования")
    public void incomePacketsIsReadOnly() {
        defaultGridPage.readActionButton(gridService.searchRow(testDataHolder.getIncomePacketsNumber())).should(Condition.visible);
    }

    @Then("Для входящего пакета доступны действия")
    public void incomePacketsIsAvailable(DataTable dataTable) {
        gridService.checkAdditionalActionsIsVisible(gridService.searchRow(testDataHolder.getIncomePacketsNumber()), dataTable);
    }

    @When("Выполнил действие с входящим пакетом {string}")
    public void doAction(String action) {
        // Wait for 10 seconds when package has been created
        LockSupport.parkNanos(TimeUnit.MILLISECONDS.toNanos(10_000));
        gridService.doAdditionalAction(gridService.searchRow(testDataHolder.getIncomePacketsNumber()), action);

        // Wait for 10 seconds when accept modal has been rendered
        LockSupport.parkNanos(TimeUnit.MILLISECONDS.toNanos(10_000));
    }
}
