package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import utils.Global_Vars;

public class ContactPage_Object extends BasePage_Object{

    private @FindBy(how = How.XPATH, using = "//input[@name = 'first_name']")
    WebElement firstName_Field;

    private @FindBy(xpath = "//input[@name = 'last_name']")
    WebElement lastName_Field;

    private @FindBy(xpath = "//input[@name = 'email']")
    WebElement emailAddress_Field;

    private @FindBy(xpath = "//textarea[@name='message']")
    WebElement comment_Field;

    private @FindBy(xpath = "//input[@value='SUBMIT']")
    WebElement submit_button;

    private @FindBy(xpath = "//div[@id='contact_reply']/h1")
    WebElement successfulSubmission_Message;

    public ContactPage_Object() {
        super();
    }

    public void navigateTo_WebDriverUniversity_Contact_Us_Page() {
        navigateTo_URL(Global_Vars.WEBDRIVER_UNIVERSITY_URL + "/Contact-Us/contactus.html");

    }

    public void setUnique_FirstName() {
        sendKeys(firstName_Field, "AutoFN" + generateRandomNumber(5));
    }

    public void setUnique_LastName() {
        sendKeys(lastName_Field, "AutoLN" + generateRandomNumber(5));
    }

    public void setUniqueEmailAddress() {
        sendKeys(emailAddress_Field, "AutoEmail" + generateRandomNumber(10) + "@gmail.com");
    }

    public void setUniqueComment() {
        sendKeys(comment_Field,"Hello world " + generateRandomString(20));
    }

    public void setSpecific_FirstName(String firstName) {
        sendKeys(firstName_Field, firstName );
    }

    public void setSpecific_LastName(String lastName) {
        sendKeys(lastName_Field, lastName);
    }

    public void setSpecificEmailAddress(String emailAddress) {
        sendKeys(emailAddress_Field, emailAddress);
    }

    public void setSpecific_Comment(String message) {
        sendKeys(comment_Field, message);
    }

    public void clickSubmit_Button() {
        waitForWebElementAndClick(submit_button);
    }

    public void validate_Successful_SubmissionMessage_Text() {
        waitFor(successfulSubmission_Message);
        Assert.assertEquals(successfulSubmission_Message.getText(), "Thank You for your Message!");

    }


}
