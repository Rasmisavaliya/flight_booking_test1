Feature: Attraction Page
  As a user I want to navigate to attraction page and verify the attraction functionality

@regression
Scenario: Verify User can visit Attraction page
      Given I am on the attraction search page
      When I click on attraction button
      And I enter "London" in to the box
      And I click on select your date box
      And I select the Date"2023-09-07"
      And I click on search button
      And I click on the London UK tab
      Then I should able to verify the text "London Attraction"