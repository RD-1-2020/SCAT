package com.sc.core.service.element;

import com.sc.core.constant.SelectorTemplates;
import com.sc.core.service.ActionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.codeborne.selenide.Condition.appear;

@Service
public class CheckableElementService {

    @Autowired
    private ActionService actionService;

    public void check(String value) {
        actionService.getElementBySelectorAndText(SelectorTemplates.RADIO_INPUT_TEMPLATE, value).should(appear).click();
    }
}
