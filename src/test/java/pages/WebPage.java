package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static utility.setup.driver;

public class WebPage {


    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));


        By loginText = By.xpath("(//li[@class='nav-item'])[4]");
        By inputValidUsername = By.id("loginusername");
        By inputValidPassword = By.id("loginpassword");
        By clickLoginButton = By.xpath("//button[text()='Log in']");
        By loggingForm = By.id("logInModalLabel");
        By logoutText = By.xpath("(//li[@class='nav-item'])[5]");
        By clickLaptopMenu = By.xpath("(//a[@id='itemc'])[2]");
        By clickMonitorMenu = By.xpath("(//a[@id='itemc'])[3]");
        By clikItemName = By.xpath("(//a[@class='hrefch'])[1]");
        By clikItemName2 = By.xpath("(//a[@class='hrefch'])[2]");
        By clickAddToCartButton = By.xpath("//a[text()='Add to cart']");
        By clickHomePageText = By.xpath("(//a[@href='index.html'])[2]");
        By clickCartText = By.id("cartur");
        By seeAddedItem = By.id("totalp");
        By clickDeleteItem = By.xpath("//a[text()='Delete']");




    public void userInHomePage(){
        driver.get("https://www.demoblaze.com/index.html#carouselExampleIndicators");
    }

    public void userClickLoginText(){
        driver.findElement(loginText).click();
    }

    public void userInputValidUsernameWith(String username){
        driver.findElement(inputValidUsername).sendKeys(username);
    }

    public void userInputValidPasswordWith(String password){
        driver.findElement(inputValidPassword).sendKeys(password);
    }

    public void userClickLoginButton(){
        driver.findElement(clickLoginButton).click();
    }

    public void userSuccessToLogin(){
        driver.findElement(logoutText).isDisplayed();
    }

    public void userStayOnLoggingForm(){
        driver.findElement(loggingForm).isDisplayed();
    }

    public void userDirectToHomePage(){
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(logoutText));
        element.isDisplayed();
    }

    public void userClickLogoutText() {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(logoutText));
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].click();", element);
    }

    public void userSuccessToLogout(){
        driver.findElement(loginText).isDisplayed();
    }

    public void userGoingToMonitorPage() throws InterruptedException {
        driver.findElement(clickMonitorMenu).click();
        Thread.sleep(5000);
    }

    public void userGoingToLaptopPage() throws InterruptedException {
        driver.findElement(clickLaptopMenu).click();
        Thread.sleep(5000);
    }

    public void userAddItemToChart(){
        driver.findElement(clikItemName).click();
        driver.findElement(clickAddToCartButton).click();
    }

    public void userAddSecondItemToChart(){
        driver.findElement(clickMonitorMenu).click();
        driver.findElement(clikItemName2).click();
        driver.findElement(clickAddToCartButton).click();
    }

    public void userGoingToHomePage(){
        driver.findElement(clickHomePageText).click();
    }

    public void userClickCartText() {
        driver.findElement(clickCartText).click();
    }

    public void userSeeAddedItemInCart()  {
               driver.findElement(seeAddedItem).isDisplayed();
    }

    public void userClickDeleteText(){
        driver.findElement(clickDeleteItem).click();
    }

    public void userCanTSeeItemInCart(){
        wait.until(ExpectedConditions.invisibilityOfElementLocated(seeAddedItem));
    }

}
