package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;
import utils.ConfigReader;
import utils.ExcelReader;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class AddEmployeeSteps extends CommonMethods {

    @When("user enters valid username and password")
    public void user_enters_valid_username_and_password() {
        sendText(ConfigReader.read("userName"), loginPage.usernameField);
        sendText(ConfigReader.read("password"), loginPage.passwordField);
    }

    @When("user click on login button")
    public void user_click_on_login_button() {
        click(loginPage.loginButton);
    }

    @Then("user is able to see dashboard page")
    public void user_is_able_to_see_dashboard_page() {
        System.out.println("Test passed");
    }

    @When("user clicks on PIM option")
    public void user_clicks_on_pim_option() {
        WebElement pimOption = driver.findElement(By.id("menu_pim_viewPimModule"));
        click(pimOption);
    }


    @When("user clicks on Add employee option")
    public void user_clicks_on_add_employee_option() {
        WebElement addEmployeeButton = driver.findElement(By.id("menu_pim_addEmployee"));
        click(addEmployeeButton);
    }

    @When("user enters firstName, middleName  and lastName")
    public void user_enters_first_name_middle_name_and_last_name() {
        sendText("John", addEmployeePage.firstNameLoc);
        sendText("Ada", addEmployeePage.middleNameLoc);
        sendText("Smith", addEmployeePage.lastNameLoc);
    }

    @When("user enters firstName {string}, middleName {string} and lastName {string}")
    public void user_enters_first_name_middle_name_and_last_name(String firstName, String middleName, String lastName) {
        sendText(firstName, addEmployeePage.firstNameLoc);
        sendText(middleName, addEmployeePage.middleNameLoc);
        sendText(lastName, addEmployeePage.lastNameLoc);

    }

    @When("user clicks on save button")
    public void user_clicks_on_save_button() {
        click(addEmployeePage.saveButton);
    }

    @Then("employee is added successfully")
    public void employee_is_added_successfully() {
        System.out.println("Employee name is added successfully");
    }

    @When("user enters firstname,  middlename, lastname and employee Id")
    public void user_enters_firstname_middlename_lastname_and_employee_id() {
        sendText("Michael", addEmployeePage.firstNameLoc);
        sendText("Ada", addEmployeePage.middleNameLoc);
        sendText("Smith", addEmployeePage.lastNameLoc);
        sendText("49032523", addEmployeePage.employeeIdLoc);

    }

    @When("user enters {string} and {string} and {string} values")
    public void user_enters_and_and_values(String fN, String mN, String lN) {
        sendText(fN, addEmployeePage.firstNameLoc);
        sendText(mN, addEmployeePage.middleNameLoc);
        sendText(lN, addEmployeePage.lastNameLoc);
    }



    @When("user enters firstname middlename and lastname values from excel table")
    public void user_enters_firstname_middlename_and_lastname_values_from_excel_table(io.cucumber.datatable.DataTable dataTable) {

        List<Map<String, String>> employeeNames = dataTable.asMaps();
        for (Map<String, String> employee : employeeNames) {
            System.out.println(employee.get("firstName"));
            System.out.println(employee.get("middleName"));
            System.out.println(employee.get("lastName"));
        }
    }


    @When("user enters multiple employees using excel file")
    public void user_enters_multiple_employees_using_excel_file() throws IOException {

        List<Map<String, String>> employeeNames = ExcelReader.read();
        for (Map<String, String> employee : employeeNames) {
            System.out.println(employee.get("firstName"));
            System.out.println(employee.get("middleName"));
            System.out.println(employee.get("lastName"));

            sendText(employee.get("firstName"), addEmployeePage.firstNameLoc);
            sendText(employee.get("middleName"), addEmployeePage.middleNameLoc);
            sendText(employee.get("lastName"), addEmployeePage.lastNameLoc);
            click(addEmployeePage.saveButton);
            WebElement addEmployeeButton = driver.findElement(By.id("menu_pim_addEmployee"));
            click(addEmployeeButton);

        }
    }


}
