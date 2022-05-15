package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ResultPage extends CommonMethods {

    private By itemsList = By.className("s-card-container");
    private By itemListDescription = By.className("s-title-instructions-style");
    private By pagination = By.className("s-pagination-item");
    private By nextButton = By.className("s-pagination-next");


    public ResultPage(WebDriver driver) {
        super(driver);
    }


    public void seachItem(String choosenItem) {
        int pages = driver.findElements(pagination).size() - 2;
        while (pages >= 0) {
            for (WebElement item : driver.findElements(itemsList)) {
                if (item.findElement(itemListDescription).getText().contains(choosenItem)) {
                    item.click();
                   return;
                }
            }
            driver.findElement(nextButton).click();
            pages = pages - 1;
        }
    }


}








