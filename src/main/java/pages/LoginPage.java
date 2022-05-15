package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class LoginPage extends CommonMethods {


    private By inputEmail = By.id("ap_email");
    private By continueButton = By.id("continue");

    private By errorMessage = By.id("auth-error-message-box");


    public LoginPage(WebDriver driver) {
        super(driver);
    }


    public void setEmail(String item) {
        driver.findElement(inputEmail).sendKeys(item);
    }

    public void clickContinue() {
        driver.findElement(continueButton).click();
    }

    public boolean errorMessageExists(){
        return driver.findElement(errorMessage).isDisplayed();
    }

    public String getErrorMessage(){
        return driver.findElement(errorMessage).getText();
    }
}





