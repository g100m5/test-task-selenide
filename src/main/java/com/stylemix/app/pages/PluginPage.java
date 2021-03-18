package com.stylemix.app.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.stylemix.app.dataWorker.Data;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class PluginPage extends Page {

    SelenideElement createNew = $(byXpath("//button[contains(.,'Create new')]"));
    SelenideElement formName = $(byId("create-input"));

    SelenideElement addCheckBoxField = $(byCssSelector(".calc-field:nth-child(1) .fa-plus"));
    SelenideElement addRadioBoxField = $(byCssSelector(".calc-field:nth-child(2) .fa-plus"));
    SelenideElement checkBoxName = $(byCssSelector(".list-content:nth-child(1) > input"));
    SelenideElement checkBoxDescription = $(byCssSelector(".list-content:nth-child(2) > input"));
    SelenideElement saveElementButton = $(byCssSelector(".ccb-flex .green > span"));


    public PluginPage open() {
        Selenide.open(Data.BASE_URL + Data.PLUGIN_CALCULATOR_URL);
        return this;
    }

    public PluginPage createForm() {
        createNew.scrollTo().click();
        return this;
    }

    public PluginPage fillOutForm() {
        formName.sendKeys("test-one-1");
        $(byCssSelector(".after")).click();
        addCheckBoxField();
        addRadioField();
        return this;
    }

    public void addCheckBoxField() {
        addCheckBoxField.hover().click();
        checkBoxName.sendKeys("test-one-1");
        checkBoxDescription.sendKeys("test-one-2");
        saveElementButton.scrollTo().click();
    }

    public void addRadioField() {
        addRadioBoxField.hover().click();
        checkBoxName.sendKeys("test-two-1");
        checkBoxDescription.sendKeys("test-two-2");
        saveElementButton.scrollTo().click();
    }

    public String getShortCode() {

        $(byCssSelector(".short-code > p")).click();
        String shortCode = "";
        try {
            shortCode = (String) Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor);
        } catch (UnsupportedFlavorException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return shortCode;
    }

    public PluginPage saveForm() {
        $(byCssSelector(".calc-buttons > button:nth-child(1)")).scrollTo().click();
        return this;
    }


}
