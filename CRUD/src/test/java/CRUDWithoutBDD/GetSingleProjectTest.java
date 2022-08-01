package CRUDWithoutBDD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetSingleProjectTest {

	@Test
	public void getSingleProjectTest()
	{
		Response resp = RestAssured.get("http://localhost:8084/projects/TY_PROJ_1201");
	 resp.then().log().all();
	}
}
