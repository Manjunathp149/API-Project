package com.crm.Campaign;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.crm.ObjectRepository.CampaignSearchPage;
import com.crm.ObjectRepository.ClickOnCreateCampaignbtn;
import com.crm.ObjectRepository.HomePage;

import GenericUtilities.BaseClassUtilities;


@Listeners(GenericUtilities.ITestListenerImplementation.class)

public class CampaignAdvanceSaerchTest extends BaseClassUtilities{


	
	@Test(groups="smokeTest")
	public void CampaignAdvanceSearch()
	{
		
		
		//Click on Campaign major tab in Home page
		HomePage h=new HomePage(driver);
		h.Clickcampaign(driver);
		
		
		
		//Click on Advance search link
		ClickOnCreateCampaignbtn C=new ClickOnCreateCampaignbtn(driver);
		C.clickSearchlink();
		
		
		CampaignSearchPage c=new CampaignSearchPage(driver);
		  c.getDetails();
		  
		 
		 
		/*{
			System.out.println("Search is success");
		}
		else
		{
			System.out.println("Search is not success");
		}*/
		/*
		 * Assert.assertTrue(c.getCampdisp().isDisplayed());
		 * System.out.println("test case pass");
		 */
			 SoftAssert sa=new SoftAssert();
			 sa.assertTrue(c.getCampdisp().isDisplayed());
			 System.out.println("test case pass");
			 sa.assertAll();
		
		
	}
}
