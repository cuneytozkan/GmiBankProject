package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.WeakHashMap;

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







}
