package com.crm.vtiger;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ToverifyOrganizationAndVerify
{
	
public static void main(String[] args) throws IOException
{
	
	WebDriver driver=null;
	FileInputStream fis = new FileInputStream("./src/test/resources/propertyfile.Properties");
	Properties p=new Properties();
	p.load(fis);
	String URL=p.getProperty("url");
	String USERNAME=p.getProperty("username");
	String PASSWORD=p.getProperty("password");
    String BROWSER=p.getProperty("Chrome");
    
	FileInputStream fs=new FileInputStream("./src/test/resources/Book1.xlsx");
	Workbook wb= WorkbookFactory.create(fs);
	Sheet s=wb.getSheet("sheet");
	Row r=s.getRow(1);
	Cell c=r.getCell(2);
	String value = c.getStringCellValue();
	System.out.println(value);
	
	Random R=new Random();
	int RN=R.nextInt(500);
	System.out.println(RN);
	
	if(BROWSER.equalsIgnoreCase("Chrome"))
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}

	else if(BROWSER.equalsIgnoreCase("firefox"))
	{
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();	
	}
	else
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get(URL);
	 driver.findElement(By.name("user_name")).sendKeys(USERNAME);
	    driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
	    driver.findElement(By.id("submitButton")).click();
	    Actions act=new Actions(driver);
	    act.click();
}
}
