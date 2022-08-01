package CRUDwithBdd;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class GetProjectDetails {

	@Test
	public void getProjectDetails()
	{
		when().get("http://localhost:8084/projects");
		
		//.then().assertThat().statusCode(200).log().all();
	System.out.println();
	}
	
	
	
	
}
