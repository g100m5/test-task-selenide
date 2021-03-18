package com.stylemix.app;

import com.stylemix.app.pages.NewPage;
import com.stylemix.app.pages.PluginPage;
import com.stylemix.app.users.UserAdmin;
import org.testng.annotations.Test;

public class TestPlugin extends Base {

    @Test(groups = "make_calc", priority = 10, invocationCount = 1)

        public void TestCostCalculatorPlugin() {
        UserAdmin admin = new UserAdmin();
        login(admin);

        PluginPage plugin = new PluginPage();
        plugin.open();
        plugin.createForm();
        plugin.fillOutForm();

        String shortCode = plugin.getShortCode();

        plugin.saveForm();

        NewPage newPage = new NewPage();

        newPage.open();
        newPage.fillOutPage("SomeNewPage", shortCode);
        newPage.publicPage();

    }




}
