package ParametersTest;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class PathParameter {

	
	@Test
	public void pathParameter()
	{
		baseURI="http://localhost";
		port=8084;
		
		//Step 1: Create Pre-Requisite for the post 
				JSONObject Jobj = new JSONObject();
				Jobj.put("createdBy", "HGJF");
				Jobj.put("projectName", "hdfjaefioaw");
				Jobj.put("status", "completed");
				Jobj.put("teamSize", 10);
		
		
		
		given().body(Jobj).contentType(ContentType.JSON)
		.pathParam("projectId", "TY_PROJ_3602")
		.when()
		.patch("/projects/{projectId}")
		.then().log().all()
		.assertThat().statusCode(200);
	}
}
