package testmethods;

import org.testng.annotations.Test;

public class CreateLead1 extends ProjectMethods1{

	@Test(dataProvider="getDatafromExcelcreateLead", dataProviderClass=utilities.GetData.class,groups="smoke")
	public void createLead(String cname,String fname,String lname) throws InterruptedException {
	
		click(locateElement("xpath","//a[text()='Create Lead']"));
		type(locateElement("id", "createLeadForm_companyName"),cname);
		type(locateElement("id", "createLeadForm_firstName"),fname);
		type(locateElement("id","createLeadForm_lastName"),lname);
		Thread.sleep(3000);
		click(locateElement("xpath", "//input[@value='Create Lead']"));

	}

	

}
