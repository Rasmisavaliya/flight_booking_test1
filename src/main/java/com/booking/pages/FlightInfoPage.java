package com.booking.pages;

import com.booking.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class FlightInfoPage extends Utility {
    private static final Logger log = LogManager.getLogger(FlightInfoPage.class.getName());
    @CacheLookup
    @FindBy(id ="flights")
    WebElement flightLink;
    @CacheLookup
    @FindBy(css =".Text-module__root--variant-body_2___-3fYM.Text-module__root--color-disabled___tERfD")
    WebElement destinationTo;
    @CacheLookup
    @FindBy(css =".css-1ejj2j9")
    WebElement enterAirportTo;
    @CacheLookup
    @FindBy(xpath ="//span[normalize-space()='Search']")
    WebElement search;
    @CacheLookup
    @FindBy(css =".css-3cj1dx")
    WebElement checkBox;
    @CacheLookup
    @FindBy(id ="onetrust-accept-btn-handler")
    WebElement cookies;
    public void clickOnFlightLink() {
        log.info("Click on FlightLink");
        clickOnElement(flightLink);
    }
    public void clickOnWhereToBox(){
        log.info("click on where to box");
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", destinationTo);
        sendTextToElement(enterAirportTo,"Delhi");
    }
    public void clickOnCheckBox(){
        log.info("click on checkbox");
        clickOnElement(checkBox);
    }
    public void clickOnCookies(){
        log.info("click on cookies");
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", cookies);
    }
    public void clickOnSearchButton(){
        log.info("click on search button");
        clickOnElement(search);
    }
}