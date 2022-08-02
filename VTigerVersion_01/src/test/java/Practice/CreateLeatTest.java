package Practice;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import GenericUtilities.ExcelUtilities;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLeatTest {

	
	@Test
	public void createLead() throws IOException, Throwable
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.navigate().to("http://localhost:8888/");
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
		driver.findElement(By.xpath("//a[@href='index.php?module=Leads&action=index']")).click();
		driver.findElement(By.xpath("//img[@alt='Create Lead...']")).click();
		WebElement el =driver.findElement(By.xpath("//select[@name='salutationtype']"));
		//WebElement el = driver.findElement(By.xpath("//option[@value='Mr.']"));
		Select s=new Select(el);
		s.selectByValue("Mr.");
		driver.findElement(By.name("lastname")).sendKeys("Royal");
		driver.findElement(By.name("company")).sendKeys("QUAMNTAM");
		WebElement el1=driver.findElement(By.name("leadsource"));
		Select s1=new Select(el1);
		s1.selectByValue("Employee");
		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
		String str = driver.findElement(By.xpath("//span[@id='dtlview_Last Name']")).getText();
		driver.findElement(By.xpath("//a[@class='hdrLink']")).click();
		
		  String el2 = driver.findElement(By.xpath("//td[@class='showPanelBg']")).getText();
		
		
		 Assert.assertTrue(el2.contains(str));
		 System.out.println("Lead Created");
		 
		 
		 
		
		/*ExcelUtilities ex=new ExcelUtilities();
		ex.Readfromexcel("sheet", 0, 0);*/
		
	}
}
