package com.sc.steps.order;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.sc.core.holder.TestDataHolder;
import com.sc.core.pages.DefaultGridPage;
import com.sc.core.service.element.GridService;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;

public class OrderGridSteps {

    @Autowired
    private DefaultGridPage defaultGridPage;

    @Autowired
    private GridService gridService;

    @Autowired
    private TestDataHolder testDataHolder;

    @Then("Заявление находится в статусах {string} {string}")
    public void checkOrderStatus(String internalStatus, String externalStatus) {
        SelenideElement orderRow = gridService.searchRow(testDataHolder.getOrderNumber());
        gridService.searchCellInsideRow(orderRow, internalStatus).should(Condition.visible);
        gridService.searchCellInsideRow(orderRow, externalStatus).should(Condition.visible);
    }

    @Then("Заявление не доступно для редактирования")
    public void checkOrderReadonly() {
        defaultGridPage.readActionButton(gridService.searchRow(testDataHolder.getOrderNumber())).should(Condition.visible);
    }

    @Then("Для заявления доступны действия")
    public void checkOrderActions(DataTable dataTable) {
        gridService.checkAdditionalActionsIsVisible(gridService.searchRow(testDataHolder.getOrderNumber()), dataTable);
    }

    @Then("Заявление доступно для редактирования")
    public void checkOrderNotReadonly() {
        defaultGridPage.editActionButton(gridService.searchRow(testDataHolder.getOrderNumber())).should(Condition.visible);
    }

    @When("Выполнил действие с заявлением {string}")
    public void doAction(String action) {
        gridService.doAdditionalAction(gridService.searchRow(testDataHolder.getOrderNumber()), action);
    }
}
