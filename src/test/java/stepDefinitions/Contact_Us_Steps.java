package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.BasePage_Object;
import pageObjects.ContactPage_Object;

public class Contact_Us_Steps extends BasePage_Object {

    private ContactPage_Object contactPage_object;

    public Contact_Us_Steps(ContactPage_Object contactPageObject) {
        this.contactPage_object = contactPageObject;

    }

    @Given("I access the webdriver university contact us page")
    public void i_access_the_webdriver_university_contact_us_page() {
        contactPage_object.navigateTo_WebDriverUniversity_Contact_Us_Page();

    }

    @When("I enter a unique first name")
    public void i_enter_a_unique_first_name() {
        contactPage_object.setUnique_FirstName();
    }

    @And("I enter a unique last name")
    public void i_enter_a_unique_last_name() {
        contactPage_object.setUnique_LastName();
    }

    @And("I enter a unique email address")
    public void i_enter_a_unique_email_address() {
        contactPage_object.setUniqueEmailAddress();
    }

    @And("I enter a unique comment")
    public void i_enter_a_unique_comment() {
        contactPage_object.setUniqueComment();
    }

    @And("I enter a specific first name {word}")
    public void i_enter_a_specific_first_name(String firstName) {
        contactPage_object.setSpecific_FirstName(firstName);
    }

    @And("I enter a specific last name {word}")
    public void i_enter_a_specific_last_name(String lastName) {
        contactPage_object.setSpecific_LastName(lastName);
    }

    @And("I enter a specific email address {word}")
    public void i_enter_a_specific_email_address(String emailAddress) {
        contactPage_object.setSpecificEmailAddress(emailAddress);
    }

    @And("I enter a specific comment {string}")
    public void i_enter_a_specific_comment(String message) {
        contactPage_object.setSpecific_Comment(message);
    }

    @And("I click on the submit button")
    public void i_click_on_the_submit_button() {
        contactPage_object.clickSubmit_Button();
    }

    @Then("I should be presented with a successful contact us submission message")
    public void i_should_be_presented_with_a_successful_contact_us_submission_message() {
        contactPage_object.validate_Successful_SubmissionMessage_Text();
    }


}
