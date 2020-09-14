package pages;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver;
import utils.WebDriverFactory;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginPage {

//    private WebDriver driver = null;
//
//    public LoginPage() {
//        WebDriver driver = WebDriverFactory.getDriver();
//    }
    //private By userNameInput = By.id("login-form-username");
    //private By passwordInput = By.id("login-form-password");
    //private By loginButton = By.id("login");

    public void enterUserName(String name) {
        //WebDriverFactory.getDriver().findElement(userNameInput).clear();
        //WebDriverFactory.getDriver().findElement(userNameInput).sendKeys(name);
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

    public void navigateTo(){
        //WebDriverFactory.getDriver().get("https://jira.hillel.it/secure/Dashboard.jspa");
        open("https://jira.hillel.it/secure/Dashboard.jspa");
    }
}
