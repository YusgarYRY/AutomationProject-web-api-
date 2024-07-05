package pages;

import helper.utility;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import java.io.File;
import java.util.List;

import static helper.model.*;
import static org.assertj.core.api.Assertions.assertThat;
import static helper.endpoint.*;

public class ApiPage {

    String setUrl;
    String globalId;
    Response res;

    public void prepareUrlFor(String activeUrl){
        switch (activeUrl){
            case "GET_ALL_USERS" :
                setUrl = GET_ALL_USERS;
            break;
            case "CREATE_NEW_USER" :
                setUrl = CREATE_NEW_USER;
                break;
            default:
                System.out.println("input right url");
        }
        System.out.println("url yang aktif adalah : " + setUrl);
    }

    public void hitApiGetListUsers() {
        res = getListUser(setUrl);
        System.out.println(res.getBody().asString());
    }

    public void validationResponseBodyGetListUsers() {
        List<Object> id = (res.jsonPath().getList("id"));
        List<Object> name = (res.jsonPath().getList("name"));
        List<Object> email = (res.jsonPath().getList("email"));
        List<Object> gender = (res.jsonPath().getList("gender"));
        List<Object> status = (res.jsonPath().getList("status"));


        assertThat(id.get(0)).isNotNull();
        assertThat(name.get(0)).isNotNull();
        assertThat(email.get(0)).isNotNull();
        assertThat(gender.get(0)).isIn("male", "female");
        assertThat(status.get(0)).isIn("active", "inactive");
    }

    public void hitApiForGetUserById(int numberId){
        res = getUserById(numberId, setUrl);
        System.out.println(res.getBody().asString());
    }

    public void verifyStatusCodeIs(int statusCode){
        assertThat(res.statusCode()).isEqualTo(statusCode);
    }

    public void verifyBodyResponseForGetUserById(){
        Integer id = res.jsonPath().getInt("id");
        String name = res.jsonPath().getString("name");
        String email = res.jsonPath().getString("email");
        String gender = res.jsonPath().getString("gender");
        String status = res.jsonPath().getString("status");

        assertThat(id).isEqualTo(7014393);
        assertThat(name).isNotNull();
        assertThat(email).isNotNull();
        assertThat(gender).isIn("male", "female");
        assertThat(status).isIn("active", "inactive");
    }

    public void verifyUsingJsonSchema(String fileName){
        File fileJson = utility.jsonSchema(fileName);
        res.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(fileJson));
    }

    public void hitApiForCreateNewUser(){
        res = createNewUser(setUrl);
        System.out.println("hasil hit apinya adalah : " + res.getBody().asString());
    }

    public void verifyBodyResponseForCreateNewUser(){
        JsonPath jsonEvalutor = res.jsonPath();
        Integer id = (Integer) jsonEvalutor.get("id");
        String name = (String) jsonEvalutor.get("name");
        String email = (String) jsonEvalutor.get("email");
        String gender = (String) jsonEvalutor.get("gender");
        String status = jsonEvalutor.get("status");

        assertThat(id).isNotNull();
        assertThat(name).isEqualTo("Yusgar Risaldi Yusup");
        assertThat(email).isNotNull();
        assertThat(gender).isIn("male", "female");
        assertThat(status).isIn("active", "inactive");

        globalId = Integer.toString(id);
    }

    public void hitApiForUpdateDataActiveUserById(){
        res = updateUser(setUrl, globalId);
        System.out.println("hasil hit apinya adalah : " + res.getBody().asString());
    }

    public void verifyBodyResponseForUpdateDataActiveUser(){
        JsonPath jsonEvalutor = res.jsonPath();
        Integer id = (Integer) jsonEvalutor.get("id");
        String name = (String) jsonEvalutor.get("name");
        String email = (String) jsonEvalutor.get("email");
        String gender = (String) jsonEvalutor.get("gender");
        String status = jsonEvalutor.get("status");

        assertThat(id).isNotNull();
        assertThat(name).isEqualTo("Yusgaryry");
        assertThat(email).isNotNull();
        assertThat(gender).isIn("male", "female");
        assertThat(status).isIn("active", "inactive");
    }

    public void hitApiForDeleteActiveUserById(){
        res = deleteUser(setUrl, globalId);
        System.out.println(res.getBody().asString());
    }



}
