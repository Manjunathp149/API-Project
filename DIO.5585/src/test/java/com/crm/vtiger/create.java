package com.crm.vtiger;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import GenericUtilities.ReadAndWrite;
import io.github.bonigarcia.wdm.WebDriverManager;

public class create {
	public static void main(String[] args) throws IOException, Throwable 
	{
		
		WebDriverManager.chromedriver().setup();
	    WebDriver driver= new ChromeDriver();
	    ReadAndWrite RW=new ReadAndWrite();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
		FileInputStream fis = new FileInputStream("./src/test/resources/propertyfile.Properties");
		Properties p=new Properties();
		p.load(fis);
		String URL=p.getProperty("url");
		String USERNAME=p.getProperty("username");
		String PASSWORD=p.getProperty("password");
	    driver.get(URL);
	    driver.findElement(By.name("user_name")).sendKeys(USERNAME);
	    driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
	    driver.findElement(By.id("submitButton")).click();
	    driver.findElement(By.xpath("//a[.='Products']")).click();
	    driver.findElement(By.xpath("//img[@title='Create Product...']")).click();
	    String R1= RW.Readfromexcel("Products", 1, 1);
	    driver.findElement(By.name("productname")).sendKeys(R1);
	    driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
	    driver.findElement(By.xpath("//img[@title='Create Product...']")).click();
	    String R2= RW.Readfromexcel("Products", 2, 1);
	    driver.findElement(By.name("productname")).sendKeys(R2);
	    driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
	    driver.findElement(By.xpath("//img[@title='Create Product...']")).click();
	    String R3= RW.Readfromexcel("Products", 3, 1);
	    driver.findElement(By.name("productname")).sendKeys(R3);
	    driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
	    driver.findElement(By.xpath("//img[@title='Create Product...']")).click();
	    String R4= RW.Readfromexcel("Products", 4, 1);
	    driver.findElement(By.name("productname")).sendKeys(R4);
	    driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
	    driver.findElement(By.xpath("//img[@title='Create Product...']")).click();
	    String R5= RW.Readfromexcel("Products", 5, 1);
	    driver.findElement(By.name("productname")).sendKeys(R5);
	    driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
	    driver.findElement(By.xpath("//img[@title='Create Product...']")).click();
	    String R6= RW.Readfromexcel("Products", 6, 1);
	    driver.findElement(By.name("productname")).sendKeys(R6);
	    driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
	    driver.findElement(By.xpath("//img[@title='Create Product...']")).click();
	    String R7= RW.Readfromexcel("Products", 7, 1);
	    driver.findElement(By.name("productname")).sendKeys(R7);
	    driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
	    driver.findElement(By.xpath("//img[@title='Create Product...']")).click();
	    String R8= RW.Readfromexcel("Products", 8, 1);
	    driver.findElement(By.name("productname")).sendKeys(R8);
	    driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
	    driver.findElement(By.xpath("//img[@title='Create Product...']")).click();
	    String R9= RW.Readfromexcel("Products", 9, 1);
	    driver.findElement(By.name("productname")).sendKeys(R9);
	    driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
	    driver.findElement(By.xpath("//img[@title='Create Product...']")).click();
	    String R10= RW.Readfromexcel("Products", 10, 1);
	    driver.findElement(By.name("productname")).sendKeys(R10);
	    driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
	    driver.findElement(By.xpath("//img[@title='Create Product...']")).click();
	    String R11= RW.Readfromexcel("Products", 11, 1);
	    driver.findElement(By.name("productname")).sendKeys(R11);
	    driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
	    driver.findElement(By.xpath("//img[@title='Create Product...']")).click();
	    }    
	}

