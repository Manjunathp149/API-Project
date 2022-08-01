package com.crm.CreateOrganization;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.crm.ObjectRepository.Login_Page;

import GenericUtilities.FileUtilities;
import GenericUtilities.WebDriverUtilities;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ToCreateOrganization {
public static void main(String[] args) throws Throwable {
	WebDriverManager.firefoxdriver().setup();
	//System.setProperty("Webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	FileUtilities f=new FileUtilities();
	WebDriverUtilities w=new WebDriverUtilities();
	String URL=f.getproperetykeyvalue("url");
	String USERNAME=f.getproperetykeyvalue("username");
	String PASSWORD=f.getproperetykeyvalue("password");
	
	//Use implicitwait condition
	w.WaitForPageToLoad(driver);
	//Enter the URL of the application
	driver.get(URL);
	//Enter the Username password and click on submit button
	Login_Page loginpage=new Login_Page();
	loginpage.LoginToApplication(USERNAME, PASSWORD);
	driver.close();
	
}
}
