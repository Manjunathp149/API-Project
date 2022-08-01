package JDBC;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataLaptop {

	@Test(dataProvider = "DataLap")
	public void DataLap(String from, String to)
	{
		System.out.println("From"+from+" "+"To"+" "+to);
	}
	
	@DataProvider
	public Object[][] DataLap()
	{
		Object[][] O=new Object[2][2];
		O[0][0]="HP";
		O[0][1]="Dell";

		
		O[1][0]="Sony";
		O[1][1]="D";

		return O;

		
		
		
	}
}
