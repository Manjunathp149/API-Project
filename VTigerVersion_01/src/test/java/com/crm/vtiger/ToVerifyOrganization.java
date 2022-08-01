package com.crm.vtiger;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyOrganization {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C://Users//Reshma//Downloads//chromedriver_win32 (1)/chromedriver.exe" );
	WebDriver driver=new ChromeDriver();
	 driver.get("http://localhost:8888/");
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.findElement(By.name("user_name")).sendKeys("admin");
	    driver.findElement(By.name("user_password")).sendKeys("admin");
	    driver.findElement(By.id("submitButton")).click();
	    driver.findElement(By.xpath("//a[.='Organizations']")).click();
	    driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
	    driver.findElement(By.name("accountname")).sendKeys("KEB");
	    driver.findElement(By.name("button")).click();
	    WebElement org=driver.findElement(By.xpath("//span[@class='dvHeaderText']"));
	    System.out.println(org);
	    if(driver.getCurrentUrl().equals("http://localhost:8888/index.php?module=Accounts&action=index"))
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
