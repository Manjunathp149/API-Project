package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HotStarMovieNameTest {
 public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.hotstar.com/in");
	driver.findElement(By.xpath("//a[.='Latest & Trending']")).click();
	
	/*String name = "div[@class='normal']";
	driver.findElement(By.xpath("//div[@class='col-xs-12 content-holder']/descendant::"+name+""));*/
	
	WebElement ele1 = driver.findElement(By.xpath("//div[@class='details']"));
	Actions act=new Actions(driver);
	act.moveToElement(ele1).perform();
	 String ele = driver.findElement(By.xpath("//div[@class='col-xs-12 content-holder']/descendant::div[@class='normal']/descendant::div[@class='description ellipsize']")).getText();;
	
	System.out.println(ele);
	
	driver.close();
 }
}
