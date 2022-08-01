package Practice;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FetchLinks {
public static void main(String[] args) throws IOException, Throwable {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.amazon.com/");
	driver.manage().window().maximize();
	
	//List<WebElement> links = driver.findElements(By.xpath("//a"));
	List<WebElement> links = driver.findElements(By.xpath("//img"));

	int count=links.size();
	System.out.println("The total number of links presentin the page is"+" "+count);
	

		
		
		
		FileInputStream fis=new FileInputStream("./src/test/resources/ProjectDet.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet("Link");
		
		for(int i=0;i<links.size();i++)
		{
			
		Row R=sh.createRow(i);
		Cell c=R.createCell(0);
		c.setCellValue(links.get(i).getText());
		FileOutputStream fos=new FileOutputStream("./src/test/resources/ProjectDet.xlsx");
		wb.write(fos);
		System.out.println(links.get(i).getText());

}
	driver.close();
}}	

