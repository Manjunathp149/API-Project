package CRUDWitBDD;

import java.util.LinkedList;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class CreateProjectTest {
	
	@Test
	public void createTest()
	{
		JSONObject json=new JSONObject();
		json.put("createdBy", "Anup");
		json.put("projectName", "mid");
		json.put("status", "created");
		json.put("teamSize",12);
		
		given()
		.body(json)
		.contentType(ContentType.JSON)
		
		.post("http://localhost:8084/addProject")
		.then().log().all();
	}
	
}