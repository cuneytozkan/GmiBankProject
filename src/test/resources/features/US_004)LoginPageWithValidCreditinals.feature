Feature: Login page should accessible with valid credentials

  Background:
    Given User on the home page "homepage_url"
    Then User clicks menu icon

  @LoginPageValid
  Scenario Outline: Login page should accessible with valid credentials
    And User navigates to login page
    And user enters username "<username>"
    And user enters password "<password>"
    And user click on siginButton
    Then verify user is loged in

    Examples:Users Admin User Customer Manager
      | username | password |
      |team60user|Team60user.|

  Scenario: There should be an option to cancel login
    When User navigates to login page
    Then verify cancel button displayed



