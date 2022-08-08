package Practice;

import static org.testng.Assert.assertTrue;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonXpath {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.get("https://www.amazon.com/s?k=gaming+keyboard&pd_rd_r=4c9d6d0b-4ab0-4aad-9ac8-276c417d9515&pd_rd_w=gfHJj&pd_rd_wg=BkHYB&pf_rd_p=12129333-2117-4490-9c17-6d31baf0582a&pf_rd_r=J9Y6P14DBGTAWGY4652D&ref=pd_gw_unk");
	//WebElement el = driver.findElement(By.xpath("//span[@class='a-size-base a-color-base puis-bold-weight-text' and text()='Brand']/ancestor::div[@id='brandsRefinements']/descendant::li[@id='p_89/Corsair']/descendant::div[@class='a-checkbox a-checkbox-fancy s-navigation-checkbox aok-float-left']"));
	//el.click();
	//String s = el.getText();
	//System.out.println(el.getText());
	//Assert.assertTrue(el.isDisplayed());
	//System.out.println("The element is found");
	
		/*driver.findElement(By.xpath("//span[@class='a-expander-prompt' and text()='See more'] ")).click();
		List<WebElement> ele1 = driver.findElements(By.xpath("//span[@class='a-size-base a-color-base puis-bold-weight-text' and text()='Brand']/ancestor::div[@id='brandsRefinements']/descendant::span[@class='a-list-item']"));
		System.out.println("The total number of text"+" "+ele1.size());*/
		driver.get("https://www.amazon.com/");
		 //WebElement ele1 = driver.findElement(By.xpath("//div[@class='nav-search-scope nav-sprite']"));
		WebElement ele1 = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		Select s=new Select(ele1);
		List<WebElement> options = s.getOptions();
		int count = options.size();
		for(WebElement we :options)
		{
			System.out.println(we.getText());
		}
		System.out.println(count);
		
			s.selectByVisibleText("Prime Video");
		
		/*for(WebElement set:ele1)
		{
			System.out.println(set.getText());
				String s1=set.getText();
		//Assert.assertTrue(s1.contains("Deals"), "Present");
		
		//System.out.println("Present");
		}
		*/
		
		//driver.close();
	}
}
