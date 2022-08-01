package CRUDWitBDD;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class GetTest {

	
	@Test
	public void getTest()
	{
		when()
		.get("http://localhost:8084/projects/TY_PROJ_1005")
		.then()
		.log().all()
		.assertThat()
		.statusCode(200);
		
	}
}
