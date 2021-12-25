package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.GmiBankPage;
import utilities.ConfigReader;
import utilities.Driver;

public class US_001_RegistrationStepDefinitions {

    GmiBankPage gmiBankPage = new GmiBankPage();


    @Given("User on the home page {string}")
    public void user_on_the_home_page(String homepage_url) {
        Driver.getDriver().get(ConfigReader.getProperty("homepage_url"));

    }


    @Then("User clicks menu icon")
    public void user_clicks_menu_icon() {
        gmiBankPage.homeIPageIcon.click();


    }
    @Given("User navigates to registraion page")
    public void user_navigates_to_registraion_page() {
        gmiBankPage.registrationIcon.click();

    }
    @Then("User provides a valid SSN")
    public void user_provides_a_valid_ssn() {
        gmiBankPage.registrationSsnTextBox.sendKeys(ConfigReader.getProperty("SSNnumber"));
    }
    @Then("User provides a valid Firstname")
    public void user_provides_a_valid() {
        gmiBankPage.registrationFirstNameTextBox.sendKeys(ConfigReader.getProperty("firstName"));
    }
    @Then("User provides a valid Lastname")
    public void user_provides_a_valif_firstname() {
        gmiBankPage.registrationLastnameTextBox.sendKeys(ConfigReader.getProperty("lastName"));
    }
    @Then("User provides a valid Adress")
    public void user_provides_a_valid_adress() {
        gmiBankPage.registrationAdressTextBox.sendKeys(ConfigReader.getProperty("adress"));
    }
    @Then("User provides a valid Mobile Phone Number")
    public void user_provides_a_valid_mobile_phone_number() {
        gmiBankPage.registrationMobilPhoneNumberTextBox.sendKeys(ConfigReader.getProperty("mobilePhoneNumber"));
    }
    @Then("User provides a valid Username")
    public void user_provides_a_valid_username() {
        gmiBankPage.registrationUserNameTextBox.sendKeys(ConfigReader.getProperty("userName"));
    }
    @Then("User Provides a valid Email")
    public void user_provides_a_valid_email() {
        gmiBankPage.registrationEmailTextBox.sendKeys(ConfigReader.getProperty("email"));
    }
    @Then("User provides a valid Password")
    public void user_provides_a_valid_password() {
        gmiBankPage.registrationNewPassword.sendKeys(ConfigReader.getProperty("newPassword"));
    }
    @Then("User provides a valid PAssword to PAsword confiration textbox")
    public void user_provides_a_valid_p_assword_to_p_asword_confiration_textbox() {
        gmiBankPage.registrationNewPasswordConfirmation.sendKeys(ConfigReader.getProperty("newPasswordConfirmation"));
    }
    @Then("User Clicks on Register button")
    public void user_clicks_on_register_button() {
        gmiBankPage.getRegistrationSubmit.click();
    }
    @Then("User validates that he registered succesfully")
    public void user_validates_that_he_registered_succesfully() {

    }
}
