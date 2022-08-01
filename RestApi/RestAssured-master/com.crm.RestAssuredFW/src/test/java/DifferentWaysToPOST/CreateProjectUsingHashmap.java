package DifferentWaysToPOST;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.HashMap;

public class CreateProjectUsingHashmap {
	
	@Test
	
	
	public void createProjectUsingHashmap() {
		
		baseURI="http://localhost";
		port=8084;
		
		HashMap hm=new HashMap();
		hm.put("createdBy", "Kiran");
		hm.put("projectName", "TYSS98");
		hm.put("status", "Created");
		hm.put("teamSize", 20);
		
		given()
		.body(hm)
		.contentType(ContentType.JSON)
		.when()
		.post("/addProject")
		.then()
		.assertThat().statusCode(201)
		.log().all();
	
		
	}

}
