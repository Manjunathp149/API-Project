package DiiferentWaysToPostRequest;

import static io.restassured.RestAssured.*;

import java.util.HashMap;
import java.util.Random;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.http.ContentType.*;

public class JSonProjectUsingHashMap {

	
	@Test
	public void JsonObject()
	{
		
		Random ran=new Random();
		int random = ran.nextInt(500);
	
	HashMap map=new HashMap();
	map.put("createdby", "Manju construction");
	map.put("projectName", "TYSS-"+random);
	map.put("status", "created");
	map.put("teamsize", 5);
	
	given()
	.body(map)
	.contentType(ContentType.JSON)
	.when()
	.post("http://localhost:8084/addProject")
	.then()
	.assertThat().statusCode(201).log().all();
	}
}
