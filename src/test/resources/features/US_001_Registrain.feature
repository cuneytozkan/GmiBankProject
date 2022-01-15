Feature: US_001 Positive Registration with valid credentials


    @registrationwithconcretevalues
#    Scenario: TC_001 Success registration with valid credentials
#      Given User navigates to registraion page
#      Then User provides a valid SSN
#      Then User provides a valid Firstname
#      Then User provides a valid Lastname
#      Then User provides a valid Adress
#      Then User provides a valid Mobile Phone Number
#      Then User provides a valid Username
#      Then User Provides a valid Email
#      Then User provides a valid Password
#      Then User provides a valid PAssword to PAsword confiration textbox
#      Then User Clicks on Register button
#      Then User validates that he registered succesfully



      @registerNewUserUI
    Scenario Outline: Register new users with faker class
      Given User on the home page "homepage_url"
      Then User clicks menu icon
      Given User navigates to registraion page
      Then User enters ssn number as "<SSN>"
      Then User enters firstname as "<Firstname>"
      Then User enters lastname as "<Lastname>"
      Then User provides adress as "<Adress>"
      Then User provides mobilephone as "<PhoneNumber>"
      Then User provides a username as "<Username>"
      Then User Provides email id as "<Email>"
      Then User provides the password as "<firstPassword>"
      Then User confirms the new password "<secondpassword>"
      Then User Clicks on Register button
      Then User sees the success as "<message>"

      Examples:
        | SSN | Firstname | Lastname | Adress | PhoneNumber | Username | Email | firstPassword | secondpassword | message |
        |     |           |           |         |            |          |       |               |                |         |



