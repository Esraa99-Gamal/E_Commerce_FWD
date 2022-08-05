package org.example.pages;

import net.bytebuddy.asm.Advice;
import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class P01_Registration {
    WebDriver driver;
    public P01_Registration(WebDriver driver){
        this.driver = driver;
    }

//user go to register page
public WebElement Register_button(){
   // return driver.findElement(By.cssSelector("a[class=\"ico-register\"]"))
        return driver.findElement(By.className("ico-register"));
}
//user select gender type
public WebElement Gender(){
        return driver.findElement(By.id("gender-female"));
}
//user enter first name and last name
    public WebElement firstNames(){
        return driver.findElement(By.id("FirstName"));
    }
    public WebElement lastNames(){
        return driver.findElement(By.id("LastName"));
    }

//user enter date of birth
    public WebElement DateOFbirth(){

        return driver.findElement(By.name("DateOfBirthDay"));
    }
    public WebElement DateOfBirthMonth(){
        return driver.findElement(By.cssSelector("select[name=\"DateOfBirthMonth\"]"));
    }
    public WebElement DateOfBirthYear(){
        return driver.findElement(By.name("DateOfBirthYear"));
    }

    //user enter email
    public WebElement enterEmail(){
        return driver.findElement(By.id("Email"));
    }

    public WebElement companyName(){
        return driver.findElement(By.id("Company"));
    }

    //user fills Password fields
    public WebElement enterPassword(){
        return driver.findElement(By.id("Password"));
    }
    public WebElement confirmPassword(){
        return driver.findElement(By.id("ConfirmPassword"));
    }
    public WebElement submitButton(){
        return driver.findElement(By.id("register-button"));
    }

public WebElement successMsg(){
        return driver.findElement(By.cssSelector("div[class=\"result\"]"));
}
}
