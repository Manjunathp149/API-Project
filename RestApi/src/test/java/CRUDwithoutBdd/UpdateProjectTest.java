package CRUDwithoutBdd;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class UpdateProjectTest {

	
	@Test
	public void updateSingleProject()
	{
		JSONObject job=new JSONObject();
		job.put("createdBy", "Mau");
		job.put("projectName", "tyre");
		job.put("status", "created");
		
		
		
		//step2:Send the request
		RequestSpecification req = RestAssured.given();
		req.body(job);
		req.contentType(ContentType.JSON);
		Response resp = req.put("http://localhost:8084/projects/TY_PROJ_1203");
		
		
		//Step3:Validate the response
		System.out.println(resp.prettyPeek());
		System.out.println(resp.getStatusCode());
		System.out.println(resp.getTime());
		
		ValidatableResponse validate = resp.then();
		validate.log().all();
	}	
	}





