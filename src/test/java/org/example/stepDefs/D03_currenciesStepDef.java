package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P03_homePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class D03_currenciesStepDef {
P03_homePage homePage = new P03_homePage(Hooks.driver);

@Given("Select Euro currency from the dropdown list on the top left of home page")
public void SelectEuroCurrency(){
    Select select = new Select(homePage.customerCurrency());
    select.selectByVisibleText("Euro");
}
  @Then("verify Euro Symbol is shown")
public void verifyEuroSymbol(){
    int count = homePage.VerifyEuroSymbol().size();
    for (int i =0;i<count;i++){
        String symbol = homePage.VerifyEuroSymbolinPrice().getText();
        Assert.assertTrue(symbol.contains("€"));
    }
}
}
