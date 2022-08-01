package DataDrivenTest;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;

import java.util.Random;

import org.json.simple.JSONObject;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class CreateProject {
		
	
	@DataProvider(name ="DataProvoider")
	public Object[][] postProject(){
		
		Random ran =new Random();
		int random = ran.nextInt(500);
		
		return new Object[][] {
			
			{"Ashwini_1989"+random,"TYSS895"+random,"Ongoing",15},
			{"Vanishri_1995"+random,"TYSS_1952"+random,"Created",10},
			{"Manjunath_1995"+random,"TYSS_2622"+random,"Completed",12},
			{"Chinnu_2003"+random,"TYSS_5864"+random,"Ongoing",16},
			{"Vidya+1995"+random,"TYSS255_5584"+random,"Created",13},
			
			
			
		};
		
//		Object[][] data =new Object[3][4];
//		
//		data[0][0]="Mahesh_1";
//		data[0][1]="TYSS_1";
//		data[0][2]="Created";
//		data[0][3]=22;
//		
//		data[1][0]="Mahesh_2";
//		data[1][1]="TYSS_2";
//		data[1][2]="Completed";
//		data[1][3]=23;
//		
//		data[2][0]="Mahesh_3";
//		data[2][1]="TYSS_3";
//		data[2][2]="Ongoing";
//		data[2][3]=24;
//	
//		return data;	
		
	}
	
	@Test(dataProvider = "DataProvoider")
	public void createProject(String createdBy,String projectName,String status,int teamSize ) {
		
		baseURI="http://localhost";
		port=8084;
		
		JSONObject Jobj=new JSONObject();
		Jobj.put("createdBy", createdBy);
		Jobj.put("projectName", projectName);
		Jobj.put("status", status);
		Jobj.put("teamSize", teamSize);
		
		Response resp = given()
		.body(Jobj)
		.contentType(ContentType.JSON)
		.when()
		.post("/addProject");
		resp.then().log().all();
	}

}


