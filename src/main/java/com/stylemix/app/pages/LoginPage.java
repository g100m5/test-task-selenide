package com.stylemix.app.pages;


import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.stylemix.app.dataWorker.Data;
import com.stylemix.app.helpers.NavigationHelper;
import com.stylemix.app.users.User;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage extends Page {

    private SelenideElement emailField = $(byName("log"));
    private SelenideElement passwordField = $(byName("pwd"));
    private SelenideElement loginButton = $(byName("wp-submit"));

    public LoginPage open() {
        Selenide.open(Data.LOGIN_URL);
        return this;
    }

    public void setEmailField(String userEmail) {
        emailField.val(userEmail);
    }

    public void setPasswordField(String userPassword) {
        passwordField.val(userPassword);
    }

    public HomePage loginAs(User user) {
        setEmailField(user.getEmail());
        setPasswordField(user.getPassword());
        loginButton.click();

        return new HomePage();
    }

}





