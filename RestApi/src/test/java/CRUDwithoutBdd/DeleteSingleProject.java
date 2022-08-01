package CRUDwithoutBdd;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class DeleteSingleProject {

	
	@Test
	public void deleteSingleProject()
	{
		RequestSpecification req = RestAssured.given();
		req.contentType(ContentType.JSON);
		Response resp = req.delete("http://localhost:8084/projects/TY_PROJ_1203");

		ValidatableResponse validate = resp.then();
		validate.log().all();
	}
}
