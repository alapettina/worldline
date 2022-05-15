package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.*;


public class Steps {

    private WebDriver driver = Hooks.driver;
    private FilterSection filterSection = new FilterSection(driver);
    private ProductPage productPage = new ProductPage(driver);
    private ResultPage resultPage = new ResultPage(driver);
    private TopBar topBar = new TopBar(driver);
    private LoginPage loginPage = new LoginPage(driver);

    private final String URL = "https://www.amazon.es/";


    @Given("the user go to the page amazon")
    public void goToThePage() {
        driver.get(URL);
        topBar.clickAceptCookies();
    }

    @When("^the user do a search (.*)")
    public void search(String option) {
        topBar.searchItem(option);
        topBar.clickSearch();
    }

    @When("^the user select a brand of the filters (.*) and sort the result by (.*)")
    public void selectBrandAndSortResults(String brand, String sortBy) {
        filterSection.clickBrandFilter(brand);
        filterSection.waitSpinnerDisappear();
        filterSection.clickOrderBy();
        filterSection.clickOrderItems(sortBy);
    }


    @When("^the user search the item (.*)")
    public void searchItem(String item) {
        resultPage.seachItem(item);
    }


    @When("^the user press buy the product")
    public void selectSizeAndBuy() {
        productPage.clickBuyButton();
    }


    @When("^the user put the email (.*) and press continue")
    public void setEmail(String email) {
        loginPage.setEmail(email);
        loginPage.clickContinue();
    }


    @Then("an error message appear for an incorrect email")
    public void validateErrorMessage() {
        Assert.assertTrue("The expected error not appears", loginPage.errorMessageExists());
        Assert.assertTrue("The expected error not appears", loginPage.getErrorMessage().contains("Ha surgido un problema"));
    }

}
