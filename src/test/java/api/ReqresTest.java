package api;

import org.junit.Test;

import java.util.List;

import static io.restassured.RestAssured.given;
import static javax.swing.text.DefaultStyledDocument.ElementSpec.ContentType;

public class ReqresTest {

private static final String URL = "https://reqres.in/";
    @Test
    public void checkAvatarAndIDTest() {
        //Get thr list of Users
        List<UserData> list = given()
                .when()
                .contentType(ContentType.JSON)
                .get(URL + "/api/users?page=2")
                .then().log().all()
                .extract().body().jsonPath().getList("data", UserData.class);
    }
}
