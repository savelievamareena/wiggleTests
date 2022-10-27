package com.stv.factory.factorypages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends FactoryPage {
    public static final String TEST_EMAIL_VALID = "testemail" + (int)(Math.random() * 1000000)  + "@gmail.com";
    public static String TEST_EMAIL_INVALID = "--testemail4321";
    public static String TEST_EMAIL_REGISTERED = "persempre1@yandex.ru";
    public static String TEST_PASSWORD = "testpass";

    @FindBy(className = "bem-checkout__login-container")
    private WebElement loginContainer;

    @FindBy(id = "qa-dual-register")
    private WebElement registerButton;

    @FindBy(id = "DualRegisterEmailModel_Email")
    private WebElement regEmailInput;

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

    public boolean isLoginContainerDisplayed(){
        return loginContainer.isDisplayed();
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
