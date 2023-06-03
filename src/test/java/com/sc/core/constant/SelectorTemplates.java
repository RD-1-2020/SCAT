package com.sc.core.constant;

public class SelectorTemplates {
    public static final String DROPDOWN_ITEM_TEMPLATE = "//div[@class='dt-select-options dt-scroll-container']//*[contains(normalize-space(text()), '%s')]";
    public static final String GRID_ITEM_RADIOBUTTON_TEMPLATE = "//tr[.//*[normalize-space(text())='%s']]//input";
    public static final String GRID_ITEM_TITLE_TEMPLATE = "//tr[.//*[contains(normalize-space(text()), '%s')]]";
    public static final String WIZARD_MAIN_ACTION_TEMPLATE = "//button[normalize-space(text())='%s']";
    public static final String BUTTON_BY_TEXT_SELECTOR = "//button[normalize-space(text())='%s']";
    public static final String BUTTON_BY_TEXT_INSIDE_MODAL_SELECTOR = "//%s//button[normalize-space(text())='%s']";
    public static final String LINK_BY_TEXT_SELECTOR = "//a[normalize-space(text())='%s']";
    public static final String ANY_BY_TEXT_SELECTOR = ".//*[normalize-space(text())='%s']";
}
