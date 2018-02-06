package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC003_CreateLead extends ProjectMethods{
	
	@BeforeClass
	public void setData() {
		dataSheetName = "TC003";
		testCaseName = "TC003_CreateLead";
		testDescription = "To create a Lead";
		category= "Smoke";
		authors	="Kirthi";
		browserName ="chrome";
	}
	
	@Test(dataProvider="fetchData")
	public void CreateLead(String userName,String password,String cName, String fName,String lName) {
		
		new LoginPage(driver, test)
		.enterUserName(userName)
		.enterPassword(password)
		.clickLogin()
		.ClickCrmsfaLink()
		.clickCreateLeadLink()
		.enterComName(cName)
		.enterfName(fName)
		.enterlName(lName)
		.clickCreateLeadButton()
		.verifyfName(fName);
		

	}


}
