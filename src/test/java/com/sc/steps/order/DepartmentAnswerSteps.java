package com.sc.steps.order;

import com.sc.core.constant.ParserType;
import com.sc.core.dto.DepartmentMessageDto;
import com.sc.core.factory.DepartmentMessageDtoFactory;
import com.sc.core.holder.TestDataHolder;
import com.sc.core.service.department.DepartmentRequestService;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;

public class DepartmentAnswerSteps {

    @Autowired
    private DepartmentMessageDtoFactory departmentMessageDtoFactory;

    @Autowired
    private TestDataHolder testDataHolder;

    @Autowired
    private DepartmentRequestService departmentRequestService;

    /**
     * Для выполнения данного шага нужно быть авторизованым под Администратор/Суперпользователь
     * @param parserName Наименование парсера из endpoint по прямой интеграции с ведомством
     */
    @When("Ведомство отправило положительный ответ через СМЭВ3 для парсера {string}")
    public void sendDepartmentResponse(String parserName) {
        DepartmentMessageDto departmentMessageDto = departmentMessageDtoFactory.build(testDataHolder.getOrderId(), ParserType.valueOf(parserName), true);
                departmentRequestService.sendRequest(departmentMessageDto);
    }
}
