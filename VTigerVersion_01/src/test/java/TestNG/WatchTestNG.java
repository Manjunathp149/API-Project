package TestNG;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import GenericUtilities.ExcelUtilities;	
public class WatchTestNG {

	ExcelUtilities r=new ExcelUtilities();
	@Test(dataProvider = "variety")
	public void variety1(String brand, String usage, String amt)
	{
		System.out.println("Watch brand"+" "+brand+" "+"Used for"+" "+usage+" "+"and the rate is"+" "+amt);
	}
	
	@DataProvider
	public Object[][] variety() throws IOException, Throwable
	{
		Object[][] o=new Object[4][3];
		
		String v1 = r.Readfromexcel("Watch", 0, 0);
		String v2 = r.Readfromexcel("Watch", 0, 1);
		String v3 = r.Readfromexcel("Watch", 0, 2);
		
		String v4 = r.Readfromexcel("Watch", 1, 0);
		String v5 = r.Readfromexcel("Watch", 1, 1);
		String v6 = r.Readfromexcel("Watch", 1, 2);
		
		String v7 = r.Readfromexcel("Watch", 2, 0);
		String v8 = r.Readfromexcel("Watch", 2, 1);
		String v9 = r.Readfromexcel("Watch", 2, 2);
		
		String v10 = r.Readfromexcel("Watch", 3, 0);
		String v11 = r.Readfromexcel("Watch", 3, 1);
		String v12 = r.Readfromexcel("Watch", 3, 2);


		o[0][0]=v1;
		o[0][1]=v2;
		o[0][2]=v3;
		
		o[1][0]=v4;
		o[1][1]=v5;
		o[1][2]=v6;
		
		o[2][0]=v7;
		o[2][1]=v8;
		o[2][2]=v9;
		
		o[3][0]=v10;
		o[3][1]=v11;
		o[3][2]=v12;

		return o;
	}
	
}
