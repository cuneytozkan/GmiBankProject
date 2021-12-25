Feature: US_001 Positive Registration with valid credentials

  Background:
    Given User on the home page "homepage_url"
    Then User clicks menu icon

    @registrationwithconcretevalues
    Scenario: TC_001 Succes registraion with valid credentials
      Given User navigates to registraion page
      Then User provides a valid SSN
      Then User provides a valid Firstname
      Then User provides a valid Lastname
      Then User provides a valid Adress
      Then User provides a valid Mobile Phone Number
      Then User provides a valid Username
      Then User Provides a valid Email
      Then User provides a valid Password
      Then User provides a valid PAssword to PAsword confiration textbox
      Then User Clicks on Register button
      Then User validates that he registered succesfully

