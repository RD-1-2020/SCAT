package com.sc.steps;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class FrameworkMaintenance {
    @After
    public void clean(Scenario scenario) {
        getWebDriver().quit();
    }
}
