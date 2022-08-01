package Assignment;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_26 {
	public static void main(String[] args) throws IOException, InterruptedException   {
		WebDriver driver;
	FileInputStream fis = new FileInputStream("./src/test/resources/propertyfile.Properties");
	Properties p=new Properties();
	p.load(fis);
	String URL=p.getProperty("url");
	String USERNAME=p.getProperty("username");
	String PASSWORD=p.getProperty("password");
    String BROWSER=p.getProperty("browser");
    
	
	if(BROWSER.equalsIgnoreCase("Chrome"))
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}

	else if(BROWSER.equalsIgnoreCase("firefox"))
	{
		WebDriverManager.firefoxdriver().setup();
		driver=new ChromeDriver();
	}
	else
	{
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
	}
	
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys(USERNAME);
	    driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
	    driver.findElement(By.id("submitButton")).click();
	    driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[2]/table/tbody/tr/td[12]/a")).click();
	    driver.findElement(By.xpath("//a[.='Products']")).click();
	    WebElement ele=driver.findElement(By.id("viewname"));
	    ele.getText();
	    Select s=new Select(ele);
	    s.selectByVisibleText("All");
	    if(ele.isDisplayed())
	    {
	    	System.out.println("Disabled");
	    }
	    else
	    {
	    	System.out.println("Enabled");
	    }
	    Thread.sleep(2000);
	    driver.close();
}
}
