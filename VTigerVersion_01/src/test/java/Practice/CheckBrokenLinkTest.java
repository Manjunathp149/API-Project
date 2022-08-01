package Practice;

import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBrokenLinkTest {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		List<WebElement> List = driver.findElements(By.xpath("//a"));
		System.out.println("No of links are"+List.size());
		
		for(WebElement ch :List)
		{
			String URL = ch.getAttribute("href");
			
		}
		
		public static void verifyLinks(String LinkURL) 
		{
			try
			{
				URL url=new URL(LinkURL);
				
			}
		}
	}
}
