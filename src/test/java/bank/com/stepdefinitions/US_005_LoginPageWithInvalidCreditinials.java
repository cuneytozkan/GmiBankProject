package bank.com.stepdefinitions;

import bank.com.pages.GmiBankPage;
import bank.com.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class US_005_LoginPageWithInvalidCreditinials {

    GmiBankPage gmiBankPage = new GmiBankPage();

    @Then("User see Failed Message")
    public void user_see_failed_message() {
        String actualFailedMessage = gmiBankPage.loginPageFailedMessage.getText();
        System.out.println(actualFailedMessage);
        String expectedMessage = "Failed to sign in! Please check your credentials and try again.";
        Assert.assertTrue(expectedMessage.contains(actualFailedMessage));
        Driver.wait(3);
    }


}
