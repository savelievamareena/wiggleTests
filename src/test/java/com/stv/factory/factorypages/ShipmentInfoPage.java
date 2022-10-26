package com.stv.factory.factorypages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShipmentInfoPage extends FactoryPage{

    @FindBy(className="bem-well--tertiary")
    private WebElement deliveryInformationBlock;

    @FindBy(className="bem-menu__list")
    private WebElement menuList;

    @FindBy(linkText="Delivery")
    private WebElement deliveryLink;

    @FindBy(xpath = ("//*[contains(text(),'How We Process Your Order')]"))
    private WebElement accordionBlockTitle;

    @FindBy(linkText="How We Process Your Order")
    private WebElement ordersProcessingLink;

    @FindBy(className="bem-menu__list")
    private WebElement openedAccordionBlock;

    @FindBy(className="js-accordion-content")
    private WebElement accordionItem;

    @FindBy(id="wiggle-logo")
    private WebElement mainLogo;

    public boolean isDeliveryInformationBlockDisplayed() {
        return deliveryInformationBlock.isDisplayed();
    }

    public boolean isInformationMenuListDisplayed() {
        return menuList.isDisplayed();
    }

    public void clickDeliveryItem() {
        deliveryLink.click();
    }

    public boolean isAccordionTitleShown() {
        return accordionBlockTitle.isDisplayed();
    }

    public void clickHowWeProcessItem() {
        ordersProcessingLink.click();
    }

    public boolean isAccordionItemDisplayed() {
         return accordionItem.isDisplayed();
    }

    public void clickMainLogo() {
        mainLogo.click();
    }

}
