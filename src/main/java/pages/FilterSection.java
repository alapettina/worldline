package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class FilterSection extends CommonMethods {


    private By brandSection = By.id("brandsRefinements");
    private By sellerSection = By.cssSelector("#filters > ul:nth-child(8)");
    private By brandElements = By.className("a-spacing-micro");

    private By orderBy = By.className("a-button-inner");
    private By drpdownOptions = By.className("a-dropdown-item");

    private By spinner = By.className("a-spinner-wrapper");


    public FilterSection(WebDriver driver) {
        super(driver);
    }


    public void clickBrandFilter(String choose) {
        List<WebElement> brands = driver.findElement(brandSection).findElements(brandElements);
        for (WebElement brand : brands) {
            if (brand.getText().contains(choose)) {
                brand.findElement(By.cssSelector("i")).click();
                break;
            }
        }
    }

    public void clickSellerFilter(String choose) {
        List<WebElement> brands = driver.findElement(sellerSection).findElements(brandElements);
        for (WebElement brand : brands) {
            if (brand.getText().contains(choose)) {
                brand.click();
                break;
            }
        }
    }

    public void clickOrderBy() {
        driver.findElement(orderBy).click();
    }

    public void clickOrderItems(String choose) {
        for (WebElement sortOptions : driver.findElements(drpdownOptions)) {
            if (sortOptions.getText().equalsIgnoreCase(choose)) {
                sortOptions.click();
                break;
            }
        }
    }


    public void waitSpinnerDisappear(){
        waitElementDisappear(spinner);
    }

}





