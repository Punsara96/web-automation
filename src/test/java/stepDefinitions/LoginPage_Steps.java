package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import pageObjects.BasePage_Object;
import pageObjects.LoginPageObject;

public class LoginPage_Steps extends BasePage_Object {

    private LoginPageObject login_pageObject;  // dependency injection

    public LoginPage_Steps(LoginPageObject login_pageObject) {
        this.login_pageObject = login_pageObject;

    }

    @Given("I access the webdriver university login page")
    public void i_access_the_webdriver_university_login_page() {
        login_pageObject.navigateTo_WebDriverUniversity_Login_Page();
    }

    @When("I enter valid username {string}")
    public void i_enter_valid_username(String username) {
        sendKeys(By.id("text"), username);

    }

    @When("I enter valid username {word}")
    public void i_enter_a_valid_username(String username) {
        login_pageObject.setUsername_field(username);
    }

    @And("I enter valid password {}")
    public void i_enter_valid_password(String password) {
        login_pageObject.setPassword_field(password);
    }

    @And("I click on the login button")
    public void i_click_on_the_login_button() {
        login_pageObject.clickOn_Login_Button();
    }

    @Then("I should be presented with a successful login submission message")
    public void i_should_be_presented_with_a_successful_login_submission_message() {
        login_pageObject.validate_SuccessfulLogin_Message();

    }

    @Then("I should be presented with a unsuccessful login submission message")
    public void i_should_be_presented_with_a_unsuccessful_login_submission_message() {
        login_pageObject.validate_UnsuccessfulLogin_Message();

    }

    @Then("I should be presented with a successful login submission message {}")
    public void i_should_be_presented_with_a_successful_login_submission_message(String expectedMessage) {
       waitForAlert_Validate_Text(expectedMessage);

    }

}
