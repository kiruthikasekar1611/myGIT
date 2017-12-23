package testcase;

import org.junit.Test;
import org.openqa.selenium.WebElement;

import week2.wdMethods.ProjectMethods;

public class DeleteLead extends ProjectMethods{
	
	@Test
	public void deletelead() throws InterruptedException {
		
		login();
		
		click(locateElement("Leads"));
		click(locateElement("Find Leads"));
		click(locateElement("xpath","//span[text()='Phone']"));
		
		type(locateElement("xpath","//input[@name='phoneCountryCode']"),"91");
		
		click(locateElement("xpath","//button[text()='Find Leads']"));
		Thread.sleep(3000);
		
		//Capture lead ID of First Resulting lead

		WebElement firstLeadIdElement= locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]");
		String firstleadid = getText(firstLeadIdElement);
		click(firstLeadIdElement);
		
		click(locateElement("xpath","//a[text()='Delete']"));
		
		click(locateElement("Find Leads"));
		
		type(locateElement("xpath","//input[@name='id']"),firstleadid);
		click(locateElement("xpath","//button[text()='Find Leads']"));
	
		
		WebElement errorMessElement = locateElement("xpath","//div[@class='x-paging-info']");
		System.out.println("Error message displayed is "+getText(errorMessElement));
		verifyExactText(errorMessElement, "No records to display");
	
		
		close();

}
}

