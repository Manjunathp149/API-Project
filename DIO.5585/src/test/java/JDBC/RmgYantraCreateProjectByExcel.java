package JDBC;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RmgYantraCreateProjectByExcel {
public static void main(String[] args) throws InterruptedException, IOException {
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\Reshma\\AppData\\Local\\Google\\Chrome\\Application\\chrome.exe" );
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    //ReadAndWrite RW=new ReadAndWrite();
	
	    driver.get("http://localhost:8084/");
	    driver.findElement(By.name("username")).sendKeys("rmgyantra");
	    driver.findElement(By.name("password")).sendKeys("rmgy@9999");
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    driver.findElement(By.xpath("//a[.='Projects']")).click();
	    driver.findElement(By.xpath("//button[@class='btn btn-success']")).click();
	   
	    
	    FileInputStream fis=new FileInputStream("./src/test/resources/Book1.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet("Projects");
		for(int i=1;i<sh.getLastRowNum();i++) {
		Row R=sh.getRow(i);
		for(int j=1;j<R.getLastCellNum();j++)
		{
			Cell c=R.getCell(j);
			String value=c.getStringCellValue();
			 driver.findElement(By.xpath("//input[@name='projectName']")).sendKeys(value);
			    driver.findElement(By.name("createdBy")).sendKeys(value);
			    WebElement drop=driver.findElement(By.xpath("//select[@name='status']"));
			    Select s=new Select(drop);
			    s.selectByVisibleText(value);
			    driver.findElement(By.xpath("//input[@type='submit']")).click();
			    }	  
		driver.close();
}
}}
