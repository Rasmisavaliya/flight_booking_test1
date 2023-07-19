package com.booking.Steps;

import com.booking.pages.FlightInfoPage;
import com.booking.pages.RegisterPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

import java.util.List;

public class RegisterSteps {
    @When("^I click on the Register button$")
    public void iClickOnTheRegisterButton() {
        new FlightInfoPage().clickOnCookies();
        new RegisterPage().clickOnRegisterButton();
    }
    @And("^I click on continue with email button$")
    public void iClickOnContinueWithEmailButton() throws InterruptedException {
        Thread.sleep(2000);
        new RegisterPage().clickOnContinueWithEmail();
    }
    @And("^I enter the following details$")
    public void iEnterTheFollowingDetails(DataTable dataTable) throws InterruptedException {
        Thread.sleep(2000);
        List<List<String>> form = dataTable.asLists(String.class);
        for (List<String> e : form) {
            String password = e.get(0);
            new RegisterPage().enterPassword(password);
            String confirmPassword = e.get(1);
            new RegisterPage().enterConfirmPassword(confirmPassword);
        }
    }
    @And("^I click on Create account button$")
    public void iClickOnCreateAccountButton() throws InterruptedException {
        Thread.sleep(2000);
        new RegisterPage().clickOnCreateAccountButton();
    }

    @And("^I enter \"([^\"]*)\" into the email field$")
    public void iEnterIntoTheEmailField(String arg0) {
        new RegisterPage().fillInEmail();
    }

}