package com.crm.vtiger;


	import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

	public class Pt1 { 
	
		
			static WebDriver driver = null;
			public static String fetchdata(String sheet,int row, int cell) throws EncryptedDocumentException, IOException
			{
				FileInputStream fes = new FileInputStream("./src/test/resources/excel/vijay78.xlsx");
				Workbook book = WorkbookFactory.create(fes);
				Cell value = book.getSheet(sheet).getRow(row).getCell(cell);
				String input = value.toString();
				return input;
			}
			public static void dropdown(WebElement ele, String value)
			{
				Select s1 = new Select(ele);
				s1.selectByValue(value);
			}
			public static void main(String[] args) throws IOException, InterruptedException 
			{

				FileInputStream fis = new FileInputStream("./src/test/resources/CommonData.Properties");
				Properties prop = new Properties();
				prop.load(fis);
				if(prop.getProperty("BROWSER").equalsIgnoreCase("firefox"))
				{
					WebDriverManager.firefoxdriver().setup();
					driver= new FirefoxDriver();
				}
				else if(prop.getProperty("BROWSER").equalsIgnoreCase("chrome"))
				{
					WebDriverManager.chromedriver().setup();
					driver = new ChromeDriver();
				}
				else
				{
					WebDriverManager.firefoxdriver().setup();
					driver = new FirefoxDriver();
				}
				
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.get(prop.getProperty("url"));
				driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys(prop.getProperty("username"));
				driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys(prop.getProperty("password"));
				driver.findElement(By.id("submitButton")).click();
				driver.findElement(By.xpath("//a[.='Products']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@name='productname']")).sendKeys("laptop");
				Thread.sleep(2000);
				WebElement ele1 = driver.findElement(By.xpath("//select[@name='productcategory']"));
				dropdown(ele1,"Software");
				WebElement ele2 = driver.findElement(By.xpath("//select[@name='manufacturer']"));
				dropdown(ele2,"MetBeat Corp");
				driver.findElement(By.xpath("//input[@name='assigntype' and @value='T']")).click();
				Thread.sleep(2000);
				WebElement choosefile = driver.findElement(By.id("my_file_element"));
				choosefile.sendKeys("D:\\1478.png");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("laptop colour is black and sliver");
				Thread.sleep(2000);
				driver.findElement(By.xpath("(//input[@title='Save [Alt+S]'])[2]")).click();
				Thread.sleep(2000);
				WebElement product = driver.findElement(By.xpath("//span[@class='lvtHeaderText']"));
				Thread.sleep(2000);
				if(product.getText().contains("laptop"))
				{
					System.out.println("Testcase is pass");
				}
				else
				{
					System.out.println("Test case is fail");
				}
				//WebElement prod = driver.findElement(By.xpath("//img[@src='themes/softed/images/menuDnArrow.gif']"));
				Actions action = new Actions(driver);
				action.moveToElement(ele1).perform();
				driver.findElement(By.xpath("//a[.='Campaigns']")).click();
				driver.findElement(By.xpath("//img[@title='Create Campaign...']")).click();
				driver.findElement(By.xpath("//input[@name='campaignname']")).sendKeys(fetchdata("Sheet1",10,2));
				driver.findElement(By.xpath("//input[@value='T']")).click();
				WebElement assign = driver.findElement(By.xpath("//select[@name='assigned_group_id']"));
				dropdown(assign,"Team Selling");
				WebElement assign1 = driver.findElement(By.xpath("//select[@name='campaignstatus']"));
				dropdown(assign1,"Active");
				String parentid = driver.getWindowHandle();
				driver.findElement(By.xpath("//img[@title='Select']")).click();
				Thread.sleep(2000);
				Set<String> allid = driver.getWindowHandles();
				for(String output:allid)
				{
					if(!output.equals(parentid))
					{
						driver.switchTo().window(output);
					}

				}
				driver.manage().window().maximize();
				driver.findElement(By.id("search_txt")).sendKeys(fetchdata("Sheet1",1,2));
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@class='crmbutton small create']")).click();
				driver.findElement(By.id("1")).click();
				driver.switchTo().window(parentid);
				driver.findElement(By.xpath("//input[@class='crmbutton small save']")).click();
				
				
			}
	}
			
