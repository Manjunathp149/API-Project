package com.crm.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
	//Declaration
@FindBy(name="user_name")
private WebElement UNTF;

@FindBy(name="user_password")
private WebElement PDTF;

@FindBy(id="submitButton")
private WebElement SubmitBtn;

//initialization	
public void login(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
//Utilization
public WebElement getUserNameTF()
{
	return UNTF;
}

public WebElement getPassWordTF()
{
	return PDTF;
}

public WebElement  getLoginClick()
{
	return SubmitBtn;
}

public void LoginToApplication(String username, String password)
{
	UNTF.sendKeys(username);
	PDTF.sendKeys(password);
	SubmitBtn.click();
}
}
