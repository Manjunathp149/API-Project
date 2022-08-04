package CRUDwithoutBdd;


	

	import org.testng.annotations.Test;

	import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
	import io.restassured.response.ValidatableResponse;

	public class GetSingleProject {

		
		@Test
		public void getSingleProjectTest()
		{
			Response req = RestAssured.get("http://localhost:8084/projects/The Mile1234");
			JsonPath ev = req.jsonPath();
			System.out.println(ev.get("projectName"));
			//ValidatableResponse validate = req.then();
			//validate.log().all();
			
		//	System.out.println(validate.statusCode(200));
		}
	}


