package com.stylemix.app.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.stylemix.app.dataWorker.Data;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class NewPage {

    private SelenideElement newLine =
            $(byXpath("/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[3]/div[1]" +
                    "/div[1]/div[1]/div[2]/div[1]/div[4]/div[2]/div[3]/div[2]/p[1]"));

    public NewPage open() {
        Selenide.open(Data.NEW_PAGE_URL);
        return this;
    }

    public NewPage fillOutPage(String pageName, String shortCode) {

        $(byId("post-title-0")).sendKeys(pageName);
        $(byXpath("//div[@class='block-list-appender wp-block']")).click();
        newLine.sendKeys(Keys.chord(Keys.CONTROL, "v"));

        return this;
    }

    public NewPage publicPage() {

        $(byXpath("//button[contains(text(),'Publish')]")).click();
        $(byXpath("//div[@class='editor-post-publish-panel__header-publish-button']//button[@type='button'][contains(text(),'Publish')]")).click();

        return this;

    }
}
