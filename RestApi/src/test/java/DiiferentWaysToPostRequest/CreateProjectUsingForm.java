package DiiferentWaysToPostRequest;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;

public class CreateProjectUsingForm {

	@Test
	public void createProjectUsingForm()
	{
		//prerequisites
		String expData = "manjuuzzz123";
		
		
		//action
		
		Response resp = when().get("http://localhost:8084/projects");
				        
		
		//validation
		String actData = resp.jsonPath().get("[0].projectName");
		Assert.assertEquals(actData, expData);
		System.out.println("data verfied ");
		
		resp.then().log().all();
	}
}
