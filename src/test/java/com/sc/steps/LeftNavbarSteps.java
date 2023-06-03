package com.sc.steps;

import com.sc.core.service.element.LeftNavbarService;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;

public class LeftNavbarSteps {

    @Autowired
    private LeftNavbarService leftNavbarService;

    @When("Перешёл в грид исходящих пакетов")
    public void goToOutcomePackets() {
        leftNavbarService.openOutcomePackets();
    }

    @When("МЕНЮ ВЫБОРА ГРИДА: Выбрать грид Заявители")
    public void openGridApplicants() {
        leftNavbarService.openRequesterGrid();
    }

    @When("Перешёл в грид ведомости для курьера")
    public void goToCourierJournalGrid() {
        leftNavbarService.openCourierJournalGrid();
    }

    @When("Перешёл в грид входящих пакетов")
    public void goToIncomingPackets() {
        leftNavbarService.openIncomingPackets();
    }
}
