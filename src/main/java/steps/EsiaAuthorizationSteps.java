package steps;

import com.codeborne.selenide.SelenideElement;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;


public class EsiaAuthorizationSteps {


    @Then("Нажать на гипертекст 'Войти с помощью ЕСИА'")
    public void ClickHypertext() {
        sleep(1000);
        $(By.xpath("//div[@class='esia-login']/a")).should(appear);
        $(By.xpath("//div[@class='esia-login']/a")).click();
    }

    @Then("Ввести номер СНИЛС ЕСИА {string} и пароль ЕСИА {string} и нажать кнопку Войти")
    public void EsiaSnilsPassword(String numberSnils, String password) {
        sleep(1000);
        $(By.xpath("//input[@id=\"login\"]")).sendKeys(numberSnils);
        $(By.xpath("//input[@id=\"password\"]")).sendKeys(password);
        $(By.xpath("//button[text()=' Войти ']")).should(appear).click();
        sleep(1000);
    }

    @Then("Проверить отображение текста 'Пользователь заблокирован администратором'")
    public void BlockUserPage() {
        $(By.xpath("//h1")).shouldHave(text("Пользователь заблокирован администратором"));
    }

    @Then("Нажать кнопку 'На главную'")
    public void MainPage() {
        $(By.xpath("//a[@class='auth_main']")).should(appear).click();
        sleep(5000);
    }

    @Then("Нажать на кнопку 'Назад'")
    public void BackButtonClick() {
        $(By.xpath("//button[@class='btn btn-default']")).click();
    }

    @Then("Проверить отображение текста 'Пользователь в системе не зарегистрирован'")
    public void UserNotRegistered() {
        $(By.xpath("//h1")).shouldHave(text("Пользователь в системе не зарегистрирован"));
    }

    @Then("Проверить выбор филиала МФЦ при авторизации ЕСИА: {string}")
    public void checkFilial(String filial) {
        SelenideElement shadowHostFilial = $(By.xpath("(//dt-combobox)[1]"));
        SearchContext searchContext = shadowHostFilial.getShadowRoot();
        SelenideElement input = $(searchContext.findElement(By.cssSelector(".dt-select-value-text")));
        input.shouldHave(text(filial));
    }

    @Then("Проверить выбор роли МФЦ при авторизации ЕСИА: {string}")
    public void checkRole(String role) {
        SelenideElement shadowHostRole = $(By.xpath("(//dt-combobox)[2]"));
        SearchContext searchContext = shadowHostRole.getShadowRoot();
        SelenideElement input = $(searchContext.findElement(By.cssSelector(".dt-select-value-text")));
        input.shouldHave(text(role));
      }
    }














