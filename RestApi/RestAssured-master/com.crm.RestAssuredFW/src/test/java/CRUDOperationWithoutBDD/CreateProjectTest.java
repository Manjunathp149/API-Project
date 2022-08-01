package CRUDOperationWithoutBDD;

import java.util.Random;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class CreateProjectTest {
	@Test
	
	
	
	public  void createProjectTest()
	{
			Random random=new Random();
			int ranNum = random.nextInt(1000);
			
		//step 1: create required data
		JSONObject jobj=new JSONObject();
		jobj.put("createdBy", "Shri");
		jobj.put("projectName", "TYSS"+ranNum);
		jobj.put("status", "Completed");
		jobj.put("teamSize", 20);
		
		
		
		//step 2: send the request
		RequestSpecification req = RestAssured.given();
		req.body(jobj);
		req.contentType(ContentType.JSON);
		Response resp = req.post("http://localhost:8084/addProject");
		
		//step 3: validate the response
		System.out.println(resp.prettyPeek());
		ValidatableResponse validate = resp.then();
		validate.log().all();
		
		
		
	}

}
