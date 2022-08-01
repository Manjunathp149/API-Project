package JDBC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipkart {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/mobiles/pr?sid=tyy%2C4io&p%5B%5D=facets.brand%255B%255D%3DPOCO&ctx=eyJjYXJkQ29udGV4dCI6eyJhdHRyaWJ1dGVzIjp7InRpdGxlIjp7Im11bHRpVmFsdWVkQXR0cmlidXRlIjp7ImtleSI6InRpdGxlIiwiaW5mZXJlbmNlVHlwZSI6IlRJVExFIiwidmFsdWVzIjpbIlNob3AgTm93Il0sInZhbHVlVHlwZSI6Ik1VTFRJX1ZBTFVFRCJ9fX19fQ%3D%3D&otracker=clp_metro_expandable_2_3.metroExpandable.METRO_EXPANDABLE_Shop%2BNow_mobile-phones-store_O1WYX08RHODP_wp2&fm=neo%2Fmerchandising&iid=M_fc027dbc-074e-440b-93f8-bc16eb58419d_3.O1WYX08RHODP&ppt=hp&ppn=homepage&ssid=r92fvjq1zk0000001656598709151");
	
	
	
	String mobileName = "POCO C31 (Shadow Gray, 32 GB)";
	
	String mobileRate = "₹8,999";
	
	
	String text = driver.findElement(By.xpath("//div[text()='"+mobileName+"']/ancestor::a/div/following-sibling::div//div[.='"+mobileRate+"']")).getText();
	System.out.println(text);
	
	
	////div[text()='POCO C31 (Royal Blue, 64 GB)']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']
	
	
	
	/*List<WebElement> text = driver.findElements(By.xpath("//div[@class='_4rR01T']/ancestor::a[@class='_1fQZEK']//following-sibling::div[@class='col col-5-12 nlI3QM']//div[@class='_30jeq3 _1_WHN1']"));
	
	
	for(WebElement we:text)
	{
		
	System.out.println(we.getText());
	}
	
	-
	/*String text = driver.findElement(By.xpath("//div[@class='_4rR01T']/ancestor::a[@class='_1fQZEK']//following-sibling::div[@class='col col-5-12 nlI3QM']//div[@class='_30jeq3 _1_WHN1']")).getText();
	System.out.println(text);*/
	
	/*String text = driver.findElement(By.xpath("//div[.='POCO C31 (Royal Blue, 32 GB)']/ancestor::a[@class='_1fQZEK']//following-sibling::div[@class='col col-5-12 nlI3QM']//div[.='₹8,999']")).getText();
	System.out.println(text);*/
	
	
	
	
	
	
	
	//List<WebElement> string = driver.findElements(By.xpath("//div[.='POCO C31 (Royal Blue, 32 GB)']/ancestor::a[@class='_1fQZEK']//following-sibling::div[@class='col col-5-12 nlI3QM']//div[.='₹8,999']"));
	/*for(WebElement we:string)
	{
		System.out.println(we.getText());
	}*/
}
}
