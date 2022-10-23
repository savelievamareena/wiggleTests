package com.stv.factory.factorytests;

import com.stv.factory.factorypages.LoginPage;
import com.stv.factory.factorypages.MainFactoryPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MainFactoryTest extends BasicFactoryTest {
    MainFactoryPage mainFactoryPage = new MainFactoryPage();
    LoginPage loginPage = new LoginPage();

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
        loginPage.insertEmailOnRegistration(LoginPage.TEST_EMAIL_VALID);
        loginPage.clickRegisterButton();
        boolean isFullRegistrationFormDisplayed = loginPage.isFullRegistrationFormDisplayed();
        Assert.assertTrue(isFullRegistrationFormDisplayed, "Full Registration Form is not available");
    }

    @Test (description = "Assert the registration goes ok with invalid email", dependsOnMethods = "assertLoginPageOpened")
    public void assertRegisterWithInvalidEmail() {
        loginPage.insertEmailOnRegistration(LoginPage.TEST_EMAIL_INVALID);
        loginPage.clickRegisterButton();
        boolean isEmailErrorDisplayed = loginPage.isEmailErrorDisplayed();
        Assert.assertTrue(isEmailErrorDisplayed, "Error message is not displayed");
    }

    @Test (description = "Assert the login goes ok with valid email", dependsOnMethods = "assertLoginPageOpened")
    public void assertLoginWithValidEmail() {
        loginPage.insertEmailOnLogin(LoginPage.TEST_EMAIL_REGISTERED);
        loginPage.insertPasswordOnLogin(LoginPage.TEST_PASSWORD);
        loginPage.clickLoginButton();
        boolean isLogoutButtonDisplayed = loginPage.isLogoutButtonDisplayed();
        Assert.assertTrue(isLogoutButtonDisplayed, "User was not logged in");
    }
}
