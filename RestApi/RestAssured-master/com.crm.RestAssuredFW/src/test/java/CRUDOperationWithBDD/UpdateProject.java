package CRUDOperationWithBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class UpdateProject {
	
	@Test
	public void updateProject() {
		
		// create required data
		JSONObject jobj=new JSONObject();
		jobj.put("createdBy", "Mahesh1");
		jobj.put("projectName", "SEDT3512");
		jobj.put("status", "Completed");
		jobj.put("teamSize", 20);
		
		given()
		.body(jobj)
		.contentType(ContentType.JSON)
		.when()
		.put("http://localhost:8084/projects/TY_PROJ_805")
		.then().assertThat().statusCode(200)
		.log().all();
	}

}
