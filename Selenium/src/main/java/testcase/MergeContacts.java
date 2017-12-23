package testcase;


import org.testng.annotations.Test;

import week2.wdMethods.ProjectMethods;

public class MergeContacts extends ProjectMethods {	

	@Test
	public void mergecontacts() throws InterruptedException{

		login();
		click(locateElement("xpath", "//a[text()='Contacts']"));	
		click(locateElement("xpath", "//a[text()='Merge Contacts']"));
		
		click(locateElement("xpath", "(//img[@alt='Lookup'])[1]"));
		switchToWindow(1);
		String fromName="abid";
		type(locateElement("xpath","//input[@name='firstName']"),fromName);
		click(locateElement("xpath","//button[text()='Find Contacts']"));
		Thread.sleep(9000);
		String fromNameId=getText(locateElement("xpath","(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]"));		
		System.out.println("From name ID is "+fromNameId);
		click(locateElement("xpath","(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a)[1]"));		
		switchToWindow(0);
		
		click(locateElement("xpath", "(//img[@alt='Lookup'])[2]"));
		switchToWindow(1);
		String toName="was";
		type(locateElement("xpath","//input[@name='firstName']"),toName);
		click(locateElement("xpath","//button[text()='Find Contacts']"));
		Thread.sleep(9000);
		click(locateElement("xpath","(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a)[1]"));
		switchToWindow(0);
		
		click(locateElement("xpath","//a[text()='Merge']"));
		acceptAlert();
		click(locateElement("xpath", "//a[text()='Find Contacts']"));
		type(locateElement("xpath","//input[@name='id']"),fromNameId);
		click(locateElement("xpath","//button[text()='Find Contacts']"));
		Thread.sleep(4000);
		
		verifyPartialText((locateElement("xpath","//div[@class='x-paging-info']")),"No records to display");
		close();
		
		
		
	}

}
