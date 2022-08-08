package Practice;

import java.util.concurrent.TimeUnit;

import org.apache.poi.xwpf.usermodel.Document;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutorTest {
public static void main(String[] args) throws InterruptedException {
	
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.get("https://www.amazon.com/");
	
	
	WebElement ele = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	//WebElement ele = driver.findElement(By.xpath("//img[@alt='Happy Meaningful Life: Live and Let Live']"));
	/*Point loc = ele.getLocation();
	int x = loc.getX();
	int y = loc.getY();
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("window.scrollBy("+x+","+y+")");
	ele.click();*/
	
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("document.getElementById('twotabsearchtextbox').value='fru'");
	Thread.sleep(2000);
	ele.clear();
//	js.executeScript("document.getElementById('twotabsearchtextbox').value=''");
		
	
	/*for(int i=0;i<3;i++)
	{
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
	}
	
	for(int i=0;i<3;i++)
	{
		js.executeScript("window.scrollBy(0,-500)");
		Thread.sleep(2000);
	}*/
}
}
