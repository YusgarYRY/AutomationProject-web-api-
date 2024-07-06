package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.ApiPage;

public class ApiStep {
    ApiPage apiPage;
    public ApiStep() {
        this.apiPage = new ApiPage();
    }

    @Given("Prepare Url for {string}")
    public void prepareUrlFor(String activeUrl) {
        apiPage.prepareUrlFor(activeUrl);
    }

    @And("hit api get list users")
    public void hitApiGetListUsers() {
        apiPage.hitApiGetListUsers();
    }

    @Then("verify response body get list users")
    public void validationResponseBodyGetListUsers() {
        apiPage.validationResponseBodyGetListUsers();
    }


    @Then("Hit api for get user by id {int}")
    public void hitApiForGetUserById(int numberId) {
        apiPage.hitApiForGetUserById(numberId);
    }

       @And("verify status code is {int}")
    public void verifyStatusCodeIs(int statusCode) {
        apiPage.verifyStatusCodeIs(statusCode);
    }

    @And("verify body response for get user by id")
    public void verifyBodyResponseForGetUserById() {
        apiPage.verifyBodyResponseForGetUserById();
    }

    @And("verify using json schema {string}")
    public void verifyUsingJsonSchema(String fileName) {
        apiPage.verifyUsingJsonSchema(fileName);
    }

    @Then("Hit api for Create new user")
    public void hitApiForCreateNewUser() {
        apiPage.hitApiForCreateNewUser();
    }

    @And("verify body response for create new user")
    public void verifyBodyResponseForCreateNewUser() {
        apiPage.verifyBodyResponseForCreateNewUser();
    }


    @Then("Hit api for update data active user")
    public void hitApiForUpdateDataActiveUserById() {
        apiPage.hitApiForUpdateDataActiveUserById();
    }

    @And("verify body response for update data active user")
    public void verifyBodyResponseForUpdateDataActiveUser() {
        apiPage.verifyBodyResponseForUpdateDataActiveUser();
    }

    @Then("Hit api for Delete Active User")
    public void hitApiForDeleteActiveUserById() {
        apiPage.hitApiForDeleteActiveUserById();
    }


    @And("Get post from spesific user with id {int}")
    public void getPostFromSpesificUser(int numberId) {
        apiPage.getPostFromSpesificUser(numberId);
    }

    @And("verify body response for get post from active user")
    public void verifyBodyResponseForGetPostFromActiveUser() {
        apiPage.verifyBodyResponseForGetPostFromActiveUser();
    }
}
