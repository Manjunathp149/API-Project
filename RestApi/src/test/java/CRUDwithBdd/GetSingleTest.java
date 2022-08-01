package CRUDwithBdd;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;



public class GetSingleTest {

	
	@Test
	public void getSingleTest()
	{
		String projectId= "TY_PROJ_001";

		when().get("http://localhost:8084/projects/"+projectId)
		
		.then().assertThat().statusCode(200).log().all();
//Response req = RestAssured.get("http://localhost:8084/projects/"+projectId+"");
		
		/*ValidatableResponse validate = req.then();
		validate.log().all();*/
	}
}
