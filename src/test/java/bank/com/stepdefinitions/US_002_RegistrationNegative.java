package bank.com.stepdefinitions;

import bank.com.pages.GmiBankPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import bank.com.utilities.*;


import java.security.Key;

public class US_002_RegistrationNegative {

    GmiBankPage gmiBankPage = new GmiBankPage();

    @Then("User provides a invalid SSN as {string}")
    public void user_provides_a_invalid_ssn_as(String ssn) {
        gmiBankPage.registrationSsnTextBox.sendKeys(ssn+ Keys.ENTER);

    }
    @Given("User provides a invalid SSN as {string} and validates invalid ssn with a fail message as {string} or {string}")
    public void user_provides_a_invalid_ssn_as_and_validates_invalid_ssn_with_a_fail_message_as_or(String ssn, String failSsnMessage1, String failSsnMessage2) {
        gmiBankPage.registrationSsnTextBox.sendKeys(ssn+ Keys.ENTER);
        String actualFailSsnMessage = gmiBankPage.registrationSsnFeedBackMessage.getText();
        System.out.println("Actual failed message is " + actualFailSsnMessage);
        Assert.assertTrue(actualFailSsnMessage.contains(failSsnMessage1) || actualFailSsnMessage.contains(failSsnMessage2));


    }


    @Then("User provides a invalid Firstname as {string}")
    public void user_provides_a_invalid_firstname_as(String firstname) {
        gmiBankPage.registrationFirstNameTextBox.sendKeys(firstname + Keys.ENTER);

    }

    @Then("User provides a invalid Lastname as {string}")
    public void user_provides_a_invalid_lastname_as(String lastname) {
        gmiBankPage.registrationLastnameTextBox.sendKeys(lastname+Keys.ENTER);

    }

    @Then("User provides a invalid Adress as {string}")
    public void user_provides_a_invalid_adress_as(String adress) {
        gmiBankPage.registrationAdressTextBox.sendKeys(adress+Keys.ENTER);

    }

    @Then("User provodes a invalid Then User provides a invalid Mobile Phone Number as {string}")
    public void user_provodes_a_invalid_then_user_provides_a_invalid_mobile_phone_number_as(String mobilePhoneNUmber) {
        gmiBankPage.registrationMobilPhoneNumberTextBox.sendKeys(mobilePhoneNUmber+Keys.ENTER);

    }

    @Then("User provides a invalid  Username as {string}")
    public void user_provides_a_invalid_username_as(String username) {
        gmiBankPage.registrationUserNameTextBox.sendKeys(username+Keys.ENTER);

    }

    @Then("User provides a invalid  Email as {string}")
    public void user_provides_a_invalid_email_as(String email) {
        gmiBankPage.registrationEmailTextBox.sendKeys(email+Keys.ENTER);

    }

    @Then("User provides a invalid Password as {string}")
    public void user_provides_a_invalid_password_as(String password) {
        gmiBankPage.registrationNewPassword.sendKeys(password+ Keys.ENTER);

    }

    @Then("User provides a invalid  Password to Password confirmation textbox as {string}")
    public void user_provides_a_invalid_password_to_password_confirmation_textbox_as(String secondPassword) {
        gmiBankPage.registrationNewPasswordConfirmation.sendKeys(secondPassword+Keys.ENTER);

    }

    @Then("User validates that he registered succesfully with a success message as {string}")
    public void user_validates_that_he_registered_succesfully_with_a_success_message_as(String successMessage) {
        String expectedFailedMessage =gmiBankPage.wrongSuccesRegisterMessage.getText();
        System.out.println("expected failed message is "+ expectedFailedMessage);
        String actualFailedMessage = ConfigReader.getProperty("registration_failed_message");
        Assert.assertTrue(expectedFailedMessage.contains(actualFailedMessage));
    }

    @Given("User provides a onvalid Mobile Phone NUmber as {string} and validates invalid mobile phone with a faid message as {string} or {string}")
    public void user_provides_a_onvalid_mobile_phone_n_umber_as_and_validates_invalid_mobile_phone_with_a_faid_message_as_or(String mobilephonenumber, String failMobileMessage1, String failMobileMessage2) {

        gmiBankPage.registrationMobilPhoneNumberTextBox.sendKeys(mobilephonenumber);
        String actualFailMobileMessage = gmiBankPage.registrationMobilePhoneNumberFeedBackMessage.getText();
        Assert.assertTrue(actualFailMobileMessage.contains(failMobileMessage1)|| actualFailMobileMessage.contains(failMobileMessage2));
    }


}
