package ResponseValidation;

import static io.restassured.RestAssured.*;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

@Test
public class StaticResponseValidation {
	
	public void staticResponseValidation() {
		
	baseURI="http://localhost";
	port=8084;
	
	String expData="TY_PROJ_1002";
	//create data
	//send request and validate response
	Response resp = when().get("/projects");
	
	//validate
	String actData = resp.jsonPath().get("[0].projectId");
	Assert.assertEquals(expData, actData);
	resp.then().log().all();

	}
	
	

}
