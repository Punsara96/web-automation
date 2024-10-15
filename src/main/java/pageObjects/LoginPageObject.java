package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Global_Vars;

public class LoginPageObject extends BasePage_Object {
    private @FindBy(id = "text")
    WebElement username_field;

    private @FindBy(id = "password")
    WebElement password_field;

    private @FindBy(id = "login-button")
    WebElement login_Button;

    public LoginPageObject() {
        super();
    }

    public void navigateTo_WebDriverUniversity_Login_Page() {
        navigateTo_URL(Global_Vars.WEBDRIVER_UNIVERSITY_URL + "/Login-Portal/index.html");

    }

    public void setUsername_field(String username) {
        sendKeys(username_field, username);
    }

    public void setPassword_field(String password) {
        sendKeys(password_field, password);
    }

    public void clickOn_Login_Button() {
        waitForWebElementAndClick(login_Button);
    }

    public void validate_SuccessfulLogin_Message() {
        waitForAlert_Validate_Text("validation succeeded");
    }

    public void validate_UnsuccessfulLogin_Message() {
        waitForAlert_Validate_Text("validation failed");
    }
}
