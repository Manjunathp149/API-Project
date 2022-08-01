package CRUDWithoutBDD;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DeleteTest {

	@Test
	public void deleteTest()
	{
	Response resp = RestAssured.delete("http://localhost:8084/projects/TY_PROJ_001");
	resp.then().log().all();
	int act =resp.getStatusCode();
	Assert.assertEquals(204, act);
	}
}
