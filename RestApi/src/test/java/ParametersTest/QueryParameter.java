package ParametersTest;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class QueryParameter {

	
	
	@Test
	public void queryParameter()
	{
		baseURI ="https://reqres.in";
		
		given().queryParam("page", 2)
		.when()
		.get("/api/users/data")
		.then().log().all();
	}
}
