package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.By;
import org.testng.Assert;

public class D06_homeSlidersStepDef {
    P03_homePage home = new P03_homePage(Hooks.driver);;

    @When("user clicks on first slider")
    public void clickOnFirstSlider(){
        Hooks.driver.findElement(By.cssSelector("a[rel=\"0\"]")).click();
        home.slider("1").click();
    }

    @Then("relative product for first slider is displayed")
    public void firstSlideDisplayed() throws InterruptedException {
        Thread.sleep(200);
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/nokia-lumia-1020","URL of First Slide");
    }

    @When("user clicks on second slider")
    public void clickOnSecondSlider(){
        Hooks.driver.findElement(By.cssSelector("a[rel=\"1\"]")).click();
        home.slider("2").click();
    }

    @Then("relative product for second slider is displayed")
    public void secondSlideDisplayed() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/iphone-6","URL of Second Slide");
    }
}
