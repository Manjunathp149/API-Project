package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AllMethodTest {
  @Test
  public void f() {
	  System.out.println("Hi");

  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("BeforeMethod");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("Aftermethod");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Beforeclass");

  }

  @AfterClass
  public void afterClass() {
	  System.out.println("Afterclass");

  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("BeforeTest");

  }

  @AfterTest
  public void afterTest() {
	  System.out.println("Aftertest");

  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("BeforeSuite");

  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("aftersuite");

  }

}
