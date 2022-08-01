package com.crm.vtiger;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class ToVerifyProductAndCampaignAndVerifyCampaignAndProduct {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C://Users//Reshma//Downloads//chromedriver_win32 (1)/chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.get("http://localhost:8888/");
		    driver.findElement(By.name("user_name")).sendKeys("admin");
		    driver.findElement(By.name("user_password")).sendKeys("admin");
		    driver.findElement(By.id("submitButton")).click();
		    driver.findElement(By.xpath("//a[.='Products'] ")).click();
		    driver.findElement(By.xpath("//img[@title='Create Product...'] ")).click();
		    driver.findElement(By.name("productname")).sendKeys("Hi");
		    driver.findElement(By.id("my_file_element")).sendKeys("C:\\Users\\Reshma\\Desktop\\hero.jpeg.jpg");
		    driver.findElement(By.id("jscal_trigger_sales_end_date")).click();
		    driver.findElement(By.name("button")).click();
		    WebElement ele=driver.findElement(By.xpath("//a[@href='javascript:;']"));
		    Actions act=new Actions(driver);
		    act.moveToElement(ele).perform();
		    driver.findElement(By.name("Campaigns")).click();
		    driver.findElement(By.xpath("//img[@alt='Create Campaign...']")).click();
		    driver.findElement(By.name("campaignname")).sendKeys("KHB");
		    WebElement ele2=driver.findElement(By.name("campaigntype"));
		    Select s=new Select(ele2);
		    s.selectByValue("Partners");
		    driver.findElement(By.name("button")).click();
		    driver.findElement(By.xpath("//img[@title='Select']")).click();
		    driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
		    
}
}
