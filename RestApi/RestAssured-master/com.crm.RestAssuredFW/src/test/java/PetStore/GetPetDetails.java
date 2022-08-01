package PetStore;



import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class GetPetDetails {
	@Test
	public void getPetDetails() {
		
		//baseURI="https://petstore.swagger.io/v2";
		given()
		.pathParam("petId","int64").
		when()
		.get("https://petstore.swagger.io/v2/pet/{petId}")
		.then().log().all();
		
	}

}
