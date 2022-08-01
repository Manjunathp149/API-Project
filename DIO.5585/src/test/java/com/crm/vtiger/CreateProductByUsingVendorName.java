package com.crm.vtiger;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateProductByUsingVendorName {
public static void main(String[] args) {
	//System.setProperty("webdriver.chrome.driver",".\src\\main\\resources\\chromedriver.exe" );
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("http://localhost:8888/");
	    driver.findElement(By.name("user_name")).sendKeys("admin");
	    driver.findElement(By.name("user_password")).sendKeys("admin");
	    driver.findElement(By.id("submitButton")).click();
	    WebElement ele=driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[2]/table/tbody/tr/td[22]/a/img"));
	    Actions act=new Actions(driver);
	    act.moveToElement(ele).perform();
	    driver.findElement(By.xpath("/html/body/div[6]/table/tbody/tr/td[5]/table/tbody/tr[6]/td/a")).click();
	    driver.findElement(By.xpath("/html/body/table[3]/tbody/tr[2]/td[2]/table/tbody/tr/td[2]/table/tbody/tr/td/table/tbody/tr/td[1]/a/img")).click();
	    driver.findElement(By.name("vendorname")).sendKeys("Hero");
	    driver.findElement(By.name("button")).click();
	    String ele2=driver.findElement(By.xpath("//span[@class='lvtHeaderText']")).getText();
	    if(ele2.contains("Hero"))
	    {
	    	System.out.println("vendor is created");
	    }
	    else
	    {
	    	System.out.println("vendor is not created");
	    }
	    driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[2]/table/tbody/tr/td[12]/a")).click();
	    driver.findElement(By.xpath("/html/body/table[3]/tbody/tr[2]/td[2]/table/tbody/tr/td[2]/table/tbody/tr/td/table/tbody/tr/td[1]/a/img")).click();
	    driver.findElement(By.name("productname")).sendKeys("Mask");
	    driver.findElement(By.name("button")).click();	
       Set<String> ele3=driver.getWindowHandles();
       for(String string:ele3)
       {
    	   driver.switchTo().window(string);
    	   String title=driver.getTitle();
    	   if(title.contains("Mask"))
    	   {
    		   break;
    	   }
       }
       
}
}
