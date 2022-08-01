package ResponseValidation;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.util.List;

public class DynamicResponseValidation {

	@Test
	public void dynamicResponseValidation() {
		
		baseURI="http://localhost";
		port=8084;
		String expdata = "TY_PROJ_1002";
		
		 //create data
		Response resp = when().get("/projects");
		
		List<String> list = resp.jsonPath().get("projectId");
		boolean flag = false;
		for (String s : list) {
			
			if(s.equalsIgnoreCase(expdata)) {
				
				flag=true;
				break;
				
				
			}
		}
		Assert.assertTrue(flag);
	
	}
	
}
