package com.stv.factory.factorypages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainFactoryPage extends FactoryPage {

    @FindBy(id = "accountLink")
    private WebElement accountLink;

    @FindBy(id = "qa-dual-register")
    private WebElement registerButton;

    @FindBy(id = "DualRegisterEmailModel_Email")
    private WebElement regEmailInput;

    @FindBy(xpath = "//button[contains(text(),'Accept All Cookies')]")
    private WebElement trustButton;

    @FindBy(id = "register-form")
    private WebElement fullRegisterForm;

    @FindBy(id = "DualRegisterEmailModel_Email-error")
    private WebElement signupErrorEmail;

    @FindBy(id = "LogOnModel_UserName")
    private WebElement loginInput;

    @FindBy(id = "LogOnModel_Password")
    private WebElement passwordInput;

    @FindBy(linkText = "Log Out")
    private WebElement logoutButton;

    @FindBy(id = "qa-login")
    private WebElement loginButton;

    public boolean isAccountLinkDisplayed(){
        return accountLink.isDisplayed();
    }

    public void clickOnAccountLink(){
        accountLink.click();
    }

    public void clickOnTrustButton(){
        trustButton.click();
    }

    public void clickRegisterButton() {
        registerButton.click();
    }

    public void insertEmailOnRegistration(String email) {
        regEmailInput.sendKeys(email);
    }

    public boolean isFullRegistrationFormDisplayed() {
        return fullRegisterForm.isDisplayed();
    }

    public boolean isEmailErrorDisplayed() {
        return signupErrorEmail.isDisplayed();
    }

    public void insertEmailOnLogin(String email) {
        loginInput.sendKeys(email);
    }

    public void insertPasswordOnLogin(String password) {
        passwordInput.sendKeys(password);
    }

    public boolean isLogoutButtonDisplayed() {
        return logoutButton.isDisplayed();
    }

    public void clickLoginButton() {
        loginButton.click();
    }
}
