package Assignment;

import org.testng.annotations.Test;

import com.crm.ObjectRepository.HomePage;
import com.crm.ObjectRepository.ProductFilterPage;

import GenericUtilities.BaseClassUtilities;
import GenericUtilities.WebDriverUtilities;

public class PomImplementationTC_25 extends BaseClassUtilities
{
	
	
	@Test
	public void Implementation()
	{
	
	
	/*public static void main(String[] args) throws Throwable {
		
		FileUtilities f=new FileUtilities();
		/*WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		String BROWSER=f.getproperetykeyvalue("browser");
		WebDriver driver=null;;
		if(BROWSER.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}

		else if(BROWSER.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		else
		{
			WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();
		}
		WebDriverUtilities wd=new WebDriverUtilities();
		wd.WaitForPageToLoad(driver);
	
		
		//Enter the URL
		String URL=f.getproperetykeyvalue("url");
		String username=f.getproperetykeyvalue("username");
		String password=f.getproperetykeyvalue("password");
		driver.get(URL);
		
		
		//Login to the application
		Login_Page lp=new Login_Page(driver);
		lp.LoginToApplication(username, password);*/
		
		
		//Click on Product major tab in Home page
		HomePage h=new HomePage(driver);
		h.ClickProductmjrtb();
		
		ProductFilterPage p=new ProductFilterPage(driver);
		p.getFilterrec();
		
		WebDriverUtilities webDriverUtilities=new WebDriverUtilities();
		webDriverUtilities.SwitchToAlertPopupAndAccept(driver);
		
		
			
} 
}