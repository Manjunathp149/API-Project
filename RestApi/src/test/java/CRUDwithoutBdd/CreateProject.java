package CRUDwithoutBdd;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class CreateProject {	

	
	@Test
	public void createProject()
	{
		JSONObject json=new JSONObject();
		json.put("createdBy", "Hilli");
		json.put("projectName", "vrfv");
		json.put("status", "created");

		RequestSpecification req = RestAssured.given();
		req.body(json);
		req.contentType(ContentType.JSON);
		Response resp = req.post("http://localhost:8084/addProject");
		
		
		System.out.println("Prettypeek"+resp.prettyPeek());
		System.out.println("status code"+resp.getStatusCode());
		System.out.println("status line"+resp.getStatusLine());
		
		ValidatableResponse validate = resp.then();
		validate.log().all();
 
	}
}
