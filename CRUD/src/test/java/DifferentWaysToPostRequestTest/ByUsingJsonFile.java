package DifferentWaysToPostRequestTest;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.io.File;
public class ByUsingJsonFile {

@Test
public void PostByJsonFile()
{
	File file =new File("./Request.json");
	
	baseURI="http://localhost";
	port=8084;
			
	given()
	.body(file)
	.contentType(ContentType.JSON)
	
	

	.when()
	.post("/addProject")
	
	.then()
	.log().all()
	.assertThat().statusCode(201);
	
}
}
