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


	public class Tc23 {
	public static void main(String[] args) throws IOException, InterruptedException   {
		WebDriver driver;
		//To read property file
		FileInputStream fis = new FileInputStream("./src/test/resources/propertyfile.Properties");
		Properties p=new Properties();
		p.load(fis);
		String URL=p.getProperty("url");
		String USERNAME=p.getProperty("username");
		String PASSWORD=p.getProperty("password");
	    String BROWSER=p.getProperty("browser");
	    
		
		if(BROWSER.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe" );
			 driver=new ChromeDriver();
		}

		else if(BROWSER.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.chrome.driver","./src/main/resources/geckodriver-v0.30.0-win64.zip" );
			 driver=new ChromeDriver();
		}
		else
		{
			System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe" );
			 driver=new ChromeDriver();
		}
		
		driver.get(URL);
		driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		    driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys(USERNAME);
		    driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
		    driver.findElement(By.id("submitButton")).click();
		    driver.findElement(By.xpath("//a[.='Products']")).click();
		    WebElement ele=driver.findElement(By.id("viewname"));
		    ele.getText();
		    Select s=new Select(ele);
		    s.selectByVisibleText("Hi");
		    if(ele.isDisplayed())
		    {
		    	System.out.println("Created");
		    }
		    else
		    {
		    	System.out.println("Not created");
		    }
		    Thread.sleep(2000);
		    driver.close();
		    
	}}


