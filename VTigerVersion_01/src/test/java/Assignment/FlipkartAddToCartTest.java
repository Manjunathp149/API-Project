package Assignment;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipkartAddToCartTest {

	
	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/account/login?ret=/");
		//driver.findElement(By.xpath("//input[@autocomplete='off' and @class='_2IX_2- VJZDxU']")).sendKeys("8277046521");
		//driver.findElement(By.xpath("//input[@autocomplete='off' and @class='_2IX_2- _3mctLh VJZDxU']")).sendKeys("Sony@30000");
		//driver.findElement(By.xpath("//button[@type='submit' and @class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
		driver.findElement(By.xpath("//input[@title='Search for products, brands and more']")).sendKeys("Apple mobiles");
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		driver.findElement(By.xpath("//div[.='APPLE iPhone 13 (Midnight, 128 GB)']")).click();
		//String s = driver.getWindowHandle();
		//driver.switchTo().window("apple-iphone-13-midnight-128-gb");
		Set<String> set=driver.getWindowHandles();
		Iterator<String> it=set.iterator();
		while(it.hasNext()) 
		{
			String sw=it.next();
			driver.switchTo().window(sw);
			String currentwindow=driver.getTitle();
			if(currentwindow.contains("apple-iphone-13-midnight-128-gb"))
			{
				break;
			}
		}
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
		driver.findElement(By.xpath("//a[@class='_2Kn22P gBNbID']"));
      
		String s1 =driver.findElement(By.xpath("//div[.='APPLE iPhone 13 (Midnight, 128 GB)']")).getText();
		String s = "APPLE iPhone 13 (Midnight, 128 GB)";
		Assert.assertEquals(s, s1);
		System.out.println("Mobile added to the cart");
		
		driver.quit();
		
	}
}
