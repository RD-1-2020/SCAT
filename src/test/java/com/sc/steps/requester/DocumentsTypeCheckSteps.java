package com.sc.steps.requester;

import com.codeborne.selenide.SelenideElement;
import com.sc.core.pages.requester.RequesterCardPage;
import com.sc.core.pages.requester.RequesterGridPage;
import com.sc.core.service.ActionService;
import com.sc.core.service.element.DropdownService;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.text;
import static com.sc.core.constant.Message.REQUESTER_DUL_NOT_UNIQUE_ERROR;
import static com.sc.core.constant.Message.REQUIRED_FIELD_ERROR;

public class DocumentsTypeCheckSteps {

    @Autowired
    private RequesterCardPage requesterCardPage;

    @Autowired
    private RequesterGridPage requesterGridPage;

    @Autowired
    private ActionService actionService;

    @Autowired
    private DropdownService dropdownService;

    @Then("ГРИД ЗАЯВИТЕЛЕЙ: Кликнуть кнопку создать заявителя")
    public void createApplicant() {
        requesterGridPage.createRequesterButton().click();
    }

    @Then("СОЗДАНИЕ КАРТОЧКИ ЗАЯВИТЕЛЯ: Выбрать радиобатон Физическое лицо")
    public void selectIndividualRadioBaton() {
        requesterGridPage.createRequesterDialogFlRadioButton().click();
    }

    @Then("СОЗДАНИЕ КАРТОЧКИ ЗАЯВИТЕЛЯ: Выбрать радиобатон Индивидуальный предприниматель")
    public void selectIndividualEntrepreneurRadioBaton() {
        requesterGridPage.createRequesterDialogIpRadioButton().click();
    }

    @Then("СОЗДАНИЕ КАРТОЧКИ ЗАЯВИТЕЛЯ: Кликнуть кноку Продолжить")
    public void clickButtonContinueCreateApplicantCard() {
        requesterGridPage.createRequesterDialogSubmitButton().click();
    }

    @Then("КАРТОЧКА ЗАЯВИТЕЛЯ: Выбрать Тип документа в выпадающем списке: {string}")
    public void openDropdownTypeDocumentCard(String typeDocument) {
        SelenideElement scrolledDropdown = actionService.scrollToElementInCenter(requesterCardPage.documentTypeDropdown());
        dropdownService.selectValueIntoDropdown(scrolledDropdown, typeDocument);
    }

    @Then("КАРТОЧКА ЗАЯВИТЕЛЯ: Заполнить серию, номер и проверить появление ошибок валидации поля")
    public void checkSeriesNumber(DataTable arg) {
        List<List<String>> table = arg.asLists(String.class);

        
        SelenideElement documentTypeDropdown = actionService.scrollToElementInCenter(requesterCardPage.documentTypeDropdown());
        SelenideElement dulSeriesInput = requesterCardPage.dulSeriesInput();
        SelenideElement dulNumberInput = requesterCardPage.dulNumberInput();
        SelenideElement clickMiss = requesterCardPage.missClickElement();

        for (List<String> strings : table) {
            dropdownService.selectValueIntoDropdown(documentTypeDropdown, strings.get(0));
            dulSeriesInput.sendKeys(strings.get(1));
            dulNumberInput.sendKeys(strings.get(2));
            clickMiss.click();
            LockSupport.parkNanos(TimeUnit.MILLISECONDS.toNanos(1000));

            Assert.assertFalse(requesterCardPage.requiredSeriesErrorMessageLabel().isDisplayed());
            Assert.assertFalse(requesterCardPage.requiredNumberErrorMessageLabel().isDisplayed());

            dulSeriesInput.clear();
            dulNumberInput.clear();
        }
    }

    @Then("КАРТОЧКА ЗАЯВИТЕЛЯ: Заполнить номер и проверить появление ошибок валидации поля")
    public void checkNumber(DataTable arg) {
        List<List<String>> table = arg.asLists(String.class);

        SelenideElement documentTypeDropdown = actionService.scrollToElementInCenter(requesterCardPage.documentTypeDropdown());
        SelenideElement dulNumberInput = requesterCardPage.dulNumberInput();
        SelenideElement clickMiss = requesterCardPage.missClickElement();

        for (List<String> strings : table) {
            dropdownService.selectValueIntoDropdown(documentTypeDropdown, strings.get(0));
            dulNumberInput.sendKeys(strings.get(1));
            clickMiss.click();
            LockSupport.parkNanos(TimeUnit.MILLISECONDS.toNanos(1000));

            Assert.assertFalse(requesterCardPage.requiredNumberErrorMessageLabel().isDisplayed());

            dulNumberInput.clear();
        }
    }

    @Then("КАРТОЧКА ЗАЯВИТЕЛЯ: Заполнить серию, номер и проверить на уникальность")
    public void checkSeriesNumberUniqueness(DataTable arg) {
        List<List<String>> table = arg.asLists(String.class);

        SelenideElement documentTypeDropdown = actionService.scrollToElementInCenter(requesterCardPage.documentTypeDropdown());
        SelenideElement series = requesterCardPage.dulSeriesInput();
        SelenideElement number = requesterCardPage.dulNumberInput();
        SelenideElement clickMiss = requesterCardPage.missClickElement();

        for (List<String> strings : table) {
            dropdownService.selectValueIntoDropdown(documentTypeDropdown, strings.get(0));
            series.sendKeys(strings.get(1));
            number.sendKeys(strings.get(2));
            clickMiss.click();
            LockSupport.parkNanos(TimeUnit.MILLISECONDS.toNanos(1000));

            requesterCardPage.notUniqueDulLabel().should(appear).shouldHave(text(REQUESTER_DUL_NOT_UNIQUE_ERROR));

            series.clear();
            number.clear();
        }
    }

    @Then("КАРТОЧКА ЗАЯВИТЕЛЯ: Заполнить номер и проверить на уникальность")
    public void checkNumberUniqueness(DataTable arg) {
        List<List<String>> table = arg.asLists(String.class);

        SelenideElement documentTypeDropdown = actionService.scrollToElementInCenter(requesterCardPage.documentTypeDropdown());
        SelenideElement dulNumberInput = requesterCardPage.dulNumberInput();
        SelenideElement clickMiss = requesterCardPage.missClickElement();

        for (List<String> strings : table) {
            dropdownService.selectValueIntoDropdown(documentTypeDropdown, strings.get(0));
            dulNumberInput.sendKeys(strings.get(1));
            clickMiss.click();
            LockSupport.parkNanos(TimeUnit.MILLISECONDS.toNanos(1000));

            requesterCardPage.notUniqueDulLabel().should(appear).shouldHave(text(REQUESTER_DUL_NOT_UNIQUE_ERROR));

            dulNumberInput.clear();
        }
    }

    @Then("КАРТОЧКА ЗАЯВИТЕЛЯ: Убрать значение в поле Тип документов")
    public void deleteTypeDocument() {
        requesterCardPage.clearDocumentTypeButton().scrollIntoView(false).click();
    }

    @Then("КАРТОЧКА ЗАЯВИТЕЛЯ: Проверить отображение подсказки 'Это обязательное поле' у пустого поля Тип документа")
    public void showHintTypeDocument() {
        requesterCardPage.requiredDocumentTypeErrorMessageLabel().shouldHave(text(REQUIRED_FIELD_ERROR));
    }

    @Then("КАРТОЧКА ЗАЯВИТЕЛЯ: Проверить отображение подсказки 'Это обязательное поле' у пустых полей Серия и Номер")
    public void showHintNumber(DataTable arg) {
        List<List<String>> table = arg.asLists(String.class);

        SelenideElement documentTypeDropdown = requesterCardPage.documentTypeDropdown();
        requesterCardPage.dulSeriesInput().click();
        requesterCardPage.missClickElement().click();
        requesterCardPage.dulNumberInput().click();
        requesterCardPage.missClickElement().click();

        for (List<String> strings : table) {
            dropdownService.selectValueIntoDropdown(documentTypeDropdown, strings.get(0));
            LockSupport.parkNanos(TimeUnit.MILLISECONDS.toNanos(1000));

            requesterCardPage.requiredSeriesErrorMessageLabel().shouldHave(text(REQUIRED_FIELD_ERROR));
            requesterCardPage.requiredNumberErrorMessageLabel().shouldHave(text(REQUIRED_FIELD_ERROR));
        }
    }
}

