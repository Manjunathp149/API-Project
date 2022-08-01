package CRUDWithoutBDD;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PatchTest {

	
	@Test
	public void patchTest()
	{
		JSONObject json=new JSONObject();
		json.put("createdBy", "Anup");
		json.put("projectName", "mwipeskf5l24");
		json.put("status", "created");
		json.put("teamSize",12);
		
		RequestSpecification req = RestAssured.given();
		req.body(json);
		req.contentType(ContentType.JSON);
		
		Response resp = req.patch("http://localhost:8084/projects/TY_PROJ_001");
		resp.then().log().all();
		int act = resp.getStatusCode();
		Assert.assertEquals(200, act);
	}
}
