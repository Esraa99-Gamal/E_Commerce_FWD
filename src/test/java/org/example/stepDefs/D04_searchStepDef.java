package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.testng.asserts.SoftAssert;

public class D04_searchStepDef {
    P03_homePage homePage = new P03_homePage(Hooks.driver);

    @Given("user clicks on search field")
    public void searchingAboutProduct(){
        homePage.searchField().click();
    }

    @And("^enters product name as ([^\"]*)$")
    public void entersProductName(String name) throws InterruptedException {
        homePage.searchField().sendKeys(name);
        Thread.sleep(3000);
    }

    @And("user clicks on search button")
    public void clickOnSearchButton(){
        homePage.searchButton().click();
    }
    @Then("search shows relevant results")
    public void resultOfSearch(){
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/search?q="),"Url");
        int count = homePage.productName().size();
        soft.assertTrue(count>0 ,"resultOfSearch");
        soft.assertAll();
    }


    @When("user search for product like \"(.*)\"$")
    public void userSearchForProduct(String search) {
        homePage.searchField().sendKeys(search);
    }

    @And("user click on search Button")
    public void userClicksOnSearchButton() {
        homePage.searchButton().click();
    }

    @Then("user could search successfully and go to search page")
    public void searchSuccessfully() {
        // First Assertion
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/search?q=Nokia"), "search URL");
        // Second Assertion
        int count = homePage.productName().size();
        soft.assertTrue(count > 0,"Search Result");
        // Assert All
        soft.assertAll();
    }

    @Then("user could search successfully with SKU")
    public void searchingBySkuSuccessfully() {
        // First Assertion
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/search?q=AP_MBP_13"), "URL after search");
        // Second Assertion
        int count = homePage.productName().size();
        soft.assertTrue(count > 0,"Search Result");
        // Assert All
        soft.assertAll();
    }
}
