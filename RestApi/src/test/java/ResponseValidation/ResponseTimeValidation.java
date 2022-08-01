package ResponseValidation;

import org.codehaus.jackson.format.MatchStrength;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.util.concurrent.TimeUnit;

public class ResponseTimeValidation {

	
	@Test
	public void responseTimeValidation()
	{
		baseURI="http://localhost";
		port=8084;
		
		
		Response resp = when().get("./projects");
		
		
		//Hamcrest matches tool which helps to validate response time
		//Hamcrest matchers has 
		resp.then().assertThat().time(Matchers.lessThan(5000L),	TimeUnit.MILLISECONDS);
	
	
	}
}
