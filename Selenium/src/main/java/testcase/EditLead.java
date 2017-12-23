package testcase;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import week2.wdMethods.ProjectMethods;

public class EditLead extends ProjectMethods{
	
	@Override
	public void login(){
		startApp("chrome", "http://leaftaps.com/opentaps");
		WebElement eleUserName = locateElement("id", "username");
		type(eleUserName, "DemoSalesManager");		
		type(locateElement("id", "password"), "crmsfa");
		click(locateElement("class", "decorativeSubmit"));
		click(locateElement("CRM/SFA"));
		click(locateElement("Leads"));	
	}

	@Test
	public void editlead() throws InterruptedException {
		
		login();		
		click(locateElement("Find Leads"));

		//type(locateElement("xpath","//input[@class=' x-form-text x-form-field ']"),"babu");
		
		type(locateElement("xpath","(//input[@name='firstName'])[3]"),"a");
		
		click(locateElement("xpath","//button[text()='Find Leads']"));
		Thread.sleep(8000);

		
		click(locateElement("xpath","(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a)[1]"));

		//verify title of page
		verifyTitle("View Lead");

		click(locateElement("xpath","//a[text()='Edit']"));
		String newCompanyName = "HC technologiesL";
		type(locateElement("id","updateLeadForm_companyName"),newCompanyName);

		click(locateElement("xpath","//input[@value='Update']"));

		verifyPartialText((locateElement("id","viewLead_companyName_sp")),newCompanyName);


		close();

	}
}

