package dppackage;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class EditLead1 extends ProjectMethods1{
	
	@Override
	@Parameters({"browser","URL","uName","pwd"})
	@BeforeMethod(groups="common")
	public void login(String browser,String URL,String uName, String pwd){
		startApp(browser, URL);
		type((locateElement("id", "username")), uName);		
		type(locateElement("id", "password"), pwd);
		click(locateElement("class", "decorativeSubmit"));
		click(locateElement("CRM/SFA"));
		click(locateElement("Leads"));	
	}

	@Test(dataProvider="fetchDataForEditLead", dataProviderClass=utilpackage.GetData.class,groups="smoke")
	public void editlead(String letterToSearch,String newCompanyName) throws InterruptedException {
			
		click(locateElement("Find Leads"));		
		type(locateElement("xpath","(//input[@name='firstName'])[3]"),letterToSearch);		
		click(locateElement("xpath","//button[text()='Find Leads']"));
		Thread.sleep(9000);		
		click(locateElement("xpath","(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a)[1]"));

		verifyTitle("View Lead");

		click(locateElement("xpath","//a[text()='Edit']"));
		type(locateElement("id","updateLeadForm_companyName"),newCompanyName);
		click(locateElement("xpath","//input[@value='Update']"));

		verifyPartialText((locateElement("id","viewLead_companyName_sp")),newCompanyName);

	}
}

