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

    @Then("Выбрать филиал МФЦ при авторизации: {string}")
    public void chooseFilial(String filial) {
        SelenideElement shadowHostFilial = $(By.xpath("(//dt-combobox)[1]"));
        SearchContext searchContext = shadowHostFilial.getShadowRoot();
        SelenideElement input = $(searchContext.findElement(By.cssSelector(".dt-select-value-text")));
        input.click();
        $(By.xpath(String.format("//div[@class='dt-select-options dt-scroll-container']//div[text()='%s']", filial))).click();
    }

    @Then("Выбрать роль при авторизации: {string}")
    public void chooseRole(String role) {
        SelenideElement shadowHostRole = $(By.xpath("(//dt-combobox)[2]"));
        SearchContext searchContext = shadowHostRole.getShadowRoot();
        SelenideElement input = $(searchContext.findElement(By.cssSelector(".dt-select-value-text")));
        input.click();
        $(By.xpath(String.format("//div[@class='dt-select-options dt-scroll-container']//div[text()='%s']", role))).click();
    }

    @Then("Нажать Продолжить при авторизации")
    public void cont() {
        $(By.xpath("//button[text()=' Продолжить ']")).click();
    }

    @Then("Ввести в поле Введите номер линии колл-центра SMARTCALL значение {string}")
    public void enterAs(String number) {
        SelenideElement numberCall = $(By.xpath("//input[@class='form-control ng-untouched ng-pristine ng-valid']"));
        numberCall.sendKeys(number);
    }

    @Then("Проверить ФИО в хедере 2.0 {string}")
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
    @Then("Проверить МФЦ в хедере 2.0: {string}")
    public void difineMFCinHeader(String role) {
        SelenideElement mfc = $(By.xpath("//span[@id='auth']"));
        mfc.shouldHave(text(role));
    }

    @Then("Проверить роль в хедере 2.0: {string}")
    public void difineRoleHeader(String role) {
        SelenideElement role1 = $(By.xpath("//span[@id='auth']"));
        role1.shouldHave(text(role));
    }
    @Then("Выйти из интерфейса 2.0")
    public void Exit20() {
        SelenideElement exit = $(By.xpath("//span[@id='headerPanel_header_hd-textEl']//span[4]"));
        exit.click();
    }
    @Then("Закрыть браузер")
    public void closeUrl() {
        closeWebDriver();
    }

    @Then("Проверить ФИО в хедере 3.0 {string}")
    public void LastName3(String name) {
        sleep(2000);
        SelenideElement lastName = $(By.xpath("//span[@class='page-title__user decorated mat-menu-trigger']"));
        lastName.shouldHave(text(name));
    }
    @Then("Проверить роль в хедере 3.0: {string}")
    public void RoleHeader(String role) {
        SelenideElement role1 = $(By.xpath("//div[@class='navigation']//a[@class='page-title__user decorated']"));
        role1.shouldHave(text(role));
    }

    @Then("Проверить МФЦ в хедере 3.0: {string}")
    public void MFCinHeader(String role) {
        SelenideElement mfc = $(By.xpath("//div[@class='navigation']//a[@class='page-title__user decorated ng-star-inserted']"));
        mfc.shouldHave(text(role));
    }

    @Then("Проверить текст сообщения Пользователь уволен. В авторизации отказано.")
    public void textDismissed() {
        SelenideElement alert = $(By.xpath("//div[@class='alert alert-danger']"));
        alert.shouldHave(text("Пользователь уволен. В авторизации отказано."));
    }

    @Then("Нажать кнопку Войти при авторизации")
    public void enter() {
        sleep(5000);
        $(By.xpath("//button[text()=' Войти ']")).click();
    }

    @Then("Проверить текст сообщения Неверный СНИЛС или пароль")
    public void textData() {
        SelenideElement notData = $(By.xpath("//div[@class='alert alert-danger']"));
        notData.shouldHave(text("Неверный СНИЛС или пароль"));
    }

    @Then("Ввести СНИЛС {string} и нажать кнопку Войти")
    public void inputSNILS(String snils) {
        sleep(5000);
        $(By.name("snils")).sendKeys(snils);
        $(By.xpath("//button[text()=' Войти ']")).click();
    }

    @Then("Ввести пароль {string} и нажать кнопку Войти")
    public void inputPass(String password) {
        sleep(5000);
        $(By.name("password")).sendKeys(password);
        $(By.xpath("//button[text()=' Войти ']")).click();
    }

}
