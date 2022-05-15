package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TopBar extends CommonMethods {

    private By searchInput = By.id("twotabsearchtextbox");
    private By searchButton = By.id("nav-search-submit-button");

    private By aceptCookies = By.id("sp-cc-accept");


    public TopBar(WebDriver driver) {
        super(driver);
    }


    public void clickAceptCookies() {
        driver.findElement(aceptCookies).click();
    }

    public void searchItem(String item) {
        driver.findElement(searchInput).sendKeys(item);
    }

    public void clickSearch() {
        driver.findElement(searchButton).click();
    }

}





