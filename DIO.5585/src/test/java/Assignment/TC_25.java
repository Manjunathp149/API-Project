package Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import GenericUtilities.FileUtilities;
import io.github.bonigarcia.wdm.WebDriverManager;


public class TC_25 {
	public static void main(String[] args) throws Throwable   {
		FileUtilities f=new FileUtilities();
		//WebDriverUtilities w=new WebDriverUtilities();
	String URL=f.getproperetykeyvalue("url");
	String USERNAME=f.getproperetykeyvalue("username");
	String PASSWORD=f.getproperetykeyvalue("password");
    //String BROWSER=f.getproperetykeyvalue("browser");
        
    WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
		driver.get(URL);
		//w.TakeScreenShot(driver, URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys(USERNAME);
	    driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
	    driver.findElement(By.id("submitButton")).click();
	    driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[2]/table/tbody/tr/td[12]/a")).click();
	    driver.findElement(By.xpath("//a[.='Products']")).click();
	   // WebElement ele=driver.findElement(By.id("viewname"));
	   // ele.getText();
	    //Select s=new Select(ele);
	    //s.selectByVisibleText("All");
	    //Alert A=driver.switchTo().alert();
	    //A.accept();
	    driver.findElement(By.xpath("//body[@class='small']")).click();
	    driver.findElement(By.xpath("//a[.='Delete']")).click();

}
}