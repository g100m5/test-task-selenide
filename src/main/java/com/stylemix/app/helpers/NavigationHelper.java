package com.stylemix.app.helpers;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.stylemix.app.wrappers.BaseHelper;

import static com.codeborne.selenide.WebDriverRunner.url;
import static com.stylemix.app.dataWorker.Data.BASE_URL;

public class NavigationHelper extends BaseHelper<NavigationHelper> {

    public String getCurrentUrl() {
        return url();
    }

    public Object addParameterToCurrentUrl(String URL) {
        Selenide.open(BASE_URL + URL);
        return this;
    }

}
