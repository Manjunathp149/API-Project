package com.crm.vtiger;



	import java.io.FileInputStream;
	import java.io.IOException;
	import java.util.Properties;
	import java.util.Random;
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
	import org.openqa.selenium.support.ui.Select;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class ToCreateOrganizationScenerios {
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
			Select s = new Select(ele);
			s.selectByValue(value);
		}
		public static void main(String[] args) throws IOException 
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
			driver.findElement(By.xpath("//a[.='Organizations']")).click();
			driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
			Random random = new Random();
			int randNum = random.nextInt(1000);
			driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys(fetchdata( "Sheet1",4,2 )+randNum);
			WebElement drop = driver.findElement(By.xpath("//select[@name='industry']"));
			dropdown(drop,"Education");
			WebElement drop1 = driver.findElement(By.xpath("//select[@name='rating']"));
			dropdown(drop1,"Active");
			WebElement drop2 = driver.findElement(By.xpath("//select[@name='accounttype']"));
			dropdown(drop2,"Press");
			driver.findElement(By.xpath("//input[@value='T']")).click();
			driver.findElement(By.xpath("//input[@name='cpy']")).click();
			driver.findElement(By.xpath("//input[@id='bill_city']")).sendKeys(fetchdata("Sheet1",4,3));
			driver.findElement(By.xpath("//input[@id='bill_state']")).sendKeys(fetchdata("Sheet1",4,4));
			driver.findElement(By.xpath("//input[@id='bill_code']")).sendKeys(fetchdata("Sheet1",4,6));
			driver.findElement(By.xpath("//input[@id='bill_country']")).sendKeys(fetchdata("Sheet1",4,5));
			driver.findElement(By.xpath("//input[@class='crmbutton small save']")).click();
			WebElement actual = driver.findElement(By.xpath("//span[@class='dvHeaderText']"));
			if(actual.getText().contains("IBM"))
			{
				System.out.println("Orgnaisation is created");
			}
			else
			{
				System.out.println("Organisation is not created");
			}
		}
	}

