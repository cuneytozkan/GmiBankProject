@US_005
  Feature:Login page should not be accessible with invalid credentials

    Background:
      Given User on the home page "homepage_url"
      Then User clicks menu icon
      And User navigates to login page

    Scenario Outline:
    C_0501 User cannot login with invalid username validating the error message
    TC_0502 User cannot login with invalid password validating the error message
    TC_0503 User cannot login with invalid username and password validating the error message

      And user enters username "<username>"
      And user enters password "<password>"
      And user click on siginButton
      And User see Failed Message

      Examples:

      |username|password|
      |team60user|xxxxxxx|
      |xxxxxxxx  |Team60user.|
      |xxxxxxx   |xxxxxxx    |

