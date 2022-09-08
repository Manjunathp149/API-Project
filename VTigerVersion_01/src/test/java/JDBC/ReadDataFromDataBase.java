package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.mysql.cj.jdbc.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadDataFromDataBase {
public static void main(String[] args) throws SQLException {
	// Open the chrome 
	WebDriverManager.chromedriver().setup();
//	WebDriver driver=new ChromeDriver();
//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	//Enter tyhe URL
//	 driver.get("http://localhost:8084/");
//	 
//	 //Login using valid credential
//	    driver.findElement(By.name("username")).sendKeys("rmgyantra");
//	    driver.findElement(By.name("password")).sendKeys("rmgy@9999");
//	    driver.findElement(By.xpath("//button[@type='submit']")).click();
//	    driver.findElement(By.xpath("//a[.='Projects']")).click();
//	    driver.findElement(By.xpath("//button[@class='btn btn-success']")).click();
//	   
	
	
	Scanner sc=new Scanner(System.in);
	String string1 = sc.next();
	
	    //Register to the DataBase
	    Driver DriverReferance=new Driver();
	    DriverManager.registerDriver(DriverReferance);
	    
	    
	    //Connection to the Driver
	    Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306/projects","root","root");
	    Statement s = c.createStatement();
	   ResultSet result = s.executeQuery("select * from project");
	 
	 
	 
	 boolean flag=false;
	   while(result.next())
	   {
		   System.out.println(result.getString(1)+"\t"+result.getString(2)+"\t"+result.getString(4));
	
	   
	   String string = result.getString(4);
	   if(string1.equals(string))
	   {
		   System.out.println("Present");
		   break;
	   }
	   else
	   {
		   System.out.println("Not present");
		   break;
	   }
	   }
	   
	   c.close();
}
}
