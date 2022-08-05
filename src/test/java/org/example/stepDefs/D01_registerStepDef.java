package org.example.stepDefs;

import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_Registration;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class D01_registerStepDef {
    P01_Registration registration = new P01_Registration(Hooks.driver);

    @Given("user go to register page")
    public void go_to_register_page(){
        registration.Register_button().click();
    }

    @When("user select gender type")
    public void selectGender(){
        registration.Gender().click();
    }

    @And("user enter first name and last name")
    public void enterNames(){
        registration.firstNames().sendKeys("Esraa");
        registration.lastNames().sendKeys("Gamal");
    }

    @And("user enter date of birth")
    public void enterDate(){
        Select selectDay = new Select(registration.DateOFbirth());
        selectDay.selectByVisibleText("30");

        Select selectMonth = new Select(registration.DateOfBirthMonth());
        selectMonth.selectByVisibleText("October");

        Select selectYear = new Select(registration.DateOfBirthYear());
        selectYear.selectByVisibleText("1999");
    }

    @And("user enter email")
    public void enterEmailAndCpmpanyName(){
        registration.enterEmail().sendKeys("esraa66m@gmail.com");
        registration.companyName().sendKeys("CompanyExample");
    }

    @And("user fills Password fields")
    public void enterPassword(){
        registration.enterPassword().sendKeys("PassW@rd12345");
        registration.confirmPassword().sendKeys("PassW@rd12345");
    }

    @Then("user clicks on register button")
    public void clickRegisterButton(){
        registration.submitButton().click();
    }

    @And("success message is displayed")
    public void successMsg(){
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(registration.successMsg().isDisplayed(),"Your registration completed");
        String expectedResult = "rgba(76, 177, 124, 1)";
        String actualResult = registration.successMsg().getCssValue("color");
        soft.assertEquals(actualResult,expectedResult,"Msg Color");
        soft.assertAll();
    }
}
