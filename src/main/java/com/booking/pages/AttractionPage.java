package com.booking.pages;

import com.booking.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AttractionPage extends Utility {
    private static final Logger log = LogManager.getLogger(AttractionPage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//a[@aria-controls='attractions']")
    WebElement attractionButton;
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Where are you going?']")
    WebElement locationEnterBox;
    @CacheLookup
    @FindBy(xpath = "//div[contains(text(),'Select your dates')]")
    WebElement selectDateBox;
    @CacheLookup
    @FindBy(xpath = "(//div[@class='css-k0k5y7'])[1]")
    WebElement calender;
    @CacheLookup
    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div[1]/div/div/div/div[3]/div/div/div/div[2]/div[1]/div/div//h3")
    WebElement monthYear;
    @CacheLookup
    @FindBy(xpath = "(//*[name()='svg'])[13]")
    WebElement yearAndMonth;
    @CacheLookup
    @FindBy(xpath = "//body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr/td/span[1]")
    List<WebElement> allDates;
    @CacheLookup
    @FindBy(xpath = "(//li[@class='css-9dv5ti'])[1]")
    WebElement londonUK;
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Search']")
    WebElement searchButton;
    @CacheLookup
    @FindBy(xpath ="(//div[contains(text(),'Nearby destinations')])[1]")
    WebElement verifyText;

    public void clickOnAttractionButton() {
        log.info("click on attraction button");
        clickOnElement(attractionButton);
    }
    public void enterLocation(String location) {
        log.info("enter location");
        sendTextToElement(locationEnterBox, location);
    }
    public void clickOnSelectYourDatesBox(){
        log.info("click on select your dates box");
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", selectDateBox);
    }
    public void clickOnSearchButton() {
        log.info("click on search button");
        clickOnElement(searchButton);
    }
    public String verifyTextNearbyDestinations() {
        log.info("verify text Nearbydestinations");
        return getTextFromElement(verifyText);
    }
    public void clickOnLondonUkButton(){
        log.info("click on london UK Button");
        clickOnElement(londonUK);
    }
    public void selectDateFromCalender() {
        log.info("select date from Calender");
        String year = "2023";
        String month = "September";
        String date = "7";
        clickOnElement(calender);
        while (true) {
            String monthAndYear = monthYear.getText();
            String[] arr = monthAndYear.split(" ");
            String mon = arr[0];
            String yer = arr[1];
            if (mon.equalsIgnoreCase(month) && yer.equalsIgnoreCase(year)) {
                break;
            } else {
                clickOnElement(yearAndMonth);
            }
        }
        for (WebElement e : allDates) {
            if (e.getText().equalsIgnoreCase(date)) {
                e.click();
                break;
            }
        }

    }
}