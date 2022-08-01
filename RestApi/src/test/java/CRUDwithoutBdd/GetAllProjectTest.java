package CRUDwithoutBdd;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class GetAllProjectTest {

	
	@Test
	public void getAllProjectTest()
	{
		Response req = RestAssured.get("http://localhost:8084/projects");
		
		ValidatableResponse validate = req.then();
		//validate.log().all();
		System.out.println("THe Status code"+validate.statusCode(200));
		System.out.println(validate.contentType(ContentType.JSON));
	}
}
