
Feature: Registration functionality
  As user I want to navigate to register link and verify the registration functionality

 @regression
Scenario: User can register on Booking.com
      Given I am on the Booking.com website
      When I click on the Register button
      And I enter "random email" into the email field
      And I click on continue with email button
      And I enter the following details
      |Vara@leema123| Vara@leema123|
      Then I click on Create account button