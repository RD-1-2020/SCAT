package com.sc.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

@Service
public class LeftNavbarService {

    @Autowired
    private LeftNavbarPage leftNavbarPage;

    public void openRequesterGrid() {
        openNavbar();
        leftNavbarPage.navbarRequesterMenuItem().click();

        LockSupport.parkNanos(TimeUnit.MILLISECONDS.toNanos(1000));
    }

    public void openOrderGrid() {
        openNavbar();
        leftNavbarPage.navbarOrderMenuItem().click();

        LockSupport.parkNanos(TimeUnit.MILLISECONDS.toNanos(1000));
    }

    private void openNavbar() {
        leftNavbarPage.navbarMenuIcon().click();
    }
}
