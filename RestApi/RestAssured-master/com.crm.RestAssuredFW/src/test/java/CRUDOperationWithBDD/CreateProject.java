package CRUDOperationWithBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class CreateProject 
{
@Test
public void createProject() {
	

	
	// create required data
	JSONObject jobj=new JSONObject();
	jobj.put("createdBy", "Mahesh");
	jobj.put("projectName", "SEDT35");
	jobj.put("status", "Completed");
	jobj.put("teamSize", 20);
	
	
	given()
	.body(jobj)
	.contentType(ContentType.JSON)
	.when()
	.post("http://localhost:8084/addProject")
	.then()
	.assertThat().statusCode(201).log().all();
	
	
	
	
	
	
}
}
