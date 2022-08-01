package CRUDWithoutBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateProjectTest
{

@Test
public void createProjectTest()
{
	
	//Step 1: Create Pre-Requisite for the post 
	JSONObject Jobj = new JSONObject();
	Jobj.put("createdBy", "Manzu");
	Jobj.put("projectName", "Laymre");
	Jobj.put("status", "completed");
	Jobj.put("teamSize", 10);
	
	    RequestSpecification req = RestAssured.given();
	    req.body(Jobj);
	    req.contentType(ContentType.JSON);
	    
	   
	    //Step 2:Perform the action 
	   Response resp = req.post("/addProject");
	   
	   //Validate the response
	   System.out.println(resp.asPrettyString());
	   
	    
	
	
	
}
}
