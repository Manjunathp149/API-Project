package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MakeMyTripTest {
public static void main(String[] args)
{
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.navigate().to("https://www.makemytrip.com/");
	driver.findElement(By.xpath("//span[.='Hotels']")).click();
	driver.findElement(By.xpath("//span[.='City, Property name or Location']")).click();
	driver.findElement(By.xpath("//p[.='Goa' and @class='locusLabel appendBottom5']")).click();
}
}
