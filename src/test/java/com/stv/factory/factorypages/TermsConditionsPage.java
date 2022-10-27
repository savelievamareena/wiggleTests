package com.stv.factory.factorypages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TermsConditionsPage extends FactoryPage{
    @FindBy(linkText="Terms & conditions")
    private WebElement termsConditionsLink;

    @FindBy(xpath = ("//*[contains(text(),'Wiggle Terms and Conditions')]"))
    private WebElement termsConditionsPageHeader;

    @FindBy(linkText="shipping information page")
    private WebElement shippingInformationLink;

    public void clickOnTermsConditionsLink() {
        termsConditionsLink.click();
    }

    public boolean isTermsConditionsPageDisplayed() {
        return termsConditionsPageHeader.isDisplayed();
    }

    public void clickShippingInformationLink() {
        shippingInformationLink.click();
    }
}
