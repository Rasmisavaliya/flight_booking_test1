package com.booking.Steps;

import com.booking.pages.FilterInfoPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class FilterInfoSteps {
    @When("^I search for flights using \"([^\"]*)\" filter$")
    public void iSearchForFlightsUsingFilter(String directOnly) throws InterruptedException {
        Thread.sleep(5000);
        new FilterInfoPage().clickOnDirectOnlyButton();
    }
    @Given("^I am on the Booking\\.com website$")
    public void iAmOnTheBookingComWebsite() {
    }
    @Then("^I should verify the text \"([^\"]*)\"$")
    public void iShouldVerifyTheText(String arg0){
        Assert.assertEquals(new FilterInfoPage().verifyTextAirlines(),"Airlines", "Message not matching");
    }

}
