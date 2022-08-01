package DataDrivenTest;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

import static io.restassured.RestAssured.*;

import java.util.Random;

public class PostGetDeleteProject {

	
	@Test
	public void postGetDelete()
	{
		//Create a Project
		JSONObject jobj=new JSONObject();
		jobj.put("createdby", "Manju construction");
		jobj.put("projectName", "TYSS-200");
		jobj.put("status", "created");
		jobj.put("teamsize", 5);
		
		
		
		
		given()
		.body(jobj)
		.contentType(ContentType.JSON)
		.when()
		.post("http://localhost:8084/addProject")
		.then()
		.assertThat().statusCode(201).log().all();
		
		
		//Get the details of the project
		String projectId= "TYSS-200";
Response req = RestAssured.get("http://localhost:8084/projects/"+projectId+"");
		
		ValidatableResponse validate = req.then();
		validate.log().all();
		
		
		//Delete the Project
		
	}
}
