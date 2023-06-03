package com.sc.core.service;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.springframework.stereotype.Service;

import static com.codeborne.selenide.Selenide.$;

@Service
public class ActionService {
    private static final String SCROLL_INTO_CENTER_CONFIG = "{behavior: \"instant\", block: \"center\", inline: \"center\"}";

    public SelenideElement scrollToElementInCenter(SelenideElement scrollToElement) {
        return scrollToElement.scrollIntoView(SCROLL_INTO_CENTER_CONFIG);
    }

    public SelenideElement getElementBySelectorAndText(String selectorTemplate,  Object... values) {
        return $(By.xpath(String.format(selectorTemplate, values)));
    }
}
