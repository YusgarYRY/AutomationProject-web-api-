package helper;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;
import static helper.utility.pembuatEmail;

public class model {

    public static RequestSpecification request;

    public static void setUpHeader (){
        request = RestAssured.given()
                .header("Content-Type", "application/json")
                .header("Accept", "application/json")
                .header("Authorization", "Bearer d14bf113a205a9972f2d06ed8c01f53f2071f0a7d6d601c1c6e5578f77d42392");
    }

    public static Response getListUser(String endpoint) {
        setUpHeader();
        return request.when().get(endpoint);
    }

    public static Response getUserById (int numberId, String endpoint) {
        setUpHeader();
        String finalEndpoint = endpoint + "/" + numberId;
         return request.when().get(finalEndpoint);
    }

    public static Response createNewUser (String endpoint){
        String name = "Yusgar Risaldi Yusup";
        String gender = "male";
        String email = pembuatEmail();
        String status = "active";
        JSONObject payload = new JSONObject();
        payload.put("name", name);
        payload.put("gender", gender);
        payload.put("email", email);
        payload.put("status", status);
        setUpHeader();
        return request.when().body(payload.toString()).when().post(endpoint);

    }

    public static Response updateUser (String endpoint, String globalId) {
        setUpHeader();
        String name = "Yusgaryry";
        String gender = "male";
        String email = pembuatEmail();
        String status = "active";
        JSONObject payload = new JSONObject();
        payload.put("name", name);
        payload.put("gender", gender);
        payload.put("email", email);
        payload.put("status", status);

        String finalEndpoint = endpoint + "/" + globalId;
        return request.body(payload.toString()).when().patch(finalEndpoint);
    }

    public static Response deleteUser (String endpoint, String globalId) {
        setUpHeader();
        String finalEndpoint = endpoint + "/" + globalId;
        return request.when().delete(finalEndpoint);
    }
}
