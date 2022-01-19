package bank.com.pages;

import bank.com.utilities.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GmiBankPage {
    //1. Constructor olustur
    public GmiBankPage(){
        //2.
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "(//a[@class='dropdown-toggle nav-link'])[2]")
    public WebElement homeIPageIcon;

    @FindBy(xpath = "//span[text()='Register']")
    public WebElement registrationIcon;

    @FindBy(id = "ssn")
    public WebElement registrationSsnTextBox;

    @FindBy(id = "firstname")
    public WebElement registrationFirstNameTextBox;

    @FindBy(id = "lastname")
    public WebElement registrationLastnameTextBox;

    @FindBy(id = "address")
    public WebElement registrationAdressTextBox;

    @FindBy(xpath = "//*[@id='mobilephone']")
    public WebElement registrationMobilPhoneNumberTextBox;

    @FindBy(xpath = "//*[@id='username']")
    public WebElement registrationUserNameTextBox;

    @FindBy(xpath = "//*[@id='email']")
    public WebElement registrationEmailTextBox;

    @FindBy(xpath ="//*[@id='firstPassword']" )
    public WebElement registrationNewPassword;

    @FindBy(xpath = "//*[@id='secondPassword']")
    public WebElement registrationNewPasswordConfirmation;

    @FindBy(id = "register-submit")
    public WebElement getRegistrationSubmit;

    @FindBy(xpath = "//*[text()='Failed to sign in!']")
    public WebElement wrongSuccesRegisterMessage;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[1]")
    public WebElement registrationSsnFeedBackMessage;

    @FindBy(xpath = "//*[contains(text(),'mobile phone number')]")
    public WebElement registrationMobilePhoneNumberFeedBackMessage;

    @FindBy(xpath = "//li[@style='background-color: rgb(255, 0, 0);']")
    public WebElement passwordStrengthRedBar;

    @FindBy(xpath = "//*[@id='strengthBar']/li[2]")
    public WebElement passwordStrengthBrownBar;

    @FindBy(xpath = "//*[@id='strengthBar']/li[3]")
    public WebElement passwordStrengthYellowBar;

    @FindBy(xpath = "//*[@id='strengthBar']/li[4]")
    public WebElement passwordStrengthGreenBar;

    @FindBy(xpath = "//span[text()='Sign in']")
    public WebElement loginPageIcon;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement loginPageUserNameTextBox;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement loginPagePasswordTextBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInButton;

    @FindBy(xpath = "//button[@class='btn btn-secondary']")
    public WebElement logInPageCancelButton;

    @FindBy(xpath = "(//a[@class='dropdown-toggle nav-link'])[3]")
    public WebElement LogInVisibleUserName;

    @FindBy(xpath = "//div[@class='alert alert-danger fade show']")
    public WebElement loginPageFailedMessage;







}
