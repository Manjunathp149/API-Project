package CRUDWithoutBDD;

import org.testng.annotations.Test;

import  io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetProjectsTest {

	
	@Test
	public void getProjectTest()
	{
		
		
		//step 1:Perform the action
		Response resp = RestAssured.get("http://localhost:8084/projects");
		
		resp.then().log().all();
		
	}
}
