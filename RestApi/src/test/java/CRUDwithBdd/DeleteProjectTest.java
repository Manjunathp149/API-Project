package CRUDwithBdd;

import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DeleteProjectTest {

	@Test
	  public void f() 
	  {
	   //Specify base URI
	   baseURI="https://reqres.in/api/users?page=2";
	              
	   //Request object
	   RequestSpecification httpRequest=given();
	              
	  
	   //print response in console window//Request payload sending along with post request
	 JSONObject requestParams=new JSONObject();
	              
	  requestParams.put("id",14);
	                          
	   httpRequest.header("Content-Type","application/json");
	              
	  httpRequest.body(requestParams.toJSONString()); // attach above data to the request
	               
	   //Response object
	   Response response=httpRequest.request(Method.DELETE);
	              
	   String responseBody=response.getBody().asString();
	   System.out.println("Response Body is:" +responseBody);
	              
	  //status code validation
	   int statusCode=response.getStatusCode();
	   System.out.println("Status code is: "+statusCode);
	   Assert.assertEquals(statusCode, 204);         
	  }
	}


