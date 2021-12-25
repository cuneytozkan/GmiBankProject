Feature: US_002 "System should not allow anyone to register with invakid cretianls"

  Background: TC User cannot login with invalid SSN validating the error message
    Given User on the home page "homepage_url"
    Then User clicks menu icon
    Given User navigates to registraion page

    Scenario Outline: TC_0201 Any field on the registration page should not be left blank

      Then User provides a invalid SSN as "<ssn>"
      Then User provides a invalid Firstname as "<firstname>"
      Then User provides a invalid Lastname as "<lastname>"
      Then User provides a invalid Adress as "<address>"
      Then User provodes a invalid Then User provides a invalid Mobile Phone Number as "<mobilephone>"
      Then User provides a invalid  Username as "<username>"
      Then User provides a invalid  Email as "<email>"
      Then User provides a invalid Password as "<firstpassword>"
      Then User provides a invalid  Password to Password confirmation textbox as "<secondpassword>"
      Then User Clicks on Register button
      #And User validates that he registered succesfully with a success message as "<message>"

      Examples:
      |ssn|firstname|lastname|address|mobilephone|username|email|firstpassword|secondpassword|message|
      | | |     |   |       |         |  |           |           |  |



    @invalidSSN
    Scenario Outline: C_0202	SSN number cannot be of any chars nor spec chars except "-" SSN can not begin with 000 or 999
      Given User provides a invalid SSN as "<ssn>" and validates invalid ssn with a fail message as "<message1>" or "<message2>"

      Examples:
      |ssn|message1|message2|
      |999-66-3352|translation-not-found[Your Ssn is required]|Your Ssn is invalid|
      |000-66-3352|translation-not-found[Your Ssn is required]|Your Ssn is invalid|
      |255-55-666-|translation-not-found[Your Ssn is required]|Your Sss is invalid|
      |123-12-|translation-not-found[Your Ssn is required]|Your Ssn is invalid|
      |125-55-55880|translation-not-found[Your SSN is required]|Your SSN is invalid|
      |125/55-5580|translation-not-found[Your SSN is required]|Your SSN is invalid|
      |125-55-558a|translation-not-found[Your SSN is required]|Your SSN is invalid|
      |369871239|translation-not-found[Your SSN is required]|Your SSN is invalid|
      |255-55-6000''|translation-not-found[Your SSN is required]|Your SSN is invalid|
      |''125-12-1234|translation-not-found[Your SSN is required]|Your SSN is invalid|
      | |translation-not-found[Your SSN is required]|Your SSN is invalid|


    @invalidMobilePhone
    Scenario Outline: TC_0203 MobilePhone nujber cannot be of any chars nor spec char "-"
      Given User provides a onvalid Mobile Phone NUmber as "<mobilephone>" and validates invalid mobile phone with a faid message as "<message1>" or "<message2>"
      Examples:
      |mobilephone|message1|message2|
      |-55-555-6663|Your mobile phone number is invalid|translation-not-found[Your mobile phone number is required]|
      |255-555-666-|Your mobile phone number is invalid|translation-not-found[Your mobile phone number is required]|
      |123-152-|Your mobile phone number is invalid|translation-not-found[Your mobile phone number is required]|
