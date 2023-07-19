
Feature: Filter functionality
  As a user I want to navigate to filter page and able to select the filter option

 @sanity @regression
Scenario: Check Flight Availability with Filters
     Given I am on the flight search page
     When I search for flights from "<origin>" to "<destination>"
     And I search for flights using "Direct only" filter
     Then I should verify the text "Airline"