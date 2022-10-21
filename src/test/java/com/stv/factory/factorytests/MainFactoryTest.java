package com.stv.factory.factorytests;

import com.stv.factory.factorypages.LoginPage;
import com.stv.factory.factorypages.MainFactoryPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MainFactoryTest extends BasicFactoryTest {
    MainFactoryPage mainFactoryPage = new MainFactoryPage();

    @Test (description = "Assert the login page is loaded")
    public void assertLoginPageOpened() {
        boolean isAccountLinkDisplayed = mainFactoryPage.isAccountLinkDisplayed();
        Assert.assertTrue(isAccountLinkDisplayed, "Account link isn't visible");

        mainFactoryPage.clickOnTrustButton();
        mainFactoryPage.clickOnAccountLink();
        Assert.assertTrue(new LoginPage().isLoginContainerDisplayed(), "Login page isn't loaded properly");
    }

    @Test (description = "Assert the registration goes ok with valid email", dependsOnMethods = "assertLoginPageOpened")
    public void assertRegisterWithValidEmail() {
        String emailReg = "testemail" + (int)(Math.random() * 1000000)  + "@gmail.com";
        mainFactoryPage.insertEmailOnRegistration(emailReg);
        mainFactoryPage.clickRegisterButton();
        boolean isFullRegistrationFormDisplayed = mainFactoryPage.isFullRegistrationFormDisplayed();
        Assert.assertTrue(isFullRegistrationFormDisplayed, "Full Registration Form is not available");
    }

    @Test (description = "Assert the registration goes ok with invalid email", dependsOnMethods = "assertLoginPageOpened")
    public void assertRegisterWithInvalidEmail() {
        String emailReg = "--testemail321";
        mainFactoryPage.insertEmailOnRegistration(emailReg);
        mainFactoryPage.clickRegisterButton();
        boolean isEmailErrorDisplayed = mainFactoryPage.isEmailErrorDisplayed();
        Assert.assertTrue(isEmailErrorDisplayed, "Error message is not displayed");
    }

    @Test (description = "Assert the login goes ok with valid email", dependsOnMethods = "assertLoginPageOpened")
    public void assertLoginWithValidEmail() {
        String validEmail = "persempre1@yandex.ru";
        String validPass = "testpass";
        mainFactoryPage.insertEmailOnLogin(validEmail);
        mainFactoryPage.insertPasswordOnLogin(validPass);
        mainFactoryPage.clickLoginButton();
        boolean isLogoutButtonDisplayed = mainFactoryPage.isLogoutButtonDisplayed();
        Assert.assertTrue(isLogoutButtonDisplayed, "User was not logged in");
    }
}
