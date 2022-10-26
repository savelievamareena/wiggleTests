package com.stv.bdd_framework.steps;

import com.stv.factory.factorypages.LoginPage;
import com.stv.factory.factorytests.BasicFactoryTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LoginPageStep extends BasicFactoryTest {
    LoginPage loginPage = new LoginPage();

    @Then("^account page is opened$")
    public void accountPageIsOpened() {
        Assert.assertTrue(new LoginPage().isLoginContainerDisplayed(), "Login page isn't loaded properly");
    }

    @When("^a user inputs email (.+@.+\\..+)$")
    public void userInputsEmail(String email) {
        loginPage.insertEmailOnRegistration(email);
    }

    @And("^click Continue button$")
    public void userClicksContinueButton() {
        loginPage.clickRegisterButton();
    }

    @Then("^a user is redirected to New customer page$")
    public void newCustomerPageOpened() {
        boolean isFullRegistrationFormDisplayed = loginPage.isFullRegistrationFormDisplayed();
        Assert.assertTrue(isFullRegistrationFormDisplayed, "Full Registration Form is not available");
    }
}