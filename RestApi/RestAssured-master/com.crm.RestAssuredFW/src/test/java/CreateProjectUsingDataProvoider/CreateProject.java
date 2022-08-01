package CreateProjectUsingDataProvoider;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;

import java.io.FileInputStream;
import java.util.Properties;
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
			
			{"Shankar_1201"+random,"TYSS122"+random,"Ongoing",15},
			{"Santosh_2222"+random,"TYSS_212"+random,"Created",15},
			{"Pradeep_3223"+random,"TYSS313"+random,"Completed",15},
			{"Gopi_4223"+random,"TYSS_412"+random,"Ongoing",15},
			{"Krish_2531"+random,"TYSS255_"+random,"Created",15}
			
			
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


