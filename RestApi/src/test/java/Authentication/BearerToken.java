package Authentication;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class BearerToken {

	
	@Test
	public void bearerToken()
	{
		baseURI="https://api.github.com";
		
		JSONObject Job=new JSONObject();
		Job.put("name", "SDET-RestAAssured");
		Job.put("description", "RestFulWeb service FW Tested");
		
		
		given()
		.auth()
		.oauth2("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")
		.body(Job)
		.contentType(ContentType.JSON)
		.when()
		.post("/user/repos")
		.then()
		.assertThat().statusCode(201)
		.log().all();
	
		
	}
}
