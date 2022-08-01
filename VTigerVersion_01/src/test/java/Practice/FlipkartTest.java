package Practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipkartTest {

	
	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		/*driver.navigate().to("https://www.amazon.com/s?k=mobile+phones&rh=n%3A2335752011%2Cp_89%3AOnePlus&dc&ds=v1%3AMKGLelY%2B7AoQwMm67%2BSYH6DgtFgykZblauXiwN4N9WA&crid=3MBI4YT4ZOKKR&qid=1657775851&rnid=2528832011&sprefix=mobile+phones%2Caps%2C608&ref=sr_nr_p_89_6");
		 WebElement checkbox = driver.findElement(By.xpath("//li[@id='p_89/OnePlus']/descendant::input[@type='checkbox']"));
		 SoftAssert a=new SoftAssert();
		 a.assertTrue(checkbox.isEnabled());
		 System.out.println("is enabled");
		 a.assertAll();*/
		driver.get("https://www.flipkart.com/search?q=phone%27&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off&as-pos=1&as-type=HISTORY");
		//WebElement ele = driver.findElement(By.xpath("//div[@class='_3879cV' ]/ancestor::div[@class='_1Y4Vhm _4FO7b6']/descendant::div[@class='_24_Dny']"));
		 
		//String mobile="";
		List<WebElement> ele = driver.findElements(By.xpath("//div[@class='_4rR01T']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_3tbKJL']"));
		
		
		for(WebElement w:ele)
		{
			System.out.println(w.getText());
		}
		
		 
		 /*if(checkbox.isSelected())
		 {
			 System.out.println("clicked");

		 }
		 else
		 {
			 System.out.println("not Clickable");
		 }
		 
		/*driver.findElement(By.xpath("//input[@title='Search for products, brands and more']")).sendKeys("phone");
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		List<WebElement> test = driver.findElements(By.xpath("//span[@id='productRating_LSTMOBG73E7GKQK4KZPR5ICMK_MOBG73E7GKQK4KZP_']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']"));
		
		if(
		
		for(WebElement w:test)
		{
			System.out.println(w.getText());
		}*/
		//driver.close();
	}
	}

