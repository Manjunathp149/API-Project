package Parameters;

import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class PathParameterTest {

	
	@Test
	public void getSingleProject()
	{
		//Pre requisites
		baseURI ="http://localhost";
		port = 8084;
				
		
		
		
		    
		    given()
		     .queryParam("page", 1)
		     
		    .when()
		     .get("/projects")
		     
		    .then()
		     .log().all();
		}
	}

