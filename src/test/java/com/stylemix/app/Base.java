package com.stylemix.app;

import com.codeborne.selenide.Configuration;
import com.stylemix.app.dataWorker.Data;
import com.stylemix.app.pages.HomePage;
import com.stylemix.app.pages.LoginPage;
import com.stylemix.app.users.User;
import com.stylemix.app.helpers.NavigationHelper;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.testng.annotations.BeforeClass;

public class Base {

    @BeforeClass
    public void setUp() {
        ChromeDriverManager.getInstance().setup();
        Configuration.browser = "firefox";
        //Configuration.browser = "chrome";
        Configuration.baseUrl = Data.BASE_URL;
    }

    protected HomePage login(User user) {
        return new LoginPage().open().loginAs(user);
    }

   protected Object navigateTo(String section) {
        NavigationHelper navigate = new NavigationHelper();
        navigate.addParameterToCurrentUrl(section);
        return this;
    }
}
