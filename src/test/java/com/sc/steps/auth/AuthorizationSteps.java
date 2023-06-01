package com.sc.steps.auth;

import com.sc.core.pages.AuthorizationPage;
import com.sc.core.service.ActionService;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.open;
import static com.sc.core.constant.Message.LOGIN_OR_PASS_INCORRECT_ERROR;
import static com.sc.core.constant.Message.USER_FIRED_ALERT;

public class AuthorizationSteps {

    @Autowired
    private AuthorizationPage authorizationPage;

    @Autowired
    private ActionService actionService;

    @Given("Перейти на урл")
    public void openUrl() {
        open("https://next.smart-consulting.ru/cpgu");
    }

    @Then("Ввести СНИЛС {string} и пароль {string} и нажать кнопку Войти")
    public void enterAs(String snils, String password) {
        LockSupport.parkNanos(TimeUnit.MILLISECONDS.toNanos(11000));;
        authorizationPage.loginInput().sendKeys(snils);
        authorizationPage.passwordInput().sendKeys(password);
        authorizationPage.loginButton().click();
    }

    @Then("Выбрать филиал МФЦ при авторизации: {string}")
    public void chooseFilial(String filial) {
        actionService.selectValueIntoDropdown(authorizationPage.filialDropdown(), filial);
    }

    @Then("Выбрать роль при авторизации: {string}")
    public void chooseRole(String role) {
        actionService.selectValueIntoDropdown(authorizationPage.roleDropdown(), role);
    }

    @Then("Нажать Продолжить при авторизации")
    public void submitRoleAndMfc() {
        authorizationPage.nextButton().click();
    }

    @Then("Ввести в поле Введите номер линии колл-центра SMARTCALL значение {string}")
    public void enterAs(String number) {
        authorizationPage.smartcallLineInput().sendKeys(number);
    }

    @Then("Выбрать окно Дамаск при авторизации: {string}")
    public void chooseWindow(String window) {
        actionService.selectValueIntoDropdown(authorizationPage.damaskWindowDropdown(), window);
    }

    @Then("Проверить текст сообщения Пользователь уволен. В авторизации отказано.")
    public void textDismissed() {
        authorizationPage.alertMessageLabel().shouldHave(text(USER_FIRED_ALERT));
    }

    @Then("Нажать кнопку Войти при авторизации")
    public void enter() {
        authorizationPage.loginButton().should(appear);
        authorizationPage.loginButton().click();
    }

    @Then("Проверить текст сообщения Неверный СНИЛС или пароль")
    public void textData() {
        authorizationPage.alertMessageLabel().shouldHave(text(LOGIN_OR_PASS_INCORRECT_ERROR));
    }

    @Then("Ввести СНИЛС {string} и нажать кнопку Войти")
    public void inputSNILS(String snils) {
        authorizationPage.loginInput().sendKeys(snils);
        authorizationPage.loginButton().click();
    }

    @Then("Ввести пароль {string} и нажать кнопку Войти")
    public void inputPass(String password) {
        authorizationPage.passwordInput().sendKeys(password);
        authorizationPage.loginButton().click();
    }

    @Then("Проверить отображение первой страницы авторизации")
    public void authorizationPage() {
        authorizationPage.loginInput().should(appear);
        authorizationPage.passwordInput().should(appear);
    }
}

