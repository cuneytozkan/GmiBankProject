@US03pwdR
Feature: Registration page should restrict password usage to a secure and high level passcode

  Background: User go to the gmi bank url
    Given User on the home page "homepage_url"
    Then User clicks menu icon
    Given User navigates to registraion page
    And Click on New Password textbox
    Then  Assert that strenght bar is red

  @US03pwdR01
  Scenario: There should be at least one uppercase and one lower case char for stronger password and see the level chart change accordingly
    And Enter a password with one uppercase and lowercase letter
    And Observe that strenght bar is orange

  Scenario: There should be at least one digit for stronger password and see the level chart change accordingly
    And Enter one digit to password test box
    And Strength Bar must be yellow

  Scenario: There should be at least 1 digit  and see the level  chart change accordingly
    And When User enters a password with at least one special char
    And Strength Bar must be green

