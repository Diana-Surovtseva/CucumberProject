package pages;

import com.codeborne.selenide.WebDriverRunner;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginPage {


    public void enterUserName(String name) {
        $("#login-form-username").setValue(name);
    }

    public void enterPassword(String password) {
        //WebDriverFactory.getDriver().findElement(passwordInput).sendKeys(password);
        $("#login-form-password").setValue(password);
    }

    public void clickLogin() {
        //WebDriverFactory.getDriver().findElement(loginButton).click();
        $("#login").click();
    }

    public void navigateTo() {
        open("https://jira.hillel.it/secure/Dashboard.jspa");
    }

    public void validateRelogin() {
        if (WebDriverRunner.url().equalsIgnoreCase(
                "https://jira.hillel.it/secure/RapidBoard.jspa?rapidView=118")) {
            System.out.println("Test Pass");
        } else {
            System.out.println("Test Failed");
        }
    }
}