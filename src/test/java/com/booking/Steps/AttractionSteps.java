package com.booking.Steps;

import com.booking.pages.AttractionPage;
import com.booking.pages.FlightInfoPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.StaleElementReferenceException;
import org.testng.Assert;

public class AttractionSteps {
    @When("^I click on attraction button$")
    public void iClickOnAttractionButton() {
        new AttractionPage().clickOnAttractionButton();
    }

    @And("^I enter \"([^\"]*)\" in to the box$")
    public void iEnterInToTheBox(String arg0){
        new AttractionPage().enterLocation("London");
    }

    @And("^I click on search button$")
    public void iClickOnSearchButton() {
        new FlightInfoPage().clickOnCookies();
        new AttractionPage().clickOnSearchButton();
    }
    @Then("^I should able to verify the text \"([^\"]*)\"$")
    public void iShouldAbleToVerifyTheText(String arg0){
        Assert.assertEquals(new AttractionPage().verifyTextNearbyDestinations(),"Nearby destinations","Message not matching");
    }
    @Given("^I am on the attraction search page$")
    public void iAmOnTheAttractionSearchPage() {
    }
    @And("^I select the Date\"([^\"]*)\"$")
    public void iSelectTheDate(String arg0) throws InterruptedException {
        Thread.sleep(4000);
        try{
            new AttractionPage().selectDateFromCalender();
        }catch(StaleElementReferenceException e ){
            e.getMessage();
        }
    }
    @And("^I click on select your date box$")
    public void iClickOnSelectYourDateBox() throws InterruptedException {
        Thread.sleep(2000);
        new FlightInfoPage().clickOnCookies();
        new AttractionPage().clickOnSelectYourDatesBox();
    }
    @And("^I click on the London UK tab$")
    public void iClickOnTheLondonUKTab() throws InterruptedException {
        Thread.sleep(2000);
        new AttractionPage().clickOnLondonUkButton();
    }
}




