package TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class Data {
@Test(dataProvider = "Banking")
public void Banking(String from, String to, int amt)
{
System.out.println("From"+" "+from+" "+"to"+" "+to+" "+"Amount"+" "+amt);	
}

@DataProvider
public Object[][] Banking()
{
	Object[][] OA=new Object[4][3];
	OA[0][0]="Customer";
	OA[0][1]="Bank";
	OA[0][2]=5000;
	
	OA[1][0]="Customer";
	OA[1][1]="College";
	OA[1][2]=56000;
	
	OA[2][0]="Government";
	OA[2][1]="Customer";
	OA[2][2]=2500000;
	
	OA[3][0]="Customer";
	OA[3][1]="Vehicle";
	OA[3][2]=2360;
	return OA;

	
}
}
