Feature: Login functionality

  Scenario: Valid user login
    Given user is on login page
    When user enters username "Admin" and password "admin123"
    And user clicks login button
    Then user should be redirected to the dashboard