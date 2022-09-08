package Practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Walmart {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.flipkart.com/home-decor/paintings-posters/paintings/pr?sid=arb,bga,mmf&otracker=nmenu_sub_Home%20%26%20Furniture_0_Paintings");
	List<WebElement> ele = driver.findElements(By.xpath("//a[@class='s1Q9rs']"));
	
	for(WebElement ch :ele)
	{
		ch.click();
		WebElement ele1 = driver.findElement(By.xpath("//span[@class='B_NuCI']"));
		System.out.println(ele1.getText());
		driver.navigate().back();
	}
}
}
