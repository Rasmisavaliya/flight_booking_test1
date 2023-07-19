package com.booking.Steps;

import com.booking.pages.FlightInfoPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FlightInfoSteps {
    @Given("^I am on the flight search page$")
    public void iAmOnTheFlightSearchPage() throws InterruptedException {
        new FlightInfoPage().clickOnFlightLink();
        Thread.sleep(2000);
        new FlightInfoPage().clickOnCookies();
    }
    @When("^I search for flights from \"([^\"]*)\" to \"([^\"]*)\"$")
    public void iSearchForFlightsFromTo(String arg0, String arg1) {
        new FlightInfoPage().clickOnWhereToBox();
        new FlightInfoPage().clickOnCheckBox();
        new FlightInfoPage().clickOnSearchButton();
    }
    @Then("^I should see available flights$")
    public void iShouldSeeAvailableFlights() {

    }

}


