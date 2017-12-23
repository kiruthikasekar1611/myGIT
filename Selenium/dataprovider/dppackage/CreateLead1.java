package dppackage;

import org.testng.annotations.Test;

public class CreateLead1 extends ProjectMethods1{

	@Test(dataProvider="fetchDataForCreateLead", dataProviderClass=utilpackage.GetData.class,groups="smoke")
	public void createLead(String cname,String fname,String lname, String drop1,int drop2) throws InterruptedException {
	
		click(locateElement("xpath","//a[text()='Create Lead']"));
		type(locateElement("id", "createLeadForm_companyName"),cname);
		type(locateElement("id", "createLeadForm_firstName"),fname);
		type(locateElement("id","createLeadForm_lastName"),lname);
		selectDropDownUsingText(locateElement("id", "createLeadForm_dataSourceId"),drop1);
		selectDropDownUsingIndex(locateElement("id","createLeadForm_industryEnumId"),drop2);
		
		click(locateElement("xpath", "//input[@value='Create Lead']"));

	}

	

}
