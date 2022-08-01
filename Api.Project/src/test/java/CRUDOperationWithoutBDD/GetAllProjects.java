package CRUDOperationWithoutBDD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class GetAllProjects {

	
	@Test
	public void getallprojects()
	{
		//Step1:Create required data
		Response resp = RestAssured.get("http://localhost:8084/dashboard/projects");
		
		
		//Validate the response
		ValidatableResponse validate = resp.then();
		validate.log().all();
		validate.assertThat().statusCode(200);
		
	}
}
