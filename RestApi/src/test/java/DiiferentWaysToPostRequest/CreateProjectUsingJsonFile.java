package DiiferentWaysToPostRequest;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.io.File;

public class CreateProjectUsingJsonFile {

	@Test
	public void createprojectByUsingJsonFFile()
	{
	File file =new File("./Request/Req.json");
	
	given()
	.body(file)
	.contentType(ContentType.JSON)
	.when()
	.post("http://localhost:8084/addProject")
	.then().assertThat().statusCode(201).log().all();
		
	}
	
}
