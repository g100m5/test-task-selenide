package com.stylemix.app.pages;

import com.codeborne.selenide.SelenideElement;
import com.stylemix.app.dataWorker.Data;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class HomePage extends Page {

    public LoginPage LogOut() {
        open(Data.BASE_URL + "logout");
        //$(byXpath("//i[contains(.,'exit_to_app')]")).click();
        return new LoginPage();
    }


}
