package com.crm.vtiger;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CountElements0106 {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("http://localhost:8888/");
	driver.findElement(By.name("user_name")).sendKeys("admin");
	driver.findElement(By.name("user_password")).sendKeys("admin");
	driver.findElement(By.id("submitButton")).click();
	driver.findElement(By.xpath("//a[.='Opportunities']")).click();
	//WebElement ele=driver.findElement(By.id("bas_searchfield"));
	//Select s=new Select(ele);
	//java.util.List<WebElement> count=s.getOptions();
	//TreeSet<String> count=new TreeSet<String>();
	//for(String we:count)
	{
	//	String s1=we.getText();
		//System.out.println(s1);
	}
     	driver.close();
	//java.util.List<WebElement> count=s.getOptions();
	//int c=count.size();
	//System.out.println(c);
	
}
}
