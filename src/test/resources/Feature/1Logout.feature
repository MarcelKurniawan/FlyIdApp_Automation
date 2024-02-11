@logout
Feature: Logout

  @positive-test
  Scenario: User can logout easily
    Given user is on homepage
    And user go to profile page
    When user click login button
    And user input email with "test@test.com"
    And user input password with "T3st!ng123"
    And user click agains on login button
    Then user is on homepage
    And user go to profile page
    And user click logout button
    And user click validate logout button
    Then user is on successfuly logout