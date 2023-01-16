package steps;

import com.codeborne.selenide.SelenideElement;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;

import java.time.Duration;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selectors.shadowCss;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import org.junit.Assert;
public class MainPageSteps {

    @Given("Перейти на урл")
    public void openUrl() {
        open("https://next.smart-consulting.ru/cpgu/digit-mfc-ui");
    }

    @Then("Ввести СНИЛС {string} и пароль {string} и нажать кнопку Войти")
    public void enterAs(String snils, String password) {
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
        $(By.xpath(String.format("//div[@class='dt-select-options dt-scroll-container']//div[text()='%s']", filial))).should(appear).click();
    }

    @Then("Выбрать роль при авторизации: {string}")
    public void chooseRole(String role) {
        SelenideElement shadowHostRole = $(By.xpath("(//dt-combobox)[2]"));
        SearchContext searchContext = shadowHostRole.getShadowRoot();
        SelenideElement input = $(searchContext.findElement(By.cssSelector(".dt-select-value-text")));
        input.click();
        $(By.xpath(String.format("//div[@class='dt-select-options dt-scroll-container']//div[text()='%s']", role))).should(appear).click();
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

    @Then("Открыть меню пользователя Некст")
    public void openUserMenu() {
        $(By.xpath("//span[@class='dt-icon dt-icon-user']")).should(appear);
        $(By.xpath("//div[@class='user-menu dropdown']//a[@class='dropdown-toggle']")).click();
    }

    @Then("Проверить роль в меню пользователя Некст: {string}")
    public void difineRole(String role) {
        $(By.xpath("//div[@class='user-dropdown-menu dropdown-menu show']//div [1]//div//span")).shouldHave(text(role));
    }

    @Then("Проверить МФЦ в меню пользователя Некст: {string}")
    public void difineMFC(String role) {
        $(By.xpath("//div[@class='user-dropdown-menu dropdown-menu show']//div [2]//div//span")).shouldHave(text(role));
    }

    @Then("Проверить ФИО в хедере Некст: {string}")
    public void difineFIO(String role) {
        $(By.xpath("//a[@class='dropdown-toggle']")).should(appear).shouldHave(text(role));
    }

    @Then("Проверить, что пользователь на странице грида заявлений Некст")
    public void GridStatements(){
       $(By.xpath("//div/h2")).shouldHave(text("Каталог заявлений"));
    }

    @Then("Выйти из интерфейса Некст")
    public void Exit(){
        $(By.xpath("//div[@class='user-dropdown-menu dropdown-menu show']//a[@class='line']")).should(appear);
        $(By.xpath("//div[@class='user-dropdown-menu dropdown-menu show']//a[@class='line']")).click();
    }

    @Then("Закрытие окно браузера")
    public void CloseWindow(){
        closeWebDriver();
    }

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
        $(By.xpath("//span[@id='headerPanel_header_hd-textEl']//span[4]")).click();
    }

    @Then("Проверить номер линии {string}")
    public void testLine(String line) {
        SelenideElement numberLine = $(By.xpath("//label[@class='x-component lineNumber-button x-box-item x-component-default']"));
        numberLine.shouldHave(text(line));
    }

    @Then("Проверить ФИО в хедере 3.0 {string}")
    public void LastName3(String name) {
        sleep(2000);
        SelenideElement lastName = $(By.xpath("//span[@class='page-title__user decorated mat-menu-trigger']"));
        lastName.should(visible, Duration.ofSeconds(10)).shouldHave(text(name));
    }
    @Then("Проверить роль в хедере 3.0: {string}")
    public void RoleHeader30(String role) {
        SelenideElement role1 = $(By.xpath("//div[@class='navigation']//a[@class='page-title__user decorated']"));
        role1.should(visible, Duration.ofSeconds(10)).shouldHave(text(role));
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

    @Then("Проверить текст сообщения Пользователь уволен. В авторизации отказано.")
    public void textDismissed() {
        SelenideElement alert = $(By.xpath("//div[@class='alert alert-danger']"));
        alert.shouldHave(text("Пользователь уволен. В авторизации отказано."));
    }

    @Then("Нажать кнопку Войти при авторизации")
    public void enter() {
        $(By.xpath("//button[text()=' Войти ']")).should(appear);
        $(By.xpath("//button[text()=' Войти ']")).click();
    }

    @Then("Проверить текст сообщения Неверный СНИЛС или пароль")
    public void textData() {
        SelenideElement notData = $(By.xpath("//div[@class='alert alert-danger']"));
        notData.shouldHave(text("Неверный СНИЛС или пароль"));
    }

    @Then("Ввести СНИЛС {string} и нажать кнопку Войти")
    public void inputSNILS(String snils) {
        $(By.name("snils")).sendKeys(snils);
        $(By.xpath("//button[text()=' Войти ']")).click();
    }

    @Then("Ввести пароль {string} и нажать кнопку Войти")
    public void inputPass(String password) {
        $(By.name("password")).sendKeys(password);
        $(By.xpath("//button[text()=' Войти ']")).click();
    }

    @Then("Нажать кнопку открытия пульта ЭО Некст после авторизации")
    public void openDamaskMenu() {
        SelenideElement iconDamask = $(By.xpath("//div[@class=\"dt-navbar-container\"]//svg-icon [1]"));
        iconDamask.should(appear);
        iconDamask.click();
    }

    @Then("Проверить номер окна в выпадающем меню Дамаск Некст: {string}")
    public void dropdownDamaskMenu(String role) {
        $(By.xpath("//div[@class=\"dt-navbar-container\"]//div[@class=\"modal-header\"]//h1")).shouldHave(text(role));
    }

    @Then("Нажать кнопку открытия пульта  ЭО 3.0 после авторизации")
    public void openDamaskMenu30() {
        sleep(1000);
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
        sleep(1000);
        SelenideElement Pult20= $(By.xpath("//div[@class=\"x-btn x-box-item x-btn-default-small x-noicon x-btn-noicon x-btn-default-small-noicon\"]"));
        Pult20.should(visible, Duration.ofSeconds(10));
        Pult20.click();
    }

    @Then("Выбрать окно Дамаск при авторизации: {string}")
    public void chooseWindow(String filial) {
        SelenideElement shadowHostFilial = $(By.xpath("(//dt-combobox)[3]"));
        SearchContext searchContext = shadowHostFilial.getShadowRoot();
        SelenideElement input = $(searchContext.findElement(By.cssSelector(".dt-select-value-text")));
        input.click();
        $(By.xpath(String.format("//div[@class='dt-select-options dt-scroll-container']//div[text()='%s']", filial))).click();
    }

    @Then("Закрыть окно пульта ЭО Дамаск Некст")
    public void closeDamaskMenu() {
        SelenideElement crossDamask = $(By.xpath("//button[@class=\"close\"]"));
        crossDamask.should(appear);
        crossDamask.click();}

    @Then("Проверить, что элемент Пульт ЭО Некст не отображается на странице")
    public void notIconDamaskNext() {
        sleep(1000);
        Assert.assertFalse($(By.xpath("//app-queue-console")).isDisplayed());
    }

    @Then("Проверить, что элемент Пульт ЭО 2.0 не отображается на странице")
    public void notIconDamask20() {
        sleep(1000);
        Assert.assertFalse($(By.xpath("//div[@class=\"x-btn x-box-item x-btn-default-small x-noicon x-btn-noicon x-btn-default-small-noicon\"]")).isDisplayed());
    }

    @Then("Проверить, что элемент Пульт ЭО 3.0 не отображается на странице")
    public void notIconDamask30() {
        sleep(1000);
        Assert.assertFalse($(By.xpath("//div[@class=\"nav-item nav-icon mat-menu-trigger ng-star-inserted\"]")).isDisplayed());
    }
    @Then("Нажать кнопку Начать работу пульта ЭО 2.0 после авторизации")
    public void clickButtonStartWork20() {
        SelenideElement StartWork20 = $(By.xpath( "//div[@class=\"x-btn x-btn-default-small-action-button x-box-item x-btn-default-small x-noicon x-btn-noicon x-btn-default-small-noicon\"]"));
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
        sleep(1500);
        CloseWork20.click();
    }

    @Then("Закрыть окно пульта ЭО Дамаск 2.0")
    public void closeDamask20() {
        SelenideElement crossDamask = $(By.xpath("//div[@class=\"x-tool x-box-item x-tool-default\"]"));
        crossDamask.should(appear);
        crossDamask.click();}

}

