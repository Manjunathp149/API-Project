package CRUDOperationUsingPojo;

import org.testng.annotations.Test;

import ProjectLibrary.VariableLibrary;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.Random;

public class PojoClass {
	
	@Test
	public void pojoclass() {
		baseURI="http://localhost";
		port=8084;
		
		Random ran=new Random();
		int random = ran.nextInt(200);
		
		//create data
		VariableLibrary VLib=new VariableLibrary("Shri_"+random, "TYSS_"+random, "Ongoing", 20);
		
		// send the request and validate response
		given()
		.body(VLib)
		.contentType(ContentType.JSON)
		.when()
		.post("/addProject")
		.then()
		.assertThat().statusCode(201).log().all();
		
		
	}
	
	

	
}
