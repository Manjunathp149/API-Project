package DiiferentWaysToPostRequest;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.Random;

public class CreateProjectUsingJsonOBject {


	@Test
	public void createProjectUsingJsonObject()
	{
		
		Random ran=new Random();
		int random = ran.nextInt(500);
		
		
		
		JSONObject jobj=new JSONObject();
		jobj.put("createdby", "Manju construction");
		jobj.put("projectName", "TYSS-"+random);
		jobj.put("status", "created");
		jobj.put("teamsize", 5);
		
		
		
		
		given()
		.body(jobj)
		.contentType(ContentType.JSON)
		.when()
		.post("http://localhost:8084/addProject")
		.then()
		.assertThat().statusCode(201).log().all();
	}
}
