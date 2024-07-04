package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.WebPage;

public class WebStesp {
    WebPage webPage;

    public WebStesp() {
        this.webPage = new WebPage();
    }


    @Given("user in home page")
    public void userInHomePage() {
        webPage.userInHomePage();
    }

    @Then("User click login text")
    public void userClickLoginText() {
        webPage.userClickLoginText();
    }

    @And("user input valid username with {string}")
    public void userInputValidUsernameWith(String username) {
        webPage.userInputValidUsernameWith(username);
    }

    @And("user input valid password with {string}")
    public void userInputValidPasswordWith(String password) {
        webPage.userInputValidPasswordWith(password);
    }

    @And("user click login button")
    public void userClickLoginButton() {
        webPage.userClickLoginButton();
    }

    @And("user success to login")
    public void userSuccessToLogin() {
        webPage.userSuccessToLogin();
    }

    @And("user stay on logging form")
    public void userStayOnLoggingForm() {
        webPage.userStayOnLoggingForm();
    }

    @And("user direct in home page")
    public void userDirectInHomePage() {
        webPage.userDirectToHomePage();
    }

    @And("user click logout text")
    public void userClickLogoutText() {
        webPage.userClickLogoutText();
    }

    @And("user success to log out")
    public void userSuccessToLogOut() {
        webPage.userSuccessToLogout();
    }

    @Then("user going to monitor page")
    public void userGoingToMonitorPage()  throws InterruptedException {
        webPage.userGoingToMonitorPage() ;
    }

    @Then("user going to laptop page")
    public void userGoingToLaptopPage() throws InterruptedException {
        webPage.userGoingToLaptopPage();
    }

    @Then("User add item to chart")
    public void userAddItemToChart() {
        webPage.userAddItemToChart();
    }

    @And("user going to home page")
    public void userGoingToHomePage() {
        webPage.userGoingToHomePage();
    }

    @Then("User add second item to chart")
    public void userAddSecondItemToChart() {
        webPage.userAddSecondItemToChart();
    }

    @And("user click cart text")
    public void userClickCartText() {
        webPage.userClickCartText();
    }

    @And("user see added item in cart")
    public void userSeeAddedItemInCart()  {
        webPage.userSeeAddedItemInCart();
    }

    @And("user click delete text")
    public void userClickDeleteText() {
        webPage.userClickDeleteText();
    }

    @And("user can't see item in cart")
    public void userCanTSeeItemInCart() {
        webPage.userCanTSeeItemInCart();
    }



}
