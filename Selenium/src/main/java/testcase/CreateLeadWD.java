package testcase;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import week2.wdMethods.ProjectMethods;
import week2.wdMethods.SeMethods;

public class CreateLeadWD extends ProjectMethods{

	@Test
	public void createLead() throws InterruptedException {
		
		login();
		
		click(locateElement("Create Lead"));
		
		/*type(locateElement("id", "createLeadForm_companyName"),"LTI INFOTECH");
		type(locateElement("id", "createLeadForm_firstName"),"Danvanth");*/
		
		/*selectDropDownUsingText(locateElement("id", "createLeadForm_dataSourceId"), "Cold Call");
		
		type(locateElement("id", "createLeadForm_firstNameLocal"),"karthi");
		type(locateElement("id", "createLeadForm_personalTitle"),"Ms");
		type(locateElement("id", "createLeadForm_generalProfTitle"),"HII");
		type(locateElement("id", "createLeadForm_annualRevenue"),"709890");
		
		selectDropDownUsingText(locateElement("id","createLeadForm_industryEnumId"), "Computer Software");
		
		selectDropDownUsingText(locateElement("id","createLeadForm_ownershipEnumId"), "S-Corporation");
		
		type(locateElement("id","createLeadForm_sicCode"),"9086");
		type(locateElement("id","createLeadForm_description"),"Test Leaf");
		
		type(locateElement("id","createLeadForm_importantNote"),"Important note..");
		type(locateElement("id","createLeadForm_primaryPhoneCountryCode"),"91");
		type(locateElement("id","createLeadForm_primaryPhoneAreaCode"),"044");
		type(locateElement("id","createLeadForm_primaryPhoneExtension"),"000");
		
		type(locateElement("id","createLeadForm_primaryEmail"),"msk16.11@gmail.com");
		type(locateElement("id","createLeadForm_generalToName"),"KIRTHI");
		type(locateElement("id","createLeadForm_generalAddress1"),"RAMAPURAM");
		type(locateElement("id","createLeadForm_generalCity"),"CHENNAI");
		type(locateElement("id","createLeadForm_generalPostalCode"),"600089");
		type(locateElement("id","createLeadForm_generalPostalCodeExt"),"90899");*/
		
		//type(locateElement("id","createLeadForm_lastName"),"sekar");
		
		/*type(locateElement("id","createLeadForm_lastNameLocal"),"M.S.");
		type(locateElement("id","createLeadForm_departmentName"),"ECE");
		
		type(locateElement("id","createLeadForm_numberEmployees"),"5000");
		type(locateElement("id","createLeadForm_tickerSymbol"),"YUUUU");
		
		
		selectDropDownUsingText(locateElement("id","createLeadForm_marketingCampaignId"), "Car and Driver");
		
		selectDropDownUsingText(locateElement("id","createLeadForm_currencyUomId"), "BDT - Bangladesh Taka");
		
		type(locateElement("id","createLeadForm_primaryPhoneNumber"),"978543271912");
		type(locateElement("id","createLeadForm_primaryPhoneAskForName"),"Sekar");
		type(locateElement("id","createLeadForm_primaryWebUrl"),"www.krithi.in");
		type(locateElement("id","createLeadForm_generalAttnName"),"Vijaya");
		type(locateElement("id","createLeadForm_generalAddress2"),"porur");
		
		selectDropDownUsingText(locateElement("id","createLeadForm_generalCountryGeoId"), "India");
		
		Thread.sleep(3000);
		
		selectDropDownUsingText(locateElement("id","createLeadForm_generalStateProvinceGeoId"), "TAMILNADU");
		
		Thread.sleep(3000);*/
		
		click(locateElement("name", "submitButton"));
	
		close();
	}

	

}
