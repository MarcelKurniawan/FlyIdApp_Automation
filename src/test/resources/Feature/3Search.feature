@search
Feature: Search

  @positive-test
  Scenario: Search ticket without login
    Given user is on homepage
    When user fill the deparatue location with "CGK"
    And user fill the arrival location with "BDO"
    And user select calendar
    And use select passenger
    And user select class type
    And user click search button
    Then user should be able to see ticket list
