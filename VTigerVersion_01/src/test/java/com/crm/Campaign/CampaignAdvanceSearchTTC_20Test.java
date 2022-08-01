package com.crm.Campaign;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.crm.ObjectRepository.CampaignSearchPage;
import com.crm.ObjectRepository.ClickOnCreateCampaignbtn;
import com.crm.ObjectRepository.HomePage;

import GenericUtilities.BaseClassUtilities;

public class CampaignAdvanceSearchTTC_20Test extends BaseClassUtilities{
		
	
		@Test
		public void CampaignAdvanceSearch()
		{
		
		//Click on Campaign major tab in Home page
		HomePage h=new HomePage(driver);
		h.Clickcampaign(driver);
		
		
		//Click on Advance search link
		ClickOnCreateCampaignbtn C=new ClickOnCreateCampaignbtn(driver);
		C.clickSearchlink();
		
		
		CampaignSearchPage c=new CampaignSearchPage(driver);
		 c.getcampDetails();
		 
		WebElement ele = driver.findElement(By.xpath("//select[@name='campaigntype']"));
		 Select s=new Select(ele);
		List<WebElement> ele2 = s.getOptions();
		 TreeSet<String> set=new TreeSet<String>();
		for( WebElement se:ele2)
		{
			String text = se.getText();
			set.add(text);
		}
		
		for(String tex: set)
		{
			System.out.println(tex);
		}
		// set.
		//Assert.assertTrue(true);
		
		
	}
}
