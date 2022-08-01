package Authentication;

import org.testng.Reporter;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class Oauth2Test {

	@Test
	public void oauth2Test()
	{
		baseURI="http://coop.apps.symfonycasts.com";
	Response resp = given()

	.formParam("client_id", "LaymerShop")
	.formParam("client_secret", "6a31f08c7e99b79c1f2b18b24121ca56")
	.formParam("grant_type", "client_credentials")
	.formParam("redirect_uri", "http://Laymershop.com")
	.formParam("code", "authorization_code")
	.when()
	.post(" /token");
	resp.then().log().all();
	
	//Step2:
	String token = resp.jsonPath().get("access_token");
	Reporter.log(token, true);
	
	//Step3:
	given()
	.auth().oauth2(token)
	.pathParam("USER_ID", 3537)
	.when()
	.post("/api/{USER_ID}/chickens-feed")
	.then().log().all();
	}
}
