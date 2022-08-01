package PetStore;

import PetLibrary.Category;
import PetLibrary.Pet;
import PetLibrary.Tags;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class AddPetDetails {
	
	@Test
	public void petStore() {
		
	Category cat=new Category(05, "Animal");
	Tags tg=new Tags(05, "tag1");
	Pet p=new Pet(05, cat, "doggie", "www", tg, "available");
	
	Response resp = given()
	.body(p)
	.contentType(ContentType.JSON)
	.when()
	.post("https://petstore.swagger.io/v2/pet");
	resp.then().log().all();
	System.out.println(resp.prettyPrint());
		
		//baseURI="https://petstore.swagger.io/v2";
		
//		given()
//		.body(pet)
//		.contentType(ContentType.JSON)
//		.when()
//		.post("https://petstore.swagger.io/v2/pet")
//		.then().log().all();
//		
//		given()
//		.body(pet)
//		.contentType(ContentType.JSON)
//		.when()
//		.post("https://petstore.swagger.io/v2/pet")
//		.then()
//		.assertThat().statusCode(405)
//		.log().all();
//		
		
		
		
	}

}
