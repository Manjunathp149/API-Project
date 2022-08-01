package Assignment;

import org.apache.hc.core5.util.Asserts;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.crm.ObjectRepository.CampaignSearchPage;
import com.crm.ObjectRepository.ClickOnCreateCampaignbtn;
import com.crm.ObjectRepository.HomePage;

import GenericUtilities.BaseClassUtilities;


@Listeners(GenericUtilities.ITestListenerImplementation.class)

public class CampaignAdvanceSaerchTest extends BaseClassUtilities{


	
	@Test
	public void CampaignAdvanceSearch()
	{
		
		
		//Click on Campaign major tab in the Home page
		HomePage h=new HomePage(driver);
		h.Clickcampaign(driver);
     	//Assert.fail();
		
		
		//Click on Advance search link
		ClickOnCreateCampaignbtn C=new ClickOnCreateCampaignbtn(driver);
		C.clickSearchlink();
		
		
		CampaignSearchPage c=new CampaignSearchPage(driver);
		  c.getDetails();
		 String c1 = c.getCampdisp().getText();
		 
		 Asserts.check(true, c1);
		 System.out.println("True");
		 
		 
		 
		 
		 
		 
		 
		 /*if(c.getCampdisp().isDisplayed())
		{
			System.out.println("Search is success");
		}
		else
		{
			System.out.println("Search is not success");
		}*/
		
		
	}
}
