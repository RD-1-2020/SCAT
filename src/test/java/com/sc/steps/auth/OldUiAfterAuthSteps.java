package com.sc.steps.auth;

import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

// TODO Удалить после того как произойдёт полный отказ отказ от версий 2.0 и 3.0
@Deprecated
public class OldUiAfterAuthSteps {

    @Then("Проверить МФЦ в хедере 2.0: {string}")
    public void MFCinHeader(String role) {
        $(By.xpath("//span[@id='auth']")).shouldHave(text(role));
    }

    @Then("Проверить ФИО в хедере 2.0 {string}")
    public void FioHeader(String role) {
        $(By.xpath("//span[@id='auth-info']")).should(appear).shouldHave(text(role));
    }

    @Then("Проверить роль в хедере 2.0: {string}")
    public void RoleHeader(String role) {
        $(By.xpath("//span[@id='auth']")).should(visible, Duration.ofSeconds(10)).shouldHave(text(role));
    }

    @Then("Проверить роль и мфц в хедере 2.0 при 1 роле и 1 мфц оператор: {string}")
    public void RoleMfcHeader(String role) {
        $(By.xpath("//span[@id='auth']")).shouldHave(text(role));
    }

    @Then("Выйти из интерфейса 2.0")
    public void Exit20() {
        $(By.xpath("//span//a[text()='Выход']")).click();
    }

    @Then("Проверить номер линии {string}")
    public void testLine(String line) {
        SelenideElement numberLine = $(By.xpath("//label[@class='x-component lineNumber-button x-box-item x-component-default']"));
        numberLine.shouldHave(text(line));
    }

    @Then("Проверить ФИО в хедере 3.0 {string}")
    public void LastName3(String name) {
        LockSupport.parkNanos(TimeUnit.MILLISECONDS.toNanos(5000));;
        SelenideElement lastName = $(By.xpath("//span[@class='page-title__user decorated mat-menu-trigger']"));
        lastName.should(visible, Duration.ofSeconds(10)).shouldHave(text(name));
    }

    @Then("Проверить роль в хедере 3.0: {string}")
    public void RoleHeader30(String role) {
        SelenideElement role1 = $(By.xpath("//div[@class='navigation']//a[@class='page-title__user decorated']"));
        role1.should(visible, Duration.ofSeconds(20)).shouldHave(text(role));
    }

    @Then("Проверить МФЦ в хедере 3.0: {string}")
    public void MFCinHeader30role1Mfc1(String role) {
        SelenideElement mfc = $(By.xpath("//div[@class='navigation']//span[@class=\"page-title__user ng-star-inserted\"]"));
        mfc.shouldHave(text(role));
    }

    @Then("Проверить МФЦ в хедере 3.0 несколько ролей и несколько мфц: {string}")
    public void MFCinHeader30(String role) {
        SelenideElement mfc = $(By.xpath("//div[@class=\"navigation\"]//a[@class=\"page-title__user decorated ng-star-inserted\"]"));
        mfc.shouldHave(text(role));
    }

    @Then("Нажать кнопку открытия пульта  ЭО 3.0 после авторизации")
    public void openDamaskMenu30() {
        LockSupport.parkNanos(TimeUnit.MILLISECONDS.toNanos(1000));
        SelenideElement iconDamask30 = $(By.xpath("//div[@class=\"nav-item nav-icon mat-menu-trigger ng-star-inserted\"]//mat-icon[@class=\"mat-icon notranslate material-icons mat-icon-no-color\"]"));
        iconDamask30.should(visible, Duration.ofSeconds(10));
        iconDamask30.click();
    }

    @Then("Нажать кнопку Начать работу пульта ЭО 3.0 после авторизации")
    public void clickButtonStartWork30() {
        SelenideElement iconDamask30 = $(By.xpath("//div[@class=\"mat-menu-content\"]"));
        iconDamask30.should(appear);
        iconDamask30.click();
    }

    @Then("Проверить номер окна в меню Дамаск 3.0: {string}")
    public void windowNumberChoise(String window) {
        $(By.xpath("//span[@class=\"window-name ng-star-inserted\"]")).shouldHave(text(window));
    }

    @Then("Нажать кнопку запущенного пульта ЭО 3.0 после начала работы")
    public void iconDamaskMenu30() {
        SelenideElement iconDamask30 = $(By.xpath("//div[@class=\"nav-item nav-icon mat-menu-trigger ng-star-inserted\"]//mat-icon[@class=\"mat-icon notranslate material-icons mat-icon-no-color power-on\"]"));
        iconDamask30.should(appear);
        iconDamask30.click();
    }

    @Then("Нажать кнопку Завершить работу пульта ЭО 3.0")
    public void clickButtonCloseWork30() {
        SelenideElement iconDamask30 = $(By.xpath("//div[@class=\"mat-menu-content\"]//mat-icon[@class=\"power-off mat-icon notranslate material-icons mat-icon-no-color\"]"));
        iconDamask30.should(appear);
        iconDamask30.click();
    }

    @Then("Проверить отображение пульта ЭО Дамаск в версии 2.0 и нажать")
    public void controller20() {
        LockSupport.parkNanos(TimeUnit.MILLISECONDS.toNanos(1000));
        SelenideElement Pult20 = $(By.xpath("//div[@class=\"x-btn x-box-item x-btn-default-small x-noicon x-btn-noicon x-btn-default-small-noicon\"]"));
        Pult20.should(visible, Duration.ofSeconds(10));
        Pult20.click();
    }

    @Then("Проверить, что элемент Пульт ЭО 2.0 не отображается на странице")
    public void notIconDamask20() {
        LockSupport.parkNanos(TimeUnit.MILLISECONDS.toNanos(1000));
        Assert.assertFalse($(By.xpath("//span[text()='Пульт ЭО']")).isDisplayed());
    }

    @Then("Проверить, что элемент Пульт ЭО 3.0 не отображается на странице")
    public void notIconDamask30() {
        LockSupport.parkNanos(TimeUnit.MILLISECONDS.toNanos(1000));
        Assert.assertFalse($(By.xpath("//div[@class=\"nav-item nav-icon mat-menu-trigger ng-star-inserted\"]")).isDisplayed());
    }

    @Then("Нажать кнопку Начать работу пульта ЭО 2.0 после авторизации")
    public void clickButtonStartWork20() {
        SelenideElement StartWork20 = $(By.xpath("//div[@class=\"x-btn x-btn-default-small-action-button x-box-item x-btn-default-small x-noicon x-btn-noicon x-btn-default-small-noicon\"]"));
        StartWork20.should(visible, Duration.ofSeconds(10));
        StartWork20.click();
    }

    @Then("Проверить номер окна в меню Дамаск 2.0: {string}")
    public void windowNumber20(String window2) {
        $(By.xpath("//div[@class=\"x-component x-window-item x-component-default\"]")).shouldHave(text(window2));
    }

    @Then("Нажать кнопку Закончить работу пульта ЭО 2.0 после авторизации")
    public void clickButtonCloseWork20() {
        SelenideElement CloseWork20 = $(By.xpath("//span[text()='Закончить работу']"));
        CloseWork20.should(appear);
        LockSupport.parkNanos(TimeUnit.MILLISECONDS.toNanos(1500));
        CloseWork20.click();
    }

    @Then("Закрыть окно пульта ЭО Дамаск 2.0")
    public void closeDamask20() {
        LockSupport.parkNanos(TimeUnit.MILLISECONDS.toNanos(5000));;
        SelenideElement crossDamask = $(By.xpath("//div[@class=\"x-tool x-box-item x-tool-default\"]"));
        crossDamask.should(appear);
        crossDamask.click();
    }
}
