package Parameter;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class PathParaMeter {
	@Test
	
	public void pathParaMeter() {
		baseURI="http://localhost";
		port=8084;
		
		//get Single project
		given()
		.pathParam("pid","TY_PROJ_805")
		.when()
		.get("/projects/{pid}")
		.then().log().all();
		
		
				
	}

}
