package CRUDWitBDD;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class DeleteTest {

	
	@Test
	public void deleteTest()
	{
		when()
		.delete("http://localhost:8084/projects/TY_PROJ_1005")
		.then().log().all()
		.assertThat().statusCode(204);
	}
}
