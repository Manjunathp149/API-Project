package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CollectionDDWithAscendingOrder {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://getbootstrap.com/docs/4.0/components/dropdowns/");
	  driver.findElement(By.xpath("//button[contains(.,'Large button')]")).click();
	  

	 //  Select select = new Select(ele);
	   
	 //   select.selectByVisibleText("Action");
	  
		
}
}
