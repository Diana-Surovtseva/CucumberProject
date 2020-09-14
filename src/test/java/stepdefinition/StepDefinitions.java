package stepdefinition;

import com.codeborne.selenide.Configuration;
import com.google.common.io.Files;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import pages.CreateIssueWindow;
import pages.HomePage;
import pages.LoginPage;
import utils.WebDriverFactory;

import java.io.File;
import java.io.IOException;

public class StepDefinitions {
    @Before
    public void beforeCucumberScenario(Scenario scenario) {
        Configuration.browser = "firefox";
        //WebDriverFactory.createInstance("Chrome");
    }

    @After
    public void afterCucumberScenario(Scenario scenario) {
        if (scenario.getStatus().toString().contains("FAILED")) {
            try {
                takeScreenshot();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //WebDriverFactory.getDriver().close();
    }

    public void takeScreenshot() throws IOException {
        File scrFile = ((TakesScreenshot) WebDriverFactory.getDriver()).getScreenshotAs(OutputType.FILE);
        File trgtFile = new File(System.getProperty("user.dir") + "//screenshots/screenshot.png");
        System.out.println("SAVING Screenshot to " + trgtFile.getAbsolutePath());
        trgtFile.getParentFile().mkdir();
        trgtFile.createNewFile();
        Files.copy(scrFile, trgtFile);
    }

    @Then("^I navigate to Jira Login Page$")
    public void navigateToLoginPage() {
        new LoginPage().navigateTo();
    }

    @Then("^I enter user name - \"(.*?)\"$")
    public void enterUserName(String userName) {
        new LoginPage().enterUserName(userName);
    }

    @Then("^I enter password - \"(.*?)\"$")
    public void enterPassword(String password) {
        new LoginPage().enterPassword(password);
    }

    @Then("^I click on the login button$")
    public void clickLoginButton() {
        new LoginPage().clickLogin();
    }

    @When("^I am on the Home Page$")
    public void atTheHomePage() {
        new HomePage().onPage();
    }

    @When("^I debug$")
    public void debug() {
        int a = 0;
    }


    @And("^I click on the create issue button$")
    public void clickCreateIssueButton() {
        new HomePage().clickCreateIssueButton();
    }

    @Then("^Create issue window is open$")
    public void isProjectFieldDisplayed() {
        new CreateIssueWindow().isProjectFieldDisplayed();
    }

    @And("^I clear project field$")
    public void clearProjectField() {
        new CreateIssueWindow().clearProjectField();
    }

    @And("^I input text to project field$")
    public void inputProjectField() {
        new CreateIssueWindow().inputProjectField();
    }

    @And("^I go to the Issue type field$")
    public void pressTabAfterProjectField() {
        new CreateIssueWindow().pressTabAfterProjectField();
    }

    @And("^I clear to issue-type field$")
    public void clearIssueTypeField() {
        new CreateIssueWindow().clearIssueTypeField();
    }

    @And("^I input text to issue-type field$")
    public void enterIssueTypeField() {
        new CreateIssueWindow().enterIssueTypeField();
    }

    @And("^I go to the Summary field$")
    public void pressTabAfterIssueTypeField() {
        new CreateIssueWindow().pressTabAfterIssueTypeField();
    }


    @And("^I input text to Summary field$")
    public void enterSummary() {
        new CreateIssueWindow().enterSummary();
    }

    @And("^I clear Reporter field$")
    public void clearReporterField() {
        new CreateIssueWindow().clearReporterField();
    }

    @And("^I input text to Reporter field$")
    public void enterReporterField() {
        new CreateIssueWindow().enterReporterField();
    }

    @When("^I press on the create button$")
    public void pressCreateIssueButton() {
        new CreateIssueWindow().pressCreateIssueButton();
    }

    @Then("^An issue is created$")
    public void isPopUpPresent() {
        new CreateIssueWindow().isPopUpPresent();
    }

    @And("^The issue number is shown$")
    public void getPopUpText() {
        new CreateIssueWindow().getPopUpText().contains("WEBINAR");
    }

    @When("^I enter Username as \"([^\"]*)\" and Password as \"([^\"]*)\"$")
    public void I_enter_Username_as_and_Password_as(String userName, String password) {
        new LoginPage().enterUserName(userName);
        new LoginPage().enterPassword(password);
    }

    @Then("^login should be unsuccessful$")
    public void validateRelogin() {
        new LoginPage().validateRelogin();
    }
}



