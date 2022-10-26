package steps;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.*;

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

    @Then("Выбрать филиал МФЦ: {string}")
    public void chooseFilial(String filial) {
        SelenideElement shadowHostFilial = $(By.xpath("(//dt-combobox)[1]"));
        SearchContext searchContext = shadowHostFilial.getShadowRoot();
        SelenideElement input = $(searchContext.findElement(By.cssSelector(".dt-select-value-text")));
        input.click();
        $(By.xpath(String.format("//div[@class='dt-select-options dt-scroll-container']//div[text()='%s']", filial))).click();
    }

    @Then("Выбрать роль: {string}")
    public void chooseRole(String role) {
        SelenideElement shadowHostRole = $(By.xpath("(//dt-combobox)[2]"));
        SearchContext searchContext = shadowHostRole.getShadowRoot();
        SelenideElement input = $(searchContext.findElement(By.cssSelector(".dt-select-value-text")));
        input.click();
        $(By.xpath(String.format("//div[@class='dt-select-options dt-scroll-container']//div[text()='%s']", role))).click();
    }

    @Then("Нажать Продолжить")
    public void cont() {
        $(By.xpath("//button[@class='text()=' Продолжить ']")).click();
    }

    @Then("Ввести в поле Введите номер линии колл-центра SMARTCALL значение {string}")
    public void enterAs(String number) {
        SelenideElement numberCall = $(By.xpath("//input[@class='form-control ng-untouched ng-pristine ng-valid']"));
        numberCall.sendKeys(number);
    }

    @Then("Проверить Фамилию Имя сотрудника {string}")
    public void testFI(String name) {
        sleep(2000);
        SelenideElement lastName = $(By.xpath("//span[@id='auth-info']"));
        lastName.shouldHave(text(name));
    }

    @Then("Проверить номер линии {string}")
    public void testLine(String line) {
        SelenideElement numberLine = $(By.xpath("//label[@class='x-component lineNumber-button x-box-item x-component-default']"));
        numberLine.shouldHave(text(line));
    }
}
