package testcase;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import week2.wdMethods.ProjectMethods;
import week2.wdMethods.SeMethods;

public class DuplicateLead extends ProjectMethods {

	@Test
	public void duplicatelead() throws InterruptedException {
		
		login();	
		click(locateElement("Leads"));
		click(locateElement("Find Leads"));
		click(locateElement("xpath","//span[text()='Email']"));
		
		type(locateElement("xpath","//input[@name='emailAddress']"),"a");
		
		click(locateElement("xpath","//button[text()='Find Leads']"));
		Thread.sleep(4000);
		
		WebElement firstNameElement=locateElement("xpath","//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a[1]");
		
		String firstName=getText(firstNameElement);
		click(firstNameElement);
		System.out.println("First name of the Lead is"+firstName);
		
		click(locateElement("Duplicate Lead"));	
		
		System.out.println("Title verification result "+verifyTitle("Duplicate Lead | opentaps CRM"));
		
		click(locateElement("xpath","//input[@value='Create Lead']"));
		verifyExactText(locateElement("id", "viewLead_firstName_sp"), firstName);
		close();
			
	}

}
