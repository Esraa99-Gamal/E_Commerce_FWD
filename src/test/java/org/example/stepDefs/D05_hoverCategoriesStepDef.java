package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.example.pages.P04_categoryPage;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class D05_hoverCategoriesStepDef {
    P03_homePage home = new P03_homePage(Hooks.driver);
    String subCategoryName;
    P04_categoryPage category = new P04_categoryPage(Hooks.driver);

    @When("user hover category and select subcategory")
    public void userHoversCategory() throws InterruptedException {


        Actions action = new Actions(Hooks.driver);
        action.moveToElement(home.computers()).perform();
        action.moveToElement(home.computers()).perform();

        subCategoryName = home.desktops().getText().toLowerCase();

        Thread.sleep(2000);
    }

    @And("user click on subcategory")
    public void userClicksSubcategory(){
        home.desktops().click();
    }

    @Then("user go to relative product page")
    public void relativeSubcategory(){
        Assert.assertEquals(category.categoryList().getText().toLowerCase(),subCategoryName,"subcategory");
    }
}
