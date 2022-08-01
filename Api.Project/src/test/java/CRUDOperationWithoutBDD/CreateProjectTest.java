package CRUDOperationWithoutBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateProjectTest {
@Test
public void createProjectTest()
{
	//Step1:Create Required Data
	JSONObject job=new JSONObject();
	job.put("createdBy", "Manju");
	job.put("projectName", "TYSSSS");
	job.put("status", "created");
	
	
	
	//step2:Send the request
	RequestSpecification req = RestAssured.given();
	req.body(job);
	req.contentType(ContentType.JSON);
	Response resp = req.post("http://localhost:8084/addProject");
	
	
	//Step3:Validate the response
	System.out.println(resp.prettyPeek());
	/*System.out.println(resp.getStatusCode());
	System.out.println(resp.getTime());
	
	ValidatableResponse validate = resp.then();
	validate.log().all();*/
}
}
