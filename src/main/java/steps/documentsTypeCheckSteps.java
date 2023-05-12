package steps;

import com.codeborne.selenide.SelenideElement;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.cucumber.datatable.DataTable;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.junit.Assert;

import java.util.List;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class documentsTypeCheckSteps {

        @Given("МЕНЮ ВЫБОРА ГРИДА: Открыть выпадающее меню")
    public void openDropdownGrid() {
        $(By.xpath("//div[@class='dropdown-toggle']")).click();
    }

    @Then("МЕНЮ ВЫБОРА ГРИДА: Выбрать грид Заявители")
    public void openGridApplicants() {
        $(By.xpath("//li[@class=\"dropdown-item\"]//p[text()='Заявители']")).click();
    }

    @Then("ГРИД ЗАЯВИТЕЛЕЙ: Кликнуть кнопку создать заявителя")
    public void createApplicant() {
        $(By.xpath("//div[@class='dt-grid']//div[@class='button-container']//button[@class='btn btn-primary']")).click();
    }

    @Then("СОЗДАНИЕ КАРТОЧКИ ЗАЯВИТЕЛЯ: Выбрать радиобатон Физическое лицо")
    public void selectIndividualRadioBaton() {
        $(By.xpath("//label[@class='control-label dt-radio mb-2'][1]")).click();
    }

    @Then("СОЗДАНИЕ КАРТОЧКИ ЗАЯВИТЕЛЯ: Выбрать радиобатон Индивидуальный предприниматель")
    public void selectIndividualEntrepreneurRadioBaton() {
        $(By.xpath("//label[@class='control-label dt-radio mb-2'][2]")).click();
    }

    @Then("СОЗДАНИЕ КАРТОЧКИ ЗАЯВИТЕЛЯ: Кликнуть кноку Продолжить")
    public void clickButtonContinueCreateApplicantCard() {
        $(By.xpath("//div[@class='modal-footer']//button[@class='btn btn-primary']")).click();
    }

    @Then("КАРТОЧКА ЗАЯВИТЕЛЯ: Выбрать Тип документа в выпадающем списке: {string}")
    public void openDropdownTypeDocumentCard(String typeDocument) {
        SelenideElement shadowTypeDocument = $(By.xpath("(//dt-combobox)[3]"));
        SearchContext searchContext = shadowTypeDocument.getShadowRoot();
        SelenideElement input = $(searchContext.findElement(By.cssSelector(".dt-select")));
        input.click();
        $(By.xpath(String.format("//div[@class='dt-select-options dt-scroll-container']//div[text()='%s']", typeDocument))).click();

    }

    @Then("КАРТОЧКА ЗАЯВИТЕЛЯ: Заполнить серию, номер и проверить появление ошибок валидации поля")
    public void checkSeriesNumber (DataTable arg){
        List<List<String>> table = arg.asLists(String.class);

        SelenideElement shadowTypeDocument = $(By.xpath("(//dt-combobox)[3]"));
        SearchContext searchContext = shadowTypeDocument.getShadowRoot();
        SelenideElement input = $(searchContext.findElement(By.cssSelector(".dt-select")));
        SelenideElement series = $(By.xpath("//input[@id='passportSeries']"));
        SelenideElement number =  $(By.xpath("//input[@id='passportNo']"));
        SelenideElement clickMiss = $(By.xpath("//h4[@class='subform-header-title']"));

        $(By.xpath("//input[@id='passportDepCode']")).scrollIntoView(false);
        for (int i=0; i<table.size(); i++) {
            input.click();
            $(By.xpath(String.format("//div[@class='dt-select-options dt-scroll-container']//div[text()='%s']", table.get(i).get(0) + ""))).click();
            series.sendKeys(table.get(i).get(1) + "");
            number.sendKeys(table.get(i).get(2) + "");
            clickMiss.click();
            sleep(1000);
            Assert.assertFalse($(By.xpath("//div[@class='d-flex flex-wrap-grow-2 two-control-container']//div[@class='invalid-feedback']")).isDisplayed());
            Assert.assertFalse($(By.xpath("//div[@class='d-flex flex-wrap-grow-2 two-control-container']//following-sibling::div//div//div")).isDisplayed());
            series.clear();
            number.clear();
        }
    }

    @Then("КАРТОЧКА ЗАЯВИТЕЛЯ: Заполнить номер и проверить появление ошибок валидации поля")
    public void checkNumber (DataTable arg){
        List<List<String>> table = arg.asLists(String.class);

        SelenideElement shadowTypeDocument = $(By.xpath("(//dt-combobox)[3]"));
        SearchContext searchContext = shadowTypeDocument.getShadowRoot();
        SelenideElement input = $(searchContext.findElement(By.cssSelector(".dt-select")));
        SelenideElement number =  $(By.xpath("//input[@id='passportNo']"));
        SelenideElement clickMiss = $(By.xpath("//h4[@class='subform-header-title']"));

        $(By.xpath("//input[@id='passportDepCode']")).scrollIntoView(false);
        for (int i=0; i<table.size(); i++) {
            input.click();
            $(By.xpath(String.format("//div[@class='dt-select-options dt-scroll-container']//div[text()='%s']", table.get(i).get(0) + ""))).click();
            number.sendKeys(table.get(i).get(1) + "");
            clickMiss.click();
            sleep(1000);
            Assert.assertFalse($(By.xpath("//div[@class='one-of-two-form-control ng-dirty ng-touched mr-3 ng-invalid']//div[@class='invalid-feedback']")).isDisplayed());
            number.clear();
        }
    }

    @Then("КАРТОЧКА ЗАЯВИТЕЛЯ: Заполнить серию, номер и проверить на уникальность")
    public void checkSeriesNumberUniqueness (DataTable arg){
        List<List<String>> table = arg.asLists(String.class);

        SelenideElement shadowTypeDocument = $(By.xpath("(//dt-combobox)[3]"));
        SearchContext searchContext = shadowTypeDocument.getShadowRoot();
        SelenideElement input = $(searchContext.findElement(By.cssSelector(".dt-select")));
        SelenideElement series = $(By.xpath("//input[@id='passportSeries']"));
        SelenideElement number =  $(By.xpath("//input[@id='passportNo']"));
        SelenideElement clickMiss = $(By.xpath("//h4[@class='subform-header-title']"));

        $(By.xpath("//input[@id='passportDepCode']")).scrollIntoView(false);
        for (int i=0; i<table.size(); i++) {
            input.click();
            $(By.xpath(String.format("//div[@class='dt-select-options dt-scroll-container']//div[text()='%s']", table.get(i).get(0) + ""))).click();
            series.sendKeys(table.get(i).get(1) + "");
            number.sendKeys(table.get(i).get(2) + "");
            clickMiss.click();
            sleep(1000);
            $(By.xpath("//div[@class='d-flex flex-wrap-grow-2 two-control-container']//div[3]")).should(appear).shouldHave(text("Заявитель с такими данными документа, удостоверяющего личность уже существует в системе!"));
            series.clear();
            number.clear();
        }
    }

    @Then("КАРТОЧКА ЗАЯВИТЕЛЯ: Заполнить номер и проверить на уникальность")
    public void checkNumberUniqueness (DataTable arg){
        List<List<String>> table = arg.asLists(String.class);

        SelenideElement shadowTypeDocument = $(By.xpath("(//dt-combobox)[3]"));
        SearchContext searchContext = shadowTypeDocument.getShadowRoot();
        SelenideElement input = $(searchContext.findElement(By.cssSelector(".dt-select")));
        SelenideElement number =  $(By.xpath("//input[@id='passportNo']"));
        SelenideElement clickMiss = $(By.xpath("//h4[@class='subform-header-title']"));

        $(By.xpath("//input[@id='passportDepCode']")).scrollIntoView(false);
        for (int i=0; i<table.size(); i++) {
            input.click();
            $(By.xpath(String.format("//div[@class='dt-select-options dt-scroll-container']//div[text()='%s']", table.get(i).get(0) + ""))).click();
            number.sendKeys(table.get(i).get(1) + "");
            clickMiss.click();
            sleep(1000);
            $(By.xpath("//div[@class='d-flex flex-wrap-grow-2 two-control-container']//div[3]")).should(appear).shouldHave(text("Заявитель с такими данными документа, удостоверяющего личность уже существует в системе!"));
            number.clear();
        }
    }

    @Then("КАРТОЧКА ЗАЯВИТЕЛЯ: Убрать значение в поле Тип документов")
    public void deleteTypeDocument() {
        $(By.xpath("//input[@id='passportDepCode']")).scrollIntoView(false);
        SelenideElement shadowTypeDocument = $(By.xpath("(//dt-combobox)[3]"));
        SearchContext searchContext = shadowTypeDocument.getShadowRoot();
        SelenideElement input = $(searchContext.findElement(By.cssSelector(".dt-select-clear")));
        input.click();
    }

    @Then("КАРТОЧКА ЗАЯВИТЕЛЯ: Проверить отображение подсказки 'Это обязательное поле' у пустого поля Тип документа")
    public void showHintTypeDocument() {
        $(By.xpath("//div[@class='invalid-feedback']")).shouldHave(text("Это обязательное поле"));
    }


    @Then("КАРТОЧКА ЗАЯВИТЕЛЯ: Проверить отображение подсказки 'Это обязательное поле' у пустых полей Серия и Номер") //not work
    public void showHintNumber(DataTable arg) {
        List<List<String>> table = arg.asLists(String.class);
        $(By.xpath("//input[@id='passportDepCode']")).scrollIntoView(false);
        SelenideElement shadowTypeDocument = $(By.xpath("(//dt-combobox)[3]"));
        SearchContext searchContext = shadowTypeDocument.getShadowRoot();
        SelenideElement input = $(searchContext.findElement(By.cssSelector(".dt-select")));
        $(By.xpath("//input[@id='passportSeries']")).click();
        $(By.xpath("//h4[@class='subform-header-title']")).click();
        $(By.xpath("//input[@id='passportNo']")).click();
        $(By.xpath("//h4[@class='subform-header-title']")).click();

        for (int i=0; i<table.size(); i++) {
            input.click();
            $(By.xpath(String.format("//div[@class='dt-select-options dt-scroll-container']//div[text()='%s']", table.get(i).get(0) + ""))).click();
            $(By.xpath("//div[@class='d-flex flex-wrap-grow-2 two-control-container']//div[@class='invalid-feedback']//div")).shouldHave(text("Это обязательное поле"));
            sleep(1000);
            $(By.xpath("//div[@class='d-flex flex-wrap-grow-2 two-control-container']//following-sibling::div//div//div")).shouldHave(text("Это обязательное поле"));
            sleep(1000
            );
        }

    }

    @Then("КАРТОЧКА ЗАЯВИТЕЛЯ: проверяем много разных подсказак валидации") //not work
    public void showHintSeries(DataTable arg) {
        List<List<String>> table = arg.asLists(String.class);

        SelenideElement shadowTypeDocument = $(By.xpath("(//dt-combobox)[3]"));
        SearchContext searchContext = shadowTypeDocument.getShadowRoot();
        SelenideElement input = $(searchContext.findElement(By.cssSelector(".dt-select")));
        SelenideElement series = $(By.xpath("//input[@id='passportSeries']"));
        SelenideElement number =  $(By.xpath("//input[@id='passportNo']"));
        SelenideElement clickMiss = $(By.xpath("//h4[@class='subform-header-title']"));

        $(By.xpath("//input[@id='passportDepCode']")).scrollIntoView(false);

        clickMiss.click();
        for (int i=0; i<table.size(); i++) {
            input.click();
            $(By.xpath(String.format("//div[@class='dt-select-options dt-scroll-container']//div[text()='%s']", table.get(i).get(0) + ""))).click();
            $(By.xpath("//div[@class='d-flex flex-wrap-grow-2 two-control-container']//div[@class='invalid-feedback']")).shouldHave(text("Это обязательное поле"));
            $(By.xpath("//div[@class='d-flex flex-wrap-grow-2 two-control-container']//following-sibling::div")).shouldHave(text("Это обязательное поле"));}
    }


}

