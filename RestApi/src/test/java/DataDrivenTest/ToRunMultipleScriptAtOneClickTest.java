package DataDrivenTest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import ProjectLibrary.Projectlibraryclass;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class ToRunMultipleScriptAtOneClickTest {

	
	@Test(dataProvider = "CreateProject")
	public void RunMultipleScriptAtOneClick(String createdBy,String projectName, String status, int teamSize)
	{
	Projectlibraryclass p=new Projectlibraryclass(createdBy, projectName, status, teamSize)	;
//	System.out.println("createdBy:"+" "+createdBy);	
//	System.out.println("projectName:"+" "+projectName);	
//	System.out.println("status:"+" "+status);	
//	System.out.println("teamSize:"+" "+teamSize);	

	given()
	.body(p)
	.contentType(ContentType.JSON)
	.when()
	.post("http://localhost:8084/addProject")
	.then().assertThat().statusCode(201).log().all();
	
	}
	
	@DataProvider 
	public Object[][] CreateProject()
	{
		Object[][] o=new Object[5][4];
		o[0][0]="Redmi123";
		o[0][1]="Y2";
		o[0][2]="created";
		o[0][3]=10;
		
		o[1][0]="Realme123";
		o[1][1]="C";
		o[1][2]="completed";
		o[1][3]=11;
		
		o[2][0]="Samsung2123";
		o[2][1]="Y3";
		o[2][2]="created";
		o[2][3]=8;
		
		o[3][0]="Oppo123";
		o[3][1]="C3";
		o[3][2]="completed";
		o[3][3]=12;
		
		o[4][0]="Nokia123";
		o[4][1]="X2";
		o[4][2]="created";
		o[4][3]=4;

		
		return o;
		
		
	}
	
}

