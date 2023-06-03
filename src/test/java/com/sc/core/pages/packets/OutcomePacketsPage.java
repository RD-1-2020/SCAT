package com.sc.core.pages.packets;

import com.codeborne.selenide.SelenideElement;
import com.sc.core.holder.TestDataHolder;
import com.sc.core.service.element.GridService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OutcomePacketsPage {

    @Autowired
    private TestDataHolder testDataHolder;

    @Autowired
    private GridService gridService;

    public SelenideElement outcomePacketsStatus(String statusTitle) {
        return gridService.searchCellInsideRow(gridService.searchRow(testDataHolder.getOutcomePacketsNumber()), statusTitle);
    }
}
