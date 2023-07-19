package com.booking.pages;

import com.booking.utility.Utility;
import net.bytebuddy.utility.RandomString;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.Random;
public class RegisterPage extends Utility {
    private static final Logger log = LogManager.getLogger(RegisterPage.class.getName());
    public static String generatedEmail;
    @CacheLookup
    @FindBy(linkText = "Register")
    WebElement registerButton;
    @CacheLookup
    @FindBy(id = "username")
    WebElement emailAddressBox;
    @CacheLookup
    @FindBy(xpath = "(//button[@type='submit'])[1]")
    WebElement continueWithEmail;
    @CacheLookup
    @FindBy(id = "new_password")
    WebElement passwordField;
    @CacheLookup
    @FindBy(id = "confirmed_password")
    WebElement confirmPasswordField;
    @CacheLookup
    @FindBy(xpath = "//button[@type='submit']")
    WebElement createAccountButton;
    @CacheLookup
    @FindBy(id ="XitVyJTzIaYvBnV")
    WebElement verifyText;
    public void clickOnRegisterButton() {
        log.info("click on register button");
        clickOnElement(registerButton);
    }
    public void fillInEmail(){
    log.info("fill in email");
    Random randomPartOfEmailGenerator = new Random(5000);
    int randomNumberInEmail = randomPartOfEmailGenerator.nextInt();
    //random string generator - to use in email
    RandomString randomString = new RandomString(5);
    String randomStringInEmailGenerator = randomString.nextString();
    generatedEmail = "mocky" + randomNumberInEmail + randomStringInEmailGenerator + "mouse@gmail.com";
    log.info("Enter email " + emailAddressBox.toString());
    sendTextToElement(emailAddressBox, generatedEmail);
}
   public void clickOnContinueWithEmail() {
        log.info("click on continue with email");
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();",continueWithEmail);
    }
    public void enterPassword(String password){
     log.info("enter password");
        sendTextToElement(passwordField, password);
    }
    public void enterConfirmPassword(String confirmPassword) {
        log.info("enter confirm password");
        sendTextToElement(confirmPasswordField, confirmPassword);
    }
    public void clickOnCreateAccountButton(){
        log.info("click on create account button");
        clickOnElement(createAccountButton);
    }
    public String verifyTextAfterRegistration(){
        log.info("verify text after registration");
        return getTextFromElement(verifyText);
    }
}
