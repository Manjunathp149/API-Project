package GenericUtilities;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Base {

	
	@BeforeSuite
	public void suite()
	{
		System.out.println("Suite started");
	}
	
	@BeforeTest
	public void test()
	{
		System.out.println("  test before");
	}
	
	
	@BeforeMethod
	public void method()
	{
		System.out.println("Method");
	}
}
