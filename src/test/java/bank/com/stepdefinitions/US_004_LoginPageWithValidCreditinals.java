package bank.com.stepdefinitions;

import bank.com.pages.GmiBankPage;
import bank.com.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class US_004_LoginPageWithValidCreditinals {

    GmiBankPage gmiBankPage = new GmiBankPage();

    @Then("User navigates to login page")
    public void user_navigates_to_login_page() {
        gmiBankPage.loginPageIcon.click();
    }


    @And("user enters username {string}")
    public void userEntersUsername(String username) {
        Driver.waitForPageToLoad(3);
        gmiBankPage.loginPageUserNameTextBox.sendKeys(username);





    }

    @And("user enters password {string}")
    public void userEntersPassword(String password) {
        gmiBankPage.loginPagePasswordTextBox.sendKeys(password);
    }

    @And("user click on siginButton")
    public void userClickOnSiginButton() {
        gmiBankPage.signInButton.click();

    }

    @Then("verify user is loged in")
    public void verifyUserIsLogedIn() {
        Driver.waitForPageToLoad(3);
        String expectedUserNameAfterSignIn = "Jane Hettinger";
        String actualUserNameAfterSignIn = gmiBankPage.LogInVisibleUserName.getText();

        System.out.println("user name  = " + actualUserNameAfterSignIn);
        Assert.assertEquals("signIn successfully : " , expectedUserNameAfterSignIn,actualUserNameAfterSignIn);

    }

    @Then("verify cancel button displayed")
    public void verifyCancelButtonDisplayed() {
        gmiBankPage.logInPageCancelButton.isEnabled();
    }
}
