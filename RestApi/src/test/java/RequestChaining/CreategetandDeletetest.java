package RequestChaining;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

import static io.restassured.RestAssured.*;

import java.nio.file.Path;

public class CreategetandDeletetest {

	
	@Test
	public
	void stativ()
	{
		baseURI="http://localhost";
		port=8084;
		
		JSONObject obj=new JSONObject();
		obj.put("createdBy","jhkllh");
		obj.put("projectName","fjjgg");
		obj.put("status","created");
		obj.put("teamsize",141);
		
		
	
		
		 Response resp = given()
			.body(obj)
			.contentType(ContentType.JSON)
			
		.when()
			.post("/addProject");
		resp.then().log().all();
		
		
		 String pid = resp.jsonPath().get("projectId");
		 System.out.println(pid);
		 
		 
		 given()
		 	.pathParam("proid", pid)
		 	
		 .when()
		 	.get("/projects/{pid}")
		 	
		 	.then().log().all();
		 
		 given()
		 	.pathParam("proid", pid)
		 	
		 .when()
		 	.delete("/projects/{pid}")
		 	
		 	.then().statusCode(204)
		 	.log().all();
	}
}
