package testcase;


import org.testng.annotations.Test;

import week2.wdMethods.ProjectMethods;

public class DeacivateContact extends ProjectMethods {	

	@Test
	public void deactivatecontact() throws InterruptedException{

		login();

		click(locateElement("xpath", "//a[text()='Contacts']"));		
		click(locateElement("xpath", "//a[text()='Find Contacts']"));
		String nameToBeTyped="Vicky";
		type(locateElement("xpath","(//input[@name='firstName'])[3]"),nameToBeTyped);
		click(locateElement("xpath","//button[text()='Find Contacts']"));
		Thread.sleep(9000);

		String id=getText(locateElement("xpath","(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]"));
		System.out.println("ID is "+id);
		
		click(locateElement("xpath","(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a)[1]"));
		verifyTitle("View Contact");
		click(locateElement("xpath","//a[text()='Deactivate Contact']"));
		acceptAlert();
		String message=getText(locateElement("xpath","//span[@class='subSectionWarning']"));
		System.out.println("Confirmation message for deactivation is "+message);
		
		verifyPartialText((locateElement("xpath","//span[@class='subSectionWarning']")),"contact was deactivated");
		click(locateElement("xpath", "//a[text()='Find Contacts']"));
		type(locateElement("xpath","//input[@name='id']"),id);
		click(locateElement("xpath","//button[text()='Find Contacts']"));
		Thread.sleep(4000);
		
		verifyPartialText((locateElement("xpath","//div[@class='x-paging-info']")),"No records to display");
		close();
		
		
		
	
		


	}
}
