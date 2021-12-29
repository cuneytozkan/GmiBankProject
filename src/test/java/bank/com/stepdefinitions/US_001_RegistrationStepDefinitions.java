package bank.com.stepdefinitions;

import bank.com.pojos.Registration;
import bank.com.utilities.ConfigReader;
import bank.com.utilities.WriteToTxt;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import bank.com.pages.GmiBankPage;
import bank.com.utilities.Driver;


public class US_001_RegistrationStepDefinitions {

    GmiBankPage gmiBankPage = new GmiBankPage();
    Faker faker = new Faker();
    Registration registration = new Registration();
    String fileName = ConfigReader.getProperty("fileNameOfCustomer");


    String firstName;
    String lastName;
    String password;
    String userName;




    @Given("User on the home page {string}")
    public void user_on_the_home_page(String string) {
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

    @Then("User enters ssn number as {string}")
    public void userEntersSsnNumberAs(String ssn) {
        ssn=faker.idNumber().ssnValid();
        Driver.waitAndSendText(gmiBankPage.registrationSsnTextBox,ssn,10);
        registration.setSsn(ssn);



    }

    @Then("User enters firstname as {string}")
    public void user_enters_firstname_as(String firstname) {

        firstname = faker.name().firstName();
        this.firstName= firstname;

        Driver.waitAndSendText(gmiBankPage.registrationFirstNameTextBox,firstname,5);
        registration.setFirstName(firstname);

        //Driver.waitAndClick();



    }

    @Then("User enters lastname as {string}")
    public void user_enters_lastname_as(String lastname) {
        lastname = faker.name().lastName();
        this.lastName = lastname;
        Driver.waitAndSendText(gmiBankPage.registrationLastnameTextBox,lastname,7);
        registration.setLastName(lastname);
    }

    @Then("User provides adress as {string}")
    public void user_provides_adress_as(String adress) {
        adress = faker.address().streetAddress();
        Driver.waitAndSendText(gmiBankPage.registrationAdressTextBox,adress,5);
        registration.setAddress(adress);

    }

    @Then("User provides mobilephone as {string}")
    public void user_provides_mobilephone_as(String mobilephone) {

        mobilephone = faker.phoneNumber().cellPhone();
        if (mobilephone.contains("(") || mobilephone.contains("(")){
            mobilephone = mobilephone.replace("(","").replace(")","");
        }else if (mobilephone.contains(".")){
            mobilephone = mobilephone.replace(".","-");
        }

        Driver.waitAndSendText(gmiBankPage.registrationMobilPhoneNumberTextBox,mobilephone,5);
        registration.setPhoneNumber(mobilephone);
    }

    @Then("User provides a username as {string}")
    public void user_provides_a_username_as(String username) {

        username = faker.name().username();
        this.userName = username;

        Driver.waitAndSendText(gmiBankPage.registrationUserNameTextBox,username,5);
        registration.setUserName(username);
    }

    @Then("User Provides email id as {string}")
    public void user_provides_email_id_as(String email) {
       email = firstName+lastName + "@gmail.com";
       Driver.waitAndSendText(gmiBankPage.registrationEmailTextBox,email,5);
       registration.setEmail(email);
    }

    @Then("User provides the password as {string}")
    public void user_provides_the_password_as(String firstPassword) {
        firstPassword = faker.internet().password(10,15,true,true);
        this.password = firstPassword;
        Driver.waitAndSendText(gmiBankPage.registrationNewPassword,firstPassword,5);
        registration.setPassword(firstPassword);
    }

    @Then("User confirms the new password {string}")
    public void user_confirms_the_new_password(String secondPassword) {
        secondPassword = password;
        Driver.waitAndSendText(gmiBankPage.registrationNewPasswordConfirmation,secondPassword,5);

    }

    @Then("User sees the success as {string}")
    public void user_sees_the_success_as(String message) {
        Driver.waitAndClick(gmiBankPage.getRegistrationSubmit,5);

        WriteToTxt.saveRegistrationData(fileName,registration);

    }
}
