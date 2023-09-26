package com.poshanabhiyan.test;

import com.poshanabhiyan.pages.HomePage;
import com.poshanabhiyan.utility.PageFactory;
import com.poshanabhiyan.utility.Screenshot;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class LoginTest extends BaseTest {
    @Test
    public void verifySuccessfulLogin() {
        HomePage homePage = PageFactory.createPageInstance(driver, HomePage.class);
        Assert.assertTrue(homePage.verifyHomePageTitle(), "Home page title assertion failed");
    }
    
}
