package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P02_login {
WebDriver driver ;
    public P02_login(WebDriver driver) {
        this.driver = driver;
    }
    //user go to login page
    public WebElement goToLoginPage(){
        return driver.findElement(By.cssSelector("a[class=\"ico-login\"]"));
    }

    //loginWithValidData
    public WebElement loginWithValidEmail(){
        return driver.findElement(By.id("Email"));
    }
    public WebElement loginWithValidPassword(){
        return driver.findElement(By.id("Password"));
    }

    public void loginSteps( String username , String password){
        loginWithValidEmail().clear();
        loginWithValidEmail().sendKeys(username);
        loginWithValidPassword().sendKeys(password);
}

//user press on login button
    public WebElement loginButton(){
        return driver.findElement(By.cssSelector("button[class=\"button-1 login-button\"]"));
    }

public WebElement ErrorMsg(){
        return driver.findElement(By.cssSelector("div[class=\"message-error validation-summary-errors\"]"));
}
}
