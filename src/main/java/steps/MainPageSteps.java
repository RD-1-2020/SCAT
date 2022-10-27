package steps;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.*;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selectors.shadowCss;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainPageSteps {

    @Given("Перейти на урл {string}")
    public void openUrl(String url) {
        open(url);
    }

    @Then("Ввести СНИЛС {string} и пароль {string} и нажать кнопку Войти")
    public void enterAs(String snils, String password) {
        sleep(5000);
        $(By.name("snils")).sendKeys(snils);
        $(By.name("password")).sendKeys(password);
        $(By.xpath("//button[text()=' Войти ']")).click();
    }
    @Then("Открыть меню юзера")
    public void openUserMenu() {
        $(By.xpath("//span[@class='dt-icon dt-icon-user']")).should(appear);
        $(By.xpath("//div[@class='user-menu dropdown']//a[@class='dropdown-toggle']")).click();
    }
    @Then("Проверить роль в меню пользователя: {string}")
    public void difineRole(String role) {
        $(By.xpath("//div[@class='user-dropdown-menu dropdown-menu show']//div [1]//div//span")).shouldHave(text(role));
    }
    @Then("Проверить МФЦ в меню пользователя: {string}")
    public void difineMFC(String role) {
        $(By.xpath("//div[@class='user-dropdown-menu dropdown-menu show']//div [2]//div//span")).shouldHave(text(role));
    }
    @Then("Проверить ФИО в хедере Некст: {string}")
    public void difineFIO(String role) {
        $(By.xpath("//a[@class='dropdown-toggle']")).shouldHave(text(role));
    }

    @Then("Проверяем, что пользователь на странице грида заявлений:{string}")
    public void GridStatements(String text){
       $(By.xpath("//div/h2")).shouldHave(text(text));
    }

    @Then("Выйти")
    public void Exit(){
        $(By.xpath("//div[@class='user-dropdown-menu dropdown-menu show']//a[@class='line']")).should(appear);
        $(By.xpath("//div[@class='user-dropdown-menu dropdown-menu show']//a[@class='line']")).click();
    }

    @Then("Закрытие окна")
    public void CloseWindow(){
        closeWebDriver();
    }
    @Then("Пауза")
    public void Pause() {
        sleep(1000000);
    }


}

