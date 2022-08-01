package ParametersTest;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class PathParameter {

	
	@Test
	public void pathParameter()
	{
		baseURI="http://localhost";
		port=8084;
		
		given()
		.pathParam("projectId", "TY_PROJ_1206")
		.when()
		.get("/projects/{projectId}")
		.then().log().all();
	}
}
