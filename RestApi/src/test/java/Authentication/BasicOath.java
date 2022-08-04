package Authentication;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class BasicOath {

	
	@Test
	public void basicAuth()
	{
		baseURI="http://localhost";
		port=8084;
		
		
		given()
		.auth().basic("rmgyantra","rmg@9999")
		.when()
		.get("/login")
		.then().log().all();
	}
		/*public void digestAuth()
		{
			given()
			.auth().digest("rmgyantra","rmg@9999")
			.when()
			.get("/login")
			.then().log().all();
		}
	
	/*	public void  primitiveAuthTest()
		{
			baseURI="http://localhost";
			port=8084;
			
			
			given()
			.auth()
			.preemptive().basic("rmgyantra","rmg@9999")
			.when()
			.get("/login")
			.then().log().all();
	}*/
}
