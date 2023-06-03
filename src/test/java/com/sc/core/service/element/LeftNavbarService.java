package com.sc.core.service.element;

import com.sc.core.pages.LeftNavbarPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LeftNavbarService {

    @Autowired
    private LeftNavbarPage leftNavbarPage;

    public void openRequesterGrid() {
        openNavbar();
        leftNavbarPage.navbarRequesterMenuItem().click();
    }

    public void openOutcomePackets() {
        openNavbar();
        leftNavbarPage.packetsExpand().click();
        leftNavbarPage.navbarOutcomePacketsMenuItem().click();
    }

    public void openOrderGrid() {
        openNavbar();
        leftNavbarPage.navbarOrderMenuItem().click();
    }

    private void openNavbar() {
        leftNavbarPage.navbarMenuIcon().click();
    }

    public void openCourierJournalGrid() {
        openNavbar();
        leftNavbarPage.packetsExpand().click();
        leftNavbarPage.navbarCourierJournalMenuItem().click();
    }

    public void openIncomingPackets() {
        openNavbar();
        leftNavbarPage.packetsExpand().click();
        leftNavbarPage.navbarIncomingPacketsMenuItem().click();
    }
}
