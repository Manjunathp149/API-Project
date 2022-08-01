package com.crm.vtiger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToCreateandVerify {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C://Users//Reshma//Downloads//chromedriver_win32 (1)/chromedriver.exe" );
    WebDriver driver= new ChromeDriver();
    driver.manage().window().maximize();
    
    driver.get("http://localhost:8084/");
    driver.findElement(By.name("username")).sendKeys("rmgyantra");
    driver.findElement(By.name("password")).sendKeys("rmgy@9999");
    driver.findElement(By.xpath("//button[@type='submit']")).click();
    driver.findElement(By.tagName("//a[.='Projects']")).click();
    driver.findElement(By.xpath("//button[@class='btn btn-success']")).click();
    driver.findElement(By.xpath("//input[@name='projectName']")).sendKeys("yantray");
    driver.findElement(By.xpath("//input[@name='createdBy']']")).sendKeys("Alia");
    WebElement drop=driver.findElement(By.xpath("//select[@name='status']"));
    Select s=new Select(drop);
    s.selectByVisibleText("Created");
    driver.findElement(By.xpath("//input[@type='submit']")).click();
}
}
