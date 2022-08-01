package CRUDOperationWithBDD;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class CreateProjectTest {

	@Test
	public void createProjectTest()
		// public static void main(String[] args)
		 {
				 //Step 1: Create a pre requisite
				//Step 2: Perform the actiomn
				Response resp = RestAssured.get("http://localhost:8084/projects");
					
				//Step 3: Provide Validation
				resp.then().log().all();
				int actStatus = resp.getStatusCode();
				Assert.assertEquals(200, actStatus);
			   }	
	}

