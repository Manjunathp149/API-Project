package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipkart {
public static void main(String[] args) throws InterruptedException {
	
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver =new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.flipkart.com/");
	Thread.sleep(3000);
	//Alert alert = driver.switchTo().alert();
	//alert.dismiss();
	//WebElement Cross = driver.findElement(By.xpath("/html/body/div[2]/div/div/button"));
	//Cross.click();
	//driver.findElement(By.xpath("(//input[@type='text'])[2]']")).click();
	driver.findElement(By.xpath("//span[.='Enter Email/Mobile number']")).sendKeys("manjunathp149@gmail.com");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Sony@30000");
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
	driver.findElement(By.xpath("//input[@title='Search for products, brands and more']")).sendKeys("apple mobile");
	driver.findElement(By.xpath("//*[@type='submit']")).click();
	
}
}
