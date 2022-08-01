package ResponseValidation;

import static io.restassured.RestAssured.when;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class StaticResponseValidation {
	
	
	@Test
	public void staticResponseValidation()
	{
		//baseURI="http://localhost";
		//port=8084;
		
		String expData="TY_PROJ_1202";
		 Response resp = when()
				.get("http://localhost:8084/projects");
		
		 
		 //Validate
		 String actData = resp.jsonPath().get("[2].projectId");
		Assert.assertEquals(expData, actData);
		resp.then().log().all();
	}
}
