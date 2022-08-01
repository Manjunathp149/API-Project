package CRUDwithBdd;

import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class CreateProjectTest {

	@Test
	public void createProjectTest()
	{
		
		JSONObject obj=new JSONObject();
		obj.put("createdBy","Liron");
		obj.put("projectName","Liek");
		obj.put("status","created");
		obj.put("teamsize",141);
		
		
		
		//Send the request
		given()
		.body(obj)
		.contentType(ContentType.JSON)
		.when()
		.post("http://localhost:8084/addProject")
		.then()
		.assertThat().statusCode(201).log().all();

		
	}
}
