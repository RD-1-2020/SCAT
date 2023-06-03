package com.sc.steps.auth;

import com.sc.core.pages.auth.AuthorizationPage;
import com.sc.core.service.element.DropdownService;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.open;
import static com.sc.core.constant.Message.LOGIN_OR_PASS_INCORRECT_ERROR;
import static com.sc.core.constant.Message.USER_FIRED_ALERT;
import static com.sc.core.constant.UrlConstant.NEXT_UI_URL_SUFFIX;

public class AuthorizationSteps {
    private final static Logger logger = LoggerFactory.getLogger(AuthorizationSteps.class);

    @Autowired
    private AuthorizationPage authorizationPage;

    @Autowired
    private DropdownService dropdownService;

    @Value("${ais.base.url:http://192.168.141.185:8080/cpgu/}")
    private String baseUrl;

    @Value("${universal.user.snils:00000000000}")
    private String universalSnils;

    @Value("${universal.user.password:123}")
    private String universalPassword;

    @Value("${universal.user.test.mfc:Тестовый МФЦ}")
    private String testMfcDisplayName;

    @Given("Открыта АИС МФЦ")
    public void openUrl() {
        open(baseUrl);
    }

    @Given("Открыт интерфейс NEXT")
    public void goToNextUi() {
        open(baseUrl + NEXT_UI_URL_SUFFIX);
    }

    @Given("Авторизован под {string}")
    public void operatorAuth(String roleTitle) {
        authorizationPage.loginInput().sendKeys(universalSnils);
        authorizationPage.passwordInput().sendKeys(universalPassword);
        authorizationPage.loginButton().click();

        dropdownService.selectValueIntoDropdown(authorizationPage.filialDropdown(), testMfcDisplayName);
        dropdownService.selectValueIntoDropdown(authorizationPage.roleDropdown(), roleTitle);

//        try {
//            dropdownService.selectValueIntoDropdown(authorizationPage.damaskWindowDropdown(), DAMASK_NO_WINDOW_TEXT);
//        } catch (Throwable exception) {
//            logger.debug("Damask window dropdown not find, but may be it's normal", exception);
//        }

        authorizationPage.nextButton().click();
    }

    @And("Ввести СНИЛС {string} и пароль {string} и нажать кнопку Войти")
    public void enterAs(String snils, String password) {
        LockSupport.parkNanos(TimeUnit.MILLISECONDS.toNanos(11000));
        authorizationPage.loginInput().sendKeys(snils);
        authorizationPage.passwordInput().sendKeys(password);
        authorizationPage.loginButton().click();
    }

    @Then("Выбрать филиал МФЦ при авторизации: {string}")
    public void chooseFilial(String filial) {
        dropdownService.selectValueIntoDropdown(authorizationPage.filialDropdown(), filial);
    }

    @Then("Выбрать роль при авторизации: {string}")
    public void chooseRole(String role) {
        dropdownService.selectValueIntoDropdown(authorizationPage.roleDropdown(), role);
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
        dropdownService.selectValueIntoDropdown(authorizationPage.damaskWindowDropdown(), window);
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

