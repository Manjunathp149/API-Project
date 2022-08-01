package DifferentWaysToPOST;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.io.File;

public class CreateProjectUsingJsonFile {
	
	@Test
	
	public void createProjectUsingJsonFile() {
		
		baseURI="http://localhost";
		port=8084;
		
		File file = new File(".\\TestData\\data.json");
		
		given()
		.body(file)
		.contentType(ContentType.JSON)
		.when()
		.post("/addProject")
		.then()
		.assertThat().statusCode(201)
		.log().all();
		
		
	}

}
