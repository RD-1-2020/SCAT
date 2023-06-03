package com.sc.steps.packets;

import com.sc.core.holder.TestDataHolder;
import com.sc.core.pages.packets.CreatePacketModalPage;
import com.sc.core.service.element.DropdownService;
import com.sc.core.service.element.GridService;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

import static com.sc.core.constant.Message.NON_SUB_DEPARTMENT_ITEM_VALUE;

public class CreatePacketsModalStep {

    @Autowired
    private CreatePacketModalPage createPacketModalPage;

    @Autowired
    private DropdownService dropdownService;

    @Autowired
    private TestDataHolder testDataHolder;

    @Autowired
    private GridService gridService;

    @When("Выбрал ведомство по ранее созданой услуге")
    public void selectDepartment() {
        dropdownService.selectValueIntoDropdown(createPacketModalPage.departmentDropdown(), testDataHolder.getDepartmentTitle());
    }

    @When("Выбрал подразделение ведомства по ранее созданой услуге")
    public void selectSubDepartment() {
        String subDepartmentTitle = testDataHolder.getSubDepartmentTitle();
        if (StringUtils.isBlank(subDepartmentTitle)) {
            subDepartmentTitle = NON_SUB_DEPARTMENT_ITEM_VALUE;
        }

        dropdownService.selectValueIntoDropdown(createPacketModalPage.subDepartmentDropdown(), subDepartmentTitle);
    }

    @And("Выбрал ранее созданую услугу")
    public void selectService() {
        dropdownService.selectValueIntoDropdown(createPacketModalPage.serviceDropdown(), testDataHolder.getServiceTitle());
    }

    @And("Выбрал ранее созданое заявление")
    public void selectOrder() {
        gridService.searchRowAndCheckCheckbox(testDataHolder.getOrderNumber());
    }
}
