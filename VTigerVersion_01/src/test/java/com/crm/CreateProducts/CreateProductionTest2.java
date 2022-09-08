package com.crm.CreateProducts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.crm.ObjectRepository.EnterproductDataAndSubmit;
import com.crm.ObjectRepository.HomePage;
import com.crm.ObjectRepository.Login_Page;
import com.crm.ObjectRepository.ProductInfoPage;
import com.crm.ObjectRepository.ProductPage;

import GenericUtilities.BaseClassUtilities;
import GenericUtilities.FileUtilities;
import GenericUtilities.JavaUtilities;
import GenericUtilities.WebDriverUtilities;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateProductionTest2 
{

		
		
	public static void main(String[] args) throws Throwable {
	FileUtilities f=new FileUtilities();
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	WebDriverUtilities wd=new WebDriverUtilities();
	wd.WaitForPageToLoad();
	JavaUtilities j=new JavaUtilities();
		
	
	//Enter the URL
	String URL=f.getproperetykeyvalue("url");
	String username=f.getproperetykeyvalue("username");
	String password=f.getproperetykeyvalue("password");
	driver.get(URL);
	
	
	
	
	//Login to the application
	Login_Page lp=new Login_Page(driver);
	lp.LoginToApplication(username, password);
	
	
	//Click on Product major tab in Home page
	HomePage h=new HomePage(driver);
	h.ClickProductmjrtb();
	
	//Click on New Product button
	ProductPage p=new ProductPage(driver);
	p.clickOnNewProdBtn();
	
/*	//Enter all the valid details into product textfield and create
	EnterproductDataAndSubmit data=new EnterproductDataAndSubmit(driver);
	data.EnterNewProductData(productName);
	
	//Verify the product is created or not
	ProductInfoPage p1=new ProductInfoPage(driver);
	String product=p1.getinformation();
	if(product.equals(productName))
	{
		System.out.println("Product is created");
	}
	else
	{
		System.out.println("Product is not created");
	}*/
	
}
}
