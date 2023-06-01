package com.sc.core.utils;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.springframework.stereotype.Service;

import static com.codeborne.selenide.Selenide.$;

@Service
public class ShadowDoomUtils {
    /**
     * Функция для получения элемента из ShadowDoom
     * @param shadowDoomRootSelector Селектор до корня ShadowDoom
     * @param elementInsideShadowDoomSelector Селектор до самого элекмента внутри ShadowDoom
     * @return Элемент из ShadowDoom
     */
    public SelenideElement getElementFromShadowDoom(By shadowDoomRootSelector, By elementInsideShadowDoomSelector) {
        SelenideElement shadowTypeDocument = $(shadowDoomRootSelector);
        SearchContext searchContext = shadowTypeDocument.getShadowRoot();
        return $(searchContext.findElement(elementInsideShadowDoomSelector));
    }
}
