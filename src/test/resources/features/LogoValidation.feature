@functionalTest
Feature: JP Morgan logo validation

  @end2End
  Scenario: Validate JP Morgan Logo End2End
    Given I have a search field on Google home page
    When I search for "J. P. Morgan"
    And I select the first matched item
    Then J. P. Morgan logo should be displayed

  @caseInsensitive
  Scenario: Validate case insensitivity
    Given I have a search field on Google home page
    When I search for "jp morgan"
    And I select the first matched item
    Then J P Morgan logo should be displayed

  @multipleResults
  Scenario: Validate JP Morgan multiple results
    Given I have a search field on Google home page
    When I search for "J. P. Morgan"
    Then multiple matching results should be displayed

  @fieldEnabled
  Scenario: Validate search field
    Given I have a search field on Google home page
    Then search field should be enabled

  @keyCheck
  Scenario: Search using key press
    Given I have a search field on Google home page
    Then I can search for "J. P. Morgan" using key press

  @negativeTest-1
  Scenario: Search with some random string
    Given I have a search field on Google home page
    When I search for "xyzabc"
    And I select the first matched item
    Then J P Morgan logo should not be displayed

  @negativeTest-2
  Scenario: Validate it with random matched item
    Given I have a search field on Google home page
    When I search for "J.P. Morgan"
    And I select any random matched item
    Then J P Morgan logo should not be displayed


