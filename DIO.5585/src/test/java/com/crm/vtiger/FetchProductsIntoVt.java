package com.crm.vtiger;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import GenericUtilities.ReadAndWrite;

public class FetchProductsIntoVt {
public static void main(String[] args) throws Throwable {
	WebDriver driver;
	
	
	FileInputStream fis = new FileInputStream("./src/test/resources/propertyfile.Properties");
	Properties p=new Properties();
	p.load(fis);
	String URL=p.getProperty("url");
	String USERNAME=p.getProperty("username");
	String PASSWORD=p.getProperty("password");
    String BROWSER=p.getProperty("browser");
    
	
	if(BROWSER.equalsIgnoreCase("Chrome"))
	{
		System.setProperty("webdriver.chrome.driver","C://Users//Reshma//Downloads//chromedriver_win32 (1)/chromedriver.exe" );
		 driver=new ChromeDriver();
	}

	else if(BROWSER.equalsIgnoreCase("firefox"))
	{
		System.setProperty("webdriver.chrome.driver","./src/main/resources/geckodriver-v0.30.0-win64.zip" );
		 driver=new ChromeDriver();
	}
	else
	{
		System.setProperty("webdriver.chrome.driver","C://Users//Reshma//Downloads//chromedriver_win32 (1)/chromedriver.exe" );
		 driver=new ChromeDriver();
	}
	
	driver.get(URL);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys(USERNAME);
    driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
    driver.findElement(By.id("submitButton")).click();
    
    
	ReadAndWrite RW=new ReadAndWrite();
	
	
	String s=RW.Readfromexcel("Products", 0, 0);
	System.out.println(s);
	
}
}
