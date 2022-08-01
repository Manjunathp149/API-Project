package DiiferentWaysToPostRequest;

import java.util.Random;

import org.testng.annotations.Test;

import ProjectLibrary.Projectlibraryclass;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class CreateProjectUsingPojo {

	@Test
	public void createProjectUsingPojo()
	{
		Random ran=new Random();
		int random = ran.nextInt(500);
	
		Projectlibraryclass poj=new Projectlibraryclass("Hello", "Tysss"+random, "created", 5);
		
		

		given()
		.body(poj)
		.contentType(ContentType.JSON)
		.when()
		.post("http://localhost:8084/addProject")
		.then().assertThat().statusCode(201).log().all();
	}
	
	
	
}
