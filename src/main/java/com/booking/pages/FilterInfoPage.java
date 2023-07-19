package com.booking.pages;

import com.booking.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class FilterInfoPage extends Utility {
    private static final Logger log = LogManager.getLogger(FilterInfoPage.class.getName());
    @CacheLookup
    @FindBy(css ="label[for='__bui-25'] span[class='InputRadio-module__field___4Jbyo']")
    WebElement directOnlyButton;
    @CacheLookup
    @FindBy(xpath ="//h3[normalize-space()='Airlines']")
    WebElement airLinesText;

    public void clickOnDirectOnlyButton(){
        log.info("click on Directonly button");
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", directOnlyButton);
    }
    public String verifyTextAirlines(){
        log.info("verify text airlines");
        return getTextFromElement(airLinesText);
    }

}

