package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.SearchEmployeePage;
import utils.CommonMethods;
import utils.ConfigReader;

public class SearchEmployeeSteps extends CommonMethods {
    @When("user enters username and password")
    public void user_enters_username_and_password() {
        sendText(ConfigReader.read("userName"), loginPage.usernameField);
        sendText(ConfigReader.read("password"), loginPage.passwordField);
    }
    @When("user clicks on login button")
    public void user_clicks_on_login_button() {
        click(loginPage.loginButton);

    }
    @Then("user is successfully logged in")
    public void user_is_successfully_logged_in() {
        System.out.println("Successful search");
    }


    @When("user clicks on employee list option")
    public void user_clicks_on_employee_list_option() {
        WebElement empListOption = driver.findElement(By.id("menu_pim_viewEmployeeList"));
        //the benefit of using this method is to get extra facilities available in it.
        //it will wait first for the element to be clickable
        click(empListOption);
    }

    @When("user enters valid employee id")
    public void user_enters_valid_employee_id() {
        sendText("50458427", searchEmployeePage.empIdField);
    }
    @Then("user should be able to see employee detail")
    public void user_should_be_able_to_see_employee_detail() {
        System.out.println("Successful id search");
    }


    @When("user enters valid employee name")
    public void user_enters_valid_employee_name() {
        sendText("Mark", searchEmployeePage.empIdField);
    }

    @When("user clicks on the search button")
    public void user_clicks_on_the_search_button() {
        click(searchEmployeePage.searchButton);
    }

    @Then("user should be able to see employee details")
    public void user_should_be_able_to_see_employee_details() {
        System.out.println("Employee name found successfully");
    }


    @When("user enters invalid employee name")
    public void user_enters_invalid_employee_name() {
        sendText("Maek", searchEmployeePage.empNameField);
    }

    @When("user click on the search button")
    public void user_click_on_the_search_button() {
        click(searchEmployeePage.searchButton);
    }

    @Then("user can see the name error message")
    public void user_can_see_the_name_error_message() {
        System.out.println("Invalid Employee name");
    }


    @When("user enters invalid employee ID")
    public void user_enters_invalid_employee_id() {
        sendText("3509238", searchEmployeePage.empIdField);
    }


    @Then("user can see the ID error message")
    public void user_can_see_the_ID_error_message (){
        System.out.println("Invalid employee ID.");
    }
}
