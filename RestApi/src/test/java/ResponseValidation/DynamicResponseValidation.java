package ResponseValidation;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.port;
import static io.restassured.RestAssured.when;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class DynamicResponseValidation {

	
	@Test
	public void dynamicResponseValidation()
	{
		 String expData="TY_PROJ_1209";
		
		baseURI="http://localhost";
		port=8084;
		
		
		Response resp = when().get("/projects");
		
		
		//validate response
		Boolean flag=false;
		    List<String> list = resp.jsonPath().get("projectId");
		
		for(String s:list)
		{
			if(s.equalsIgnoreCase(expData))
			{
				flag=true;
				break;
			}
				
		}
		Assert.assertTrue(flag);
		resp.then().log().all();
	}
}
