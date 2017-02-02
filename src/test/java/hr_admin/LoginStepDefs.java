package hr_admin;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import hr_admin.utils.BrowserFactory;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by User on 16/01/2017.
 */
public class LoginStepDefs {
    WebDriver driver = BrowserFactory.getCurrentDriver();
    DashBoardPage dashBoardPage=new DashBoardPage();
    LoginPage loginPage=new LoginPage();
    EmployeeListPage employeeListPage=new EmployeeListPage();

    @Given("^Admin is on login page$")
    public void adminIsOnLoginPage() {
        Assert.assertTrue(loginPage.verifyUserIsOnLoginPage());
    }

    @When("^Admin enters username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
    public void enterAdminCredentials(String username, String password) {
        loginPage.enterUserName(username);
        loginPage.enterPassword(password);
    }

    @When("^Admin selects login$")
    public void selectLogin() {
        loginPage.selectLogin();
    }

    @Then("^Admin should login successfully$")
    public void verifyLogin() {
    //Verify that admin is on dashboard page
    Assert.assertTrue(dashBoardPage.verifyUserIsOnDashboardPage());
    }

    @Then("^Admin should see welcome message as \"([^\"]*)\"$")
    public void verifyWelcomeMessage(String welcomeMessage) {
        Assert.assertTrue(dashBoardPage.verifyWelcomeMessage(welcomeMessage));
    }

    @Then("^Admin should not login successfully$")
    public void verifyLoginFailed() {
        Assert.assertTrue(loginPage.verifyUserIsOnLoginPage());
   }

    @Then("^Admin should see message as \"([^\"]*)\"$")
    public void verifyErrorMessage(String errorMessage) {
        Assert.assertTrue(loginPage.verifyErrorMessage(errorMessage));
    }
}
