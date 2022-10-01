@functionalTest
Feature: JP Morgan logo validation

  Scenario: Validate JP Morgan Logo
    Given I have a search field on Google home page
    When I search for keyword "J. P. Morgan"
    And I select the first matched item
    Then "J P Morgan logo" should be displayed