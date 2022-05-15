package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage extends CommonMethods {


    private By buyButton = By.id("buy-now-button");


    public ProductPage(WebDriver driver) {
        super(driver);
    }


    public void clickBuyButton() {
        driver.findElement(buyButton).click();
    }

    public boolean elementEnabled() {
        return driver.findElement(buyButton).isEnabled();
    }

}





