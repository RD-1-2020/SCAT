package com.sc.steps.packets;

import com.codeborne.selenide.Condition;
import com.sc.core.holder.TestDataHolder;
import com.sc.core.pages.packets.CourierJournalGridPage;
import com.sc.core.pages.DefaultGridPage;
import com.sc.core.pages.ModalWindowPage;
import com.sc.core.service.element.GridService;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;

import static com.sc.core.constant.TestData.COURIER_NAME;

public class CourierJournalSteps {

    @Autowired
    private CourierJournalGridPage courierJournalGridPage;

    @Autowired
    private GridService gridService;

    @Autowired
    private TestDataHolder testDataHolder;

    @Autowired
    private ModalWindowPage modalWindowPage;

    @Autowired
    private DefaultGridPage defaultGridPage;

    @When("Заполнил ФИО курьера")
    public void fillCourierName() {
        courierJournalGridPage.courierNameInput().sendKeys(COURIER_NAME);
    }

    @When("Выбрал ранее созданый пакет")
    public void selectPreviouslyCreatedOutcomePackage() {
        gridService.searchRowAndCheckCheckbox(testDataHolder.getOutcomePacketsNumber());
    }

    @When("Появилось модальное окно с номером новой ведомости")
    public void openCourierJournalModal() {
        String createJournalModalText = modalWindowPage.modalContent("app-courier-journal-created-modal").text();
        testDataHolder.setCourierJournalNumberFromModalText(createJournalModalText);
    }

    @Then("Ведомость для курьера доступна для редактирования")
    public void courierJournalIsNotReadOnly() {
        defaultGridPage.editActionButton(gridService.searchRow(testDataHolder.getCourierJournalNumber())).should(Condition.visible);
    }

    @Then("Ведомость для курьера не доступна для редактирования")
    public void courierJournalIsReadOnly() {
        defaultGridPage.readActionButton(gridService.searchRow(testDataHolder.getCourierJournalNumber())).should(Condition.visible);
    }

    @Then("Для ведомости для курьера доступны действия")
    public void courierJournalIsAvailable(DataTable dataTable) {
        gridService.checkAdditionalActionsIsVisible(gridService.searchRow(testDataHolder.getCourierJournalNumber()), dataTable);
    }

    @When("Выполнил действие с ведомостью для курьера {string}")
    public void doAction(String action) {
        gridService.doAdditionalAction(gridService.searchRow(testDataHolder.getCourierJournalNumber()), action);
    }
}
