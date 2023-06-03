package com.sc.core.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.springframework.stereotype.Service;

import static com.codeborne.selenide.Selenide.$;

@Service
public class ModalWindowPage {
    public SelenideElement modalWindow() {
        return $(By.xpath("//ngb-modal-window"));
    }

    public SelenideElement closeButton() {
        return $(By.xpath("//button[@class='close']"));
    }

    public SelenideElement modalContent(String modalRoot) {
        return $(By.xpath("//" + modalRoot + "//div[contains(@class, 'modal-body')]"));
    }
}
