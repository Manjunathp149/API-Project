package DifferentWaysToPostRequestTest;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.internal.path.json.mapping.JsonObjectDeserializer;

import static io.restassured.RestAssured.*;

public class CreateProjectByUsingJsonObject {

	
	@Test
	public void createPostRequest()
	{
		JSONObject Obj=new JSONObject();
		Obj.put("createdBy","manz");
		Obj.put("projectName","jiek");
		Obj.put("status","created");
		Obj.put("teamSize",56);

		given()
		.body(Obj)
		.contentType(ContentType.JSON)
		
		.when()
		.post("http://localhost:8084/addProject")
		
		.then()
		.log().all()
		//.assertThat().statusCode(201);
		.assertThat().statusCode(201);
		
	}
}
