package TestsByGenericUtilitis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import GenericUtilities.FileUtilities;
import GenericUtilities.WebDriverUtilities;
import io.github.bonigarcia.wdm.WebDriverManager;

public class OrganizationTC_41 {
public static void main(String[] args) throws Throwable {
	//System.setProperty(IpathConstants.ChromeKey, IpathConstants.Chromepath);
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	FileUtilities fu=new FileUtilities();
	WebDriverUtilities WD=new WebDriverUtilities();
	WD.WaitForPageToLoad();
	String URL=fu.getproperetykeyvalue("url");
	String USERNAME=fu.getproperetykeyvalue("username");
	String PASSWORD=fu.getproperetykeyvalue("password");
	WD.TakeScreenShot(driver, "Hey");
	driver.get(URL);
	driver.findElement(By.name("user_name")).sendKeys(USERNAME);
	driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
	driver.findElement(By.id("submitButton")).click();
	
	
	driver.findElement(By.xpath("//a[.='Organizations']")).click();
	driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
	
	
		driver.findElement(By.name("accountname")).sendKeys("KKK");
		driver.findElement(By.xpath("//input[@value='T']")).click();
		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
		WebElement element=driver.findElement(By.xpath("//img[@style='padding: 0px;padding-left:5px']"));

	
	WD.MoveToElement(driver, element);
	Thread.sleep(1000);
	driver.findElement(By.xpath("//a[.='Sign Out']")).click();
	
}
}
