package com.stv.bdd_framework.steps;

import com.stv.factory.factorypages.TermsConditionsPage;
import com.stv.factory.factorytests.BasicFactoryTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class TermsConditionsStep extends BasicFactoryTest {
    TermsConditionsPage termsConditionsPage = new TermsConditionsPage();

    @And("^user clicks on Terms & Conditions link$")
    public void clickTermsConditionsLink() {
        termsConditionsPage.clickOnTermsConditionsLink();
    }

    @Then("^Terms & Conditions page is opened$")
    public void termsConditionsPageOpened() {
        boolean termsConditionsPageIsDisplayed = termsConditionsPage.isTermsConditionsPageDisplayed();
        Assert.assertTrue(termsConditionsPageIsDisplayed, "Terms and Conditions page is not displayed");
    }

    @When("^a user clicks shipping information link$")
    public void userClicksShippingInfoLink() {
        termsConditionsPage.clickShippingInformationLink();
    }
}
