package pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import utils.WebDriverFactory;

import static com.codeborne.selenide.Selenide.$;

public class CreateIssueWindow {

    public void isProjectFieldDisplayed() {
//        WebDriverFactory.getDriver().findElement(By.cssSelector("#project-field")).isDisplayed();
//
//        try {
//            Thread.sleep(15);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        WebDriverFactory.getDriver().findElement(By.cssSelector("#project-field")).isDisplayed();
        $("#project-field").shouldBe(Condition.visible);
    }


    public void clearProjectField() {
        //WebDriverFactory.getDriver().findElement(By.cssSelector("#project-field")).clear();
        $("#project-field").clear();
    }

    public void inputProjectField() {
        //WebDriverFactory.getDriver().findElement(By.cssSelector("#project-field")).sendKeys("Webinar (WEBINAR)");
        $("#project-field").setValue("Webinar (WEBINAR)");
    }

    public void pressTabAfterProjectField() {
        $("#project-field").pressTab();
    }

//    public boolean isIssueTypeFieldDisplayed() {
//
//    }

    public void clearIssueTypeField() {
        $("#issuetype-field").clear();
    }

    public void enterIssueTypeField() {
        $("#issuetype-field").setValue("Task");
    }

    public void pressTabAfterIssueTypeField() {
        $("#issuetype-field").pressTab();
    }

//    public boolean isSummaryFieldDisplayed() {
//
//    }

    public void enterSummary() {
        $("#summary").setValue("Test cucumber task");
    }

    public void clearReporterField() {
        $("#reporter-field").clear();
    }

    public void enterReporterField() {
        $("#reporter-field").setValue("webinar5");
    }

    public void pressCreateIssueButton() {
        $("#create-issue-submit").click();
    }

    public boolean isPopUpPresent() {
        return $("#aui-flag-container").should(Condition.visible).isDisplayed();
    }
    public String getPopUpText() {
        String popUpText = $("#aui-flag-container").getText();
        return popUpText;
    }
}
