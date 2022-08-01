package RequestChaining;

import org.testng.annotations.Test;

import ProjectLibrary.VariableLibrary;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;

import java.util.Random;

public class CreateProjectGetAndDelete {
	
	@Test
	public void createProjectGetAndDelete() {
		
		
	baseURI="http://localhost";
	port=8084;
	
	//To get random number
	Random ran=new Random();
	int randum = ran.nextInt(500);
	
	VariableLibrary var=new VariableLibrary("Sachin"+randum, "SDET_"+randum, "Completed", 10);
	
	// create a post request and capture the response
	Response resp = given()
	.body(var)
	.contentType(ContentType.JSON)
	.when()
	.post("/addProject");
	resp.then().log().all();
	
	//using json path retrieve projectId from the response
	String pId = resp.jsonPath().get("projectId ");
	System.out.println(pId);
	
	//Use this projectId for another request (to get project )
	Response resp1 = given().pathParam("PID", pId)
	.when()
	.get("/projects/{PID}");
	resp1.then()
	.assertThat().statusCode(200).log().all();
	
	//using json path retrieve projectId from the response resp1
	String proId = resp1.jsonPath().get("projectId");
	System.out.println(proId);
	
	//Use this projectId for another request (to delete project )
	RequestSpecification resp2 = given().pathParam("prID", proId);
	resp2.when()
	.delete("/projects/{prID}")
	.then()
	.assertThat().statusCode(204).log().all();
	
	}

}
