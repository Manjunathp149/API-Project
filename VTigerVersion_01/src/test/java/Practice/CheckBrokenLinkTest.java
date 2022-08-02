package Practice;

import java.net.HttpURLConnection;
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
			verifyLinks(URL);
		}
		
	driver.quit();
		}

	public static void verifyLinks(String uRL) {
		 url vrl = new url(uRL);
		(HttpURLConnection)vrl
	}
	}
}
