Feature: Flight Availability
  As a user
  I want to check if flights are available between any two destinations
  So that I can plan my travel

 @smoke @regression
  Scenario: Check Flight Availability
    Given I am on the flight search page
    When I search for flights from "<origin>" to "<destination>"
    Then I should see available flights

