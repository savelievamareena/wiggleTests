package com.stv.bdd_framework.steps;

import com.stv.factory.factorypages.MainFactoryPage;
import com.stv.factory.factorytests.BasicFactoryTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import static com.stv.framework.core.lib.WigglePageURLs.START_URL;

public class FirstPageStep extends BasicFactoryTest {
    MainFactoryPage mainFactoryPage = new MainFactoryPage();

    @Given("^main page is opened$")
    public void mainPageIsOpened() {
        WebDriver driver = getDriver();
        driver.get(START_URL);
    }

    @When("^a user clicks on account link$")
    public void userClicksAccountLink() {
        mainFactoryPage.clickOnTrustButton();
        mainFactoryPage.isAccountLinkDisplayed();
        mainFactoryPage.clickOnAccountLink();
    }
}
