package com.sc.steps.auth;

import com.sc.core.pages.MainPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.text;
import static com.sc.core.constant.Message.DEPERSONALIZE_REQUESTER_TAB_TITLE;
import static com.sc.core.constant.Message.ORDER_GRID_TITLE;

public class NextAfterAuthSteps {

    @Autowired
    private MainPage mainPage;

    @Then("Выйти из интерфейса Некст")
    public void exit() {
        mainPage.exitButton().should(appear).click();
    }

    @Then("Открыть меню пользователя Некст")
    public void openUserMenu() {
        mainPage.userMenuIcon().should(appear);
        mainPage.userMenu().click();
    }

    @Then("Нажать кнопку открытия пульта ЭО Некст после авторизации")
    public void openDamaskMenu() {
        mainPage.eqIcon().should(appear).click();
    }

    @Then("Закрыть окно пульта ЭО Дамаск Некст")
    public void closeDamaskMenu() {
        mainPage.eqCloseMenuButton().should(appear).click();
    }

    @Then("Проверить номер окна в выпадающем меню Дамаск Некст: {string}")
    public void dropdownDamaskMenu(String window) {
        mainPage.eqWindowHeader().shouldHave(text(window));
    }

    @Then("Проверить роль в меню пользователя Некст: {string}")
    public void checkRole(String role) {
        mainPage.roleLabel().shouldHave(text(role));
    }

    @Then("Проверить МФЦ в меню пользователя Некст: {string}")
    public void checkMfc(String role) {
        mainPage.mfcLabel().shouldHave(text(role));
    }

    @Then("Проверить ФИО в хедере Некст: {string}")
    public void checkDisplayName(String role) {
        mainPage.displayNameLabel().should(appear).shouldHave(text(role));
    }

    @Then("Проверить, что пользователь на странице грида заявлений Некст")
    public void GridStatements() {
        mainPage.pageTitle().shouldHave(text(ORDER_GRID_TITLE));
    }

    @Then("Проверить, что элемент Пульт ЭО Некст не отображается на странице")
    public void notIconDamaskNext() {
        LockSupport.parkNanos(TimeUnit.MILLISECONDS.toNanos(1000));
        Assert.assertFalse(mainPage.eqIcon().isDisplayed());
    }

    @Then("Проверить отображение раздела Обезличивание заявителей")
    public void checkGridDepersonalizedRequester() {
        mainPage.activeTab().should(appear).shouldHave(text(DEPERSONALIZE_REQUESTER_TAB_TITLE));
    }
}
