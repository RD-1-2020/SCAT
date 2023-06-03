package com.sc.core.pages.requester;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.springframework.stereotype.Service;

import static com.codeborne.selenide.Selenide.$;

@Service
public class RequesterGridPage {
    public SelenideElement createRequesterButton() {
        return $(By.xpath("//div[@class='dt-grid']//div[@class='button-container']//button[@class='btn btn-primary']"));
    }

    public SelenideElement createRequesterDialogFlRadioButton() {
        return $(By.xpath("//label[@class='control-label dt-radio mb-2'][1]"));
    }

    public SelenideElement createRequesterDialogIpRadioButton() {
        return $(By.xpath("//label[@class='control-label dt-radio mb-2'][2]"));
    }

    public SelenideElement createRequesterDialogSubmitButton() {
        return $(By.xpath("//div[@class='modal-footer']//button[@class='btn btn-primary']"));
    }
}
