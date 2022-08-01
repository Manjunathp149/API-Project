package CRUDOperationWithoutBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class UpdateProject 
{
	@Test
	public void updateTheProject() {
		
				//step 1: create required data
				JSONObject job=new JSONObject();
				job.put("createdBy", "Shri98");
				job.put("projectName", "SDET12");
				job.put("status", "onGoing");
				job.put("teamSize", 25);
				
				//step 2: send the request
				RequestSpecification req = RestAssured.given();
				req.body(job);
				req.contentType(ContentType.JSON);
				Response resp = req.put("http://localhost:8084/projects/TY_PROJ_1808");
				
				//step 3: validate the response
				ValidatableResponse validate = resp.then();
				validate.log().all();
				
		
	}
}
