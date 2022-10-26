package com.stv.bdd_framework.steps;

import com.stv.factory.factorypages.MainFactoryPage;
import com.stv.factory.factorypages.ShipmentInfoPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class ShipmentInfoStep {
    ShipmentInfoPage shipmentInfoPage = new ShipmentInfoPage();
    MainFactoryPage mainFactoryPage = new MainFactoryPage();

    @Then("^shipping information page is opened$")
    public void shippingInfoPageOpened() {
        boolean isDeliveryInformationBlockDisplayed = shipmentInfoPage.isDeliveryInformationBlockDisplayed();
        boolean isInformationMenuListDisplayed = shipmentInfoPage.isInformationMenuListDisplayed();
        Assert.assertTrue(isDeliveryInformationBlockDisplayed, "Shipping information page is not displayed");
        Assert.assertTrue(isInformationMenuListDisplayed, "Shipping information page is not displayed");
    }

    @When("^a user opens delivery information$")
    public void openDeliveryInfo() {
        shipmentInfoPage.clickDeliveryItem();
        boolean isAccordionTitleShown = shipmentInfoPage.isAccordionTitleShown();
        Assert.assertTrue(isAccordionTitleShown, "Accordion is not displayed");
    }

    @And("^How We Process Your Order block is not displayed$")
    public void makeSureAccordionBlockNotDisplayed() {
        boolean isAccordionItemDisplayed = shipmentInfoPage.isAccordionItemDisplayed();
        Assert.assertFalse(isAccordionItemDisplayed, "Accordion Item is displayed");
    }

    @And("^a user clicks How We Process Your Order tab$")
    public void openHowWeProcessItem() {
        shipmentInfoPage.clickHowWeProcessItem();
    }

    @And("^How We Process Your Order block is displayed$")
    public void isAccordionBlockDisplayed() {
        boolean isAccordionItemDisplayed = shipmentInfoPage.isAccordionItemDisplayed();
        Assert.assertTrue(isAccordionItemDisplayed, "Accordion Item is not displayed");
    }

    @Then("^a user returns to the main page$")
    public void returnToMainPage() {
        shipmentInfoPage.clickMainLogo();
        boolean isMainPageDisplayed = mainFactoryPage.isMainPageDisplayed();
        Assert.assertTrue(isMainPageDisplayed, "Main page is not displayed");
    }
}
