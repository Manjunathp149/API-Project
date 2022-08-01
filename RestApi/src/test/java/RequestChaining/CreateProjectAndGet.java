package RequestChaining;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;

import java.util.Random;

import org.testng.annotations.Test;

import ProjectLibrary.Projectlibraryclass;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class CreateProjectAndGet {
	@Test
	public void createProjectAndGet() {
		
		baseURI="http://localhost";
		port=8084;
		
		Random ran=new Random();
		int random = ran.nextInt(200);
		
		Projectlibraryclass Vlib=new Projectlibraryclass("HI"+random, "TYSS_"+random, "Created", 20);
		// create a post request and capture the response
		Response resp = given()
		.body(Vlib)
		.contentType(ContentType.JSON)
		.when()
		.post("/addProject");
		resp.then().log().all();
		
		//using json path retrieve projectId from the response
		String pid = resp.jsonPath().get("projectId");
		
		//Use this projectId for another request
	    System.out.println(pid);
		
			given().pathParam("proID", pid)
			.when()
			.get("/projects/{proID}").then()
			.assertThat().statusCode(200).log().all();
			
	}

}
