package CRUDWitBDD;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class PutTest {

	@Test
	public void createTest()
	{
		JSONObject json=new JSONObject();
		json.put("createdBy", "Anup");
		json.put("projectName", "middo");
		json.put("status", "created");
		json.put("teamSize",12);
		
		given()
		.body(json)
		.contentType(ContentType.JSON)
		
		.put("http://localhost:8084/projects/TY_PROJ_1005")
		.then()
		.assertThat()
		.statusCode(200)
		.log().all();
		
	}
}
