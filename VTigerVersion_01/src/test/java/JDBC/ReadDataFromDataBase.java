package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.mysql.cj.jdbc.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadDataFromDataBase {
public static void main(String[] args) throws SQLException {
	// Open the chrome 
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	
	//Enter tyhe URL
	 driver.get("http://localhost:8084/");
	 
	 //Login using valid credential
	    driver.findElement(By.name("username")).sendKeys("rmgyantra");
	    driver.findElement(By.name("password")).sendKeys("rmgy@9999");
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    driver.findElement(By.xpath("//a[.='Projects']")).click();
	    driver.findElement(By.xpath("//button[@class='btn btn-success']")).click();
	   
	    //Register to the DataBase
	    Driver DriverReferance=new Driver();
	    DriverManager.registerDriver(DriverReferance);
	    
	    
	    //Connection to the Driver
	    Connection c= DriverManager.getConnection("C:\\ProgramData\\Microsoft\\Windows\\Start Menu\\Programs\\MySQL\\MySQL Server 5.5","root","root");
	    Statement s = c.createStatement();
	    s.executeQuery("select * from ");
}
}
