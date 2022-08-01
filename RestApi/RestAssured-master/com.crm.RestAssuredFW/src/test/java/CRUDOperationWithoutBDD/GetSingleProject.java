package CRUDOperationWithoutBDD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class GetSingleProject {
	
	@Test
	
	public void getSingleProject() {
		
		//step 1: create required data		
				//step 2: send the request
						Response resp = RestAssured.get("http://localhost:8084/projects/TY_PROJ_1808");
				
				//step 3: validate the response
				//System.out.println(resp.prettyPeek());
				ValidatableResponse validate = resp.then();
				validate.log().all();
	}

}
