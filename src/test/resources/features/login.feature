Feature: Login functionality
  Scenario: Valid user login
    Given user is on login page
    When user enters username and password
    And user clicks login button
    Then user should be redirected to the dashboard

  Scenario: User open the admin tab
    Given user is on login page
    When user enters username and password
    And user clicks login button
    When user clicks on admin button
    Then User should be redirected to the Admin dashboard

  Scenario: User opens the the mytimesheet
    Given user is on login page
    When user enters username and password
    And user clicks login button
    When user clicks on time button
    Then user clicks on timesheets dropdown
    And user clicks on mytimesheets dropdown
    Then User should be redirected to mytimesheets dashboard




