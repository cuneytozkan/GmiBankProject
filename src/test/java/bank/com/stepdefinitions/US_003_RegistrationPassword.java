package bank.com.stepdefinitions;

import bank.com.pages.GmiBankPage;
import bank.com.utilities.ConfigReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class US_003_RegistrationPassword {

    GmiBankPage gmiBankPage = new GmiBankPage();

    @Given("Click on New Password textbox")
    public void click_on_new_password_textbox() {
        gmiBankPage.registrationNewPassword.click();

    }
    @Then("Assert that strenght bar is red")
    public void assert_that_strenght_bar_is_red() {
        String strengthbarColor= gmiBankPage.passwordStrengthRedBar.getCssValue("background-color");
        System.out.println(strengthbarColor);
        Assert.assertTrue(strengthbarColor.contains("rgba(255, 0, 0, 1)"));

    }
    @Then("Enter a password with one uppercase and lowercase letter")
    public void enter_a_password_with_one_uppercase_and_lowercase_letter() {
        gmiBankPage.registrationNewPassword.sendKeys("Sa");


    }
    @Then("Observe that strenght bar is orange")
    public void observe_that_strenght_bar_is_orange() {
        String orangeBar = gmiBankPage.passwordStrengthBrownBar.getCssValue("background-color");
        System.out.println("orangeBar: " + orangeBar);
        Assert.assertTrue(orangeBar.contains("rgb(255, 153, 0)"));

    }
    @Then("Enter one digit to password test box")
    public void enter_one_lowercase_letter_to_password_test_box() {
      gmiBankPage.registrationNewPassword.sendKeys("Sa1");
    }
    @Then("Strength Bar must be yellow")
    public void strength_bar_must_be_yellow() {
        String yellowBar = gmiBankPage.passwordStrengthYellowBar.getCssValue("background-color");
        System.out.println("yellow Bar : " + yellowBar);
        Assert.assertTrue(yellowBar.contains("rgb(255, 255, 0)"));

    }
    @Then("Click on password confirmation textbox")
    public void click_on_password_confirmation_textbox() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Copy new password text box value to new password confirmation texbox")
    public void copy_new_password_text_box_value_to_new_password_confirmation_texbox() {

    }

    @And("When User enters a password with at least one special char")
    public void whenUserEntersAPasswordWithAtLeastOneSpecialChar() {
        gmiBankPage.registrationNewPassword.sendKeys("Sa1.");
    }

    @And("Strength Bar must be green")
    public void strengthBarMustBeGreen() {
        String greenBar = gmiBankPage.passwordStrengthGreenBar.getCssValue("background-color");
        System.out.println("greenBAr : " + greenBar);
        Assert.assertTrue(greenBar.contains("rgb(153, 255, 0)"));
    }
}
