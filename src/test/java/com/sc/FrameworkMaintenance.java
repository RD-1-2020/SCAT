package com.sc;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class FrameworkMaintenance {
    @After
    public void clean(Scenario scenario) {
        getWebDriver().quit();
    }
}
