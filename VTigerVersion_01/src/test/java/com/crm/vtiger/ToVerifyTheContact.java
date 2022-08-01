package com.crm.vtiger;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyTheContact {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C://Users//Reshma//Downloads//chromedriver_win32 (1)/chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		 driver.get("http://localhost:8888/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		    driver.findElement(By.name("user_name")).sendKeys("admin");
		    driver.findElement(By.name("user_password")).sendKeys("admin");
		    driver.findElement(By.id("submitButton")).click();
		    driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[2]/table/tbody/tr/td[8]/a")).click();
		    driver.findElement(By.xpath("//img[@title='Create Contact...']")).click();
		    driver.findElement(By.name("lastname")).sendKeys("Patil");
		    driver.findElement(By.xpath("//input[@type='submit' and @class='crmButton small save']")).click();
		    WebElement org=driver.findElement(By.xpath("//span[@class='dvHeaderText']"));
			   String orgname =org.getText();
			   if(orgname.equals("Patil"))
			   {
				   System.out.println("Created");
			   }
			   else
			   {
				   System.out.println("Not created");
			   }
			   driver.close();
}
}
