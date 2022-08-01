package ResponseValidation;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.util.concurrent.TimeUnit;

public class ResponseTimeValidation {
	
	@Test
	public void responseTimeValidation() {
		
		baseURI="http://localhost";
		port=8084;
		
		Response resp = when().get("/projects");
		//Hamcrest Matchers-- Tool which helps to validate the rsponse time
		//Hamcrest matchers has a class called Matchers which has methods like
		//lessthan(),greaterThan(),lessThanOrEqualTo
		
		resp.then().assertThat().time(Matchers.lessThan(10000L),TimeUnit.MILLISECONDS);
		
	}

}
