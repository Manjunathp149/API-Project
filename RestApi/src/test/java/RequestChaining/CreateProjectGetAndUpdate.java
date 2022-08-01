package RequestChaining;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;

import java.util.Random;

import org.testng.annotations.Test;

import ProjectLibrary.Projectlibraryclass;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class CreateProjectGetAndUpdate {
	
	@Test
	public void createProjectAndUpdate() {
		
		baseURI="http://localhost";
		port=8084;
		
		Random ran = new Random();
		int random = ran.nextInt(500);
		
		Projectlibraryclass VLib= new Projectlibraryclass("Prasad"+random, "TYSS_"+random, "Created", 20);
				
		Response resp = given()
		.body(VLib)
		.contentType(ContentType.JSON)
		.when()
		.post("/addProject");
		resp.then().log().all();
		
		String Pid = resp.jsonPath().get("projectId");
		System.out.println(Pid);
		
		Response resp1 = given().pathParam("PID", Pid)
		.when()
		.get("/projects/{PID}");
		resp1.then()
		.assertThat().statusCode(200).log().all();
		
		String get = resp1.jsonPath().get("projectId");
		System.out.println(get);
		
		VLib.setStatus("completed");
		VLib.setProjectName("OKIL");
		given().pathParam("proId", get)
		.body(VLib)
		.contentType(ContentType.JSON)
		.when()
		.put("/projects/{proId}")
		.then()
		.log().all();	
		
	}

}
