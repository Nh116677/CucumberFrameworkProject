package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;
import utils.CommonMethods;

import java.time.Duration;

public class LoginSteps extends CommonMethods {

    //WebDriver driver;
    //LoginPage loginPage = new LoginPage()


    @Given("the user is on the HRMs login page")
    public void the_user_is_on_the_hr_ms_login_page() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }
    @When("the user leaves the username field empty")
    public void the_user_leaves_the_username_field_empty() {
        //Locate the username field and clear any existing text
       // WebElement usernameField = driver.findElement(By.id("txtUsername"));
        //usernameField.clear();
        loginPage.usernameField.clear("");


    }
    @When("the user enters a valid password in the password field")
    public void the_user_enters_a_valid_password_in_the_password_field() {
        loginPage.usernameField.sendKeys("Hum@nhrm123");
    }
    @When("the user clicks the Login button")
    public void the_user_clicks_the_login_button() {
        click(loginPage.loginButton);
    }
    @Then("the user should see an error message stating Username cannot be empty.")
    public void the_user_should_see_an_error_message_stating_username_cannot_be_empty() {
       // Locate the error message text
        WebElement errorMessage = driver.findElement(By.id(""));

        //Verify the error message text
        String actualMessage = errorMessage.getText();
        loginPage.usernameField.clear("");
        System.out.println("Username cannot be empty");

    }


    @Given("the user is on the HRMs login page")
    public void the_user_is_on_the_hr_ms_login_page() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @When("the user enters a valid username in the username field")
    public void the_user_enters_a_valid_username_in_the_username_field() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("the user leaves the password field empty")
    public void the_user_leaves_the_password_field_empty() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("the user clicks the Login button")
    public void the_user_clicks_the_login_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("the user should see an error message stating Password cannot be empty.")
    public void the_user_should_see_an_error_message_stating_password_cannot_be_empty() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


    @Given("the user is on the HRMs login page")
    public void the_user_is_on_the_hr_ms_login_page() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @When("the user enters an incorrect username in the username field")
    public void the_user_enters_an_incorrect_username_in_the_username_field() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("the user enters an incorrect password in the password field")
    public void the_user_enters_an_incorrect_password_in_the_password_field() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("the user clicks the Login button")
    public void the_user_clicks_the_login_button() {
        click(loginPage.loginButton);
    }
    @Then("the system should display an error message stating Invalid credentials.")
    public void the_system_should_display_an_error_message_stating_invalid_credentials() {


    }


    @Given("the user is on the HRMs login page")
    public void the_user_is_on_the_hr_ms_login_page() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @When("the user clicks the Login button without entering any credentials")
    public void the_user_clicks_the_login_button_without_entering_any_credentials() {
        click(loginPage.loginButton);
    }
    @Then("the error message Username cannot be empty. should be displayed near the username field")
    public void the_error_message_username_cannot_be_empty_should_be_displayed_near_the_username_field() {
        //Locate the error message element
        WebElement userNameErrorMsg = driver.findElement(By.id(""));

        //Verify the error message text
        String userNameActualMessage = userNameErrorMsg.getText();
        String userNameExpectedMessage = "Username cannot be empty.";
        Assert.assertEquals("Error message did not match",userNameExpectedMessage, userNameActualMessage);

    }
    @Then("the error message Password cannot be empty. should be displayed near the password field")
    public void the_error_message_password_cannot_be_empty_should_be_displayed_near_the_password_field() {
        //Locate the error message element
        WebElement passwordErrorMsg = driver.findElement(By.id(""));

        //Verify the error message text
        String passwordActualMessage = passwordErrorMsg.getText();
        String passwordExpectedMessage = "Username cannot be empty.";
        Assert.assertEquals("Error message did not match",passwordExpectedMessage, passwordActualMessage);

    }


    io.cucumber.junit.UndefinedStepException: The step 'the user attempted to login with invalid credentials' and 4 other step(s) are undefined.
    You can implement these steps using the snippet(s) below:

    @Given("the user attempted to login with invalid credentials")
    public void the_user_attempted_to_login_with_invalid_credentials() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("the user corrects the username field")
    public void the_user_corrects_the_username_field() {
        loginPage.usernameField.sendKeys("admin");
    }
    @When("the user corrects the password field")
    public void the_user_corrects_the_password_field() {
        loginPage.passwordField.sendKeys("Hum@nhrm123");
    }
    @When("the user clicks the Login button")
    public void the_user_clicks_the_login_button() {
        click(loginPage.loginButton);
    }
    @Then("the user should be redirected to the HRMs dashboard")
    public void the_user_should_be_redirected_to_the_hr_ms_dashboard() {
        //validating the existence of the element
        Assert.assertTrue(loginPage.welcomeMessageLoc.isDisplayed());

        String value = loginPage.welcomeMessageLoc.getText();
        //validating the exact message on the element
        Assert.assertEquals("Welcome Admin", value);
        System.out.println("Test passed");
    }



}
