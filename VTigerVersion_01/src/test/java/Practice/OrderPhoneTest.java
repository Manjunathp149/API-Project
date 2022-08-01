package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrderPhoneTest {
public static void main(String[] args) {

	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.navigate().to("https://www.walmart.com/");
	driver.findElement(By.xpath("//input[@type='search']")).sendKeys("phone");
	driver.findElement(By.xpath("//i[@class='ld ld-Search absolute']")).sendKeys("phone");
	WebElement text = driver.findElement(By.xpath("//span[@class='f5-m f6 w_Aw' and @style='-webkit-line-clamp: 2; padding-bottom: 0em; margin-bottom: 0em;' and .='Boost Mobile, TCL 20XE -Prepaid Smartphone']/parent::div[@class='flex flex-column']/descendant::div[@class='b black f5 mr1 mr2-xl lh-copy f4-l']"));
	
	System.out.println(text.getText());
	
	
	driver.close();
	
	}
}
