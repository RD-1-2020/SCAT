package com.sc.steps.auth;

import com.sc.core.pages.auth.AuthorizationPage;
import com.sc.core.pages.auth.EsiaPage;
import io.cucumber.java.en.Then;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.text;
import static com.sc.core.constant.Message.NOT_REGISTERED_ERROR;
import static com.sc.core.constant.Message.USER_HAS_BLOCKED_ERROR;


public class EsiaAuthorizationSteps {

    @Autowired
    private AuthorizationPage authorizationPage;

    @Autowired
    private EsiaPage esiaPage;

    @Then("Нажать на гипертекст 'Войти с помощью ЕСИА'")
    public void esiaOpen() {
        LockSupport.parkNanos(TimeUnit.MILLISECONDS.toNanos(1000));
        authorizationPage.esiaLoginLink().should(appear).click();
    }

    @Then("Ввести номер СНИЛС ЕСИА {string} и пароль ЕСИА {string} и нажать кнопку Войти")
    public void esiaAuth(String snils, String password) {
        LockSupport.parkNanos(TimeUnit.MILLISECONDS.toNanos(1000));
        esiaPage.loginInput().sendKeys(snils);
        esiaPage.passwordInput().sendKeys(password);
        esiaPage.loginButton().should(appear).click();
        LockSupport.parkNanos(TimeUnit.MILLISECONDS.toNanos(1000));
    }

    @Then("Проверить отображение текста 'Пользователь заблокирован администратором'")
    public void BlockUserPage() {
        authorizationPage.errorMessageLabel().shouldHave(text(USER_HAS_BLOCKED_ERROR));
    }

    @Then("Нажать кнопку 'На главную'")
    public void MainPage() {
        esiaPage.mainPageButton().should(appear).click();
        LockSupport.parkNanos(TimeUnit.MILLISECONDS.toNanos(5000));;
    }

    @Then("Нажать на кнопку 'Назад'")
    public void BackButtonClick() {
        authorizationPage.backButton().click();
    }

    @Then("Проверить отображение текста 'Пользователь в системе не зарегистрирован'")
    public void UserNotRegistered() {
        authorizationPage.errorMessageLabel().shouldHave(text(NOT_REGISTERED_ERROR));
    }

    @Then("Проверить выбор филиала МФЦ при авторизации ЕСИА: {string}")
    public void checkFilial(String filial) {
        authorizationPage.filialDropdown().shouldHave(text(filial));
    }

    @Then("Проверить выбор роли МФЦ при авторизации ЕСИА: {string}")
    public void checkRole(String role) {
        authorizationPage.roleDropdown().shouldHave(text(role));
    }
}














