package DifferentWaysToPostRequestTest;

import org.testng.annotations.Test;

import POJO.PojoUtils;
import io.restassured.http.ContentType;

import static   io.restassured.RestAssured.*;

public class PostByPojoTest {

	@Test
	public PostByPojoTest()
	{
		PojoUtils p1=new PojoUtils("sjs", "UTIUI", "created", 2);
		PojoUtils p2=new PojoUtils("jfk", "fnjfkd", "created", 3);
		
		given()
		.body(p1).body(p2)
		.contentType(ContentType.JSON)
		
		.when()
		.post("http://localhost:8084/addProject")
		
		.then()
		.log().all()
		.assertThat().statusCode(201);
	}
	
}
