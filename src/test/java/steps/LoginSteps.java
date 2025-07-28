package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.checkerframework.checker.units.qual.C;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;
import utils.CommonMethods;
import utils.ConfigReader;

import java.time.Duration;

public class LoginSteps extends CommonMethods {

    @Given("the user is on the HRMs login page")
    public void the_user_is_on_the_hr_ms_login_page() {

        driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        driver.manage().window().maximize();
    }
    @When("the user leaves the username field empty")
    public void the_user_leaves_the_username_field_empty() {
        loginPage.clearUserName();

    }
    @When("the user enters a valid password in the password field")
    public void the_user_enters_a_valid_password_in_the_password_field() {
      sendText(ConfigReader.read("userName"), loginPage.passwordField);
    }
    @When("the user clicks the Login button")
    public void the_user_clicks_the_login_button() {
       click(loginPage.loginButton);
    }
    @Then("the user should see an error message stating Username cannot be empty.")
    public void the_user_should_see_an_error_message_stating_username_cannot_be_empty() {
        System.out.println("Username can not be empty");
    }

    @When("the user enters a valid username in the username field")
    public void the_user_enters_a_valid_username_in_the_username_field() {
        loginPage.usernameField.sendKeys("admin");
    }
    @When("the user leaves the password field empty")
    public void the_user_leaves_the_password_field_empty() {
        loginPage.passwordField.sendKeys("");

    }
    @Then("the user should see an error message stating Password cannot be empty.")
    public void the_user_should_see_an_error_message_stating_password_cannot_be_empty() {
        System.out.println("Password can not be empty");
    }

    @When("the user enters an incorrect username in the username field")
    public void the_user_enters_an_incorrect_username_in_the_username_field() {
        sendText("adam", loginPage.passwordField);

    }
    @When("the user enters an incorrect password in the password field")
    public void the_user_enters_an_incorrect_password_in_the_password_field() {
       sendText("Hum@nh1234", loginPage.passwordField);
    }
    @Then("the system should display an error message stating Invalid credentials.")
    public void the_system_should_display_an_error_message_stating_invalid_credentials() {
        System.out.println("Invalid credentials");
    }


    @When("the user clicks the Login button without entering any credentials")
    public void the_user_clicks_the_login_button_without_entering_any_credentials() {
        click(loginPage.loginButton);

    }
    @Then("the error message Username and Password cannot be empty.")
    public void the_error_message_username_and_password_cannot_be_empty() {
        System.out.println("Username and Password can not be empty.");
    }

    @When("the user valid username and password field")
    public void the_user_valid_username_and_password_field() {
        sendText(ConfigReader.read("userName"), loginPage.usernameField);
        sendText(ConfigReader.read("password"), loginPage.passwordField);
    }


    @Then("the user should be redirected to the HRMs dashboard")
    public void the_user_should_be_redirected_to_the_hr_ms_dashboard() {
        System.out.println("Test passed");
    }





}