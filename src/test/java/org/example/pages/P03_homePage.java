package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P03_homePage {
    WebDriver driver;
    public P03_homePage(WebDriver driver){
        this.driver= driver;
    }
    public WebElement customerCurrency(){
        return driver.findElement(By.id("customerCurrency"));
    }
    public WebElement VerifyEuroSymbolinPrice(){
        return driver.findElement(By.cssSelector("span[class=\"price actual-price\"]"));
    }
    public List VerifyEuroSymbol(){
        return driver.findElements(By.cssSelector("option[value=\"https://demo.nopcommerce.com/changecurrency/6?returnUrl=%2F\"]"));
    }

    public WebElement searchField(){
        return driver.findElement(By.id("small-searchterms"));
    }
    public WebElement searchButton(){
        return driver.findElement(By.cssSelector("button[type=\"submit\"]"));
    }
    public List productName(){
        return driver.findElements(By.cssSelector("h2[class=\"product-title\"]"));
    }
    public WebElement productTitle(){
        return driver.findElement(By.cssSelector("h2[class=\"product-title\"]"));
    }
    public WebElement computers(){
        return driver.findElement(By.cssSelector("ul[class=\"top-menu notmobile\"] [href=\"/computers\"]"));
    }

    public WebElement desktops(){
        return driver.findElement(By.cssSelector("ul[class=\"top-menu notmobile\"] [href=\"/desktops\"]"));
    }
    public WebElement slider(String sliderNum){
        return driver.findElement(By.xpath("(//a[@href=\"http://demo.nopcommerce.com/\"])["+sliderNum+"]"));
    }

    public WebElement facebook() {
        return driver.findElement(By.xpath("//a[@href=\"http://www.facebook.com/nopCommerce\"]"));
    }

    public WebElement twitter() {
        return driver.findElement(By.xpath("//a[@href=\"https://twitter.com/nopCommerce\"]"));
    }

    public WebElement rss() {
        return driver.findElement(By.xpath("//a[@href=\"/news/rss/1\"]"));
    }

    public WebElement youtube() {
        return driver.findElement(By.xpath("//a[@href=\"http://www.youtube.com/user/nopCommerce\"]"));
    }

    public WebElement wishList() {
        return driver.findElement(By.cssSelector("div[class=\"header-links\"] [href=\"/wishlist\"]"));
    }

    public List<WebElement> addWishList() {
        return driver.findElements(By.cssSelector("button[class=\"button-2 add-to-wishlist-button\"]"));
    }

    public WebElement wishSuccessMsg() {
        return driver.findElement(By.cssSelector("div[class=\"bar-notification success\"]"));
    }
    public WebElement closeBrowser() {
        return driver.findElement(By.cssSelector("span[class=\"close\"]"));
    }
}
