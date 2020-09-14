package pages;
import static com.codeborne.selenide.Selenide.*;
import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.WebDriverFactory;


public class HomePage {

    public void onPage(){
        $("#create_link").shouldBe(Condition.visible);
        //WebDriverFactory.getDriver().findElConement(By.cssSelector("#create_link")).isDisplayed();
    }

    public void clickCreateIssueButton(){
        //WebDriverFactory.getDriver().findElement(By.cssSelector("#create_link")).click();
        $("#create_link").click();
    }
}
