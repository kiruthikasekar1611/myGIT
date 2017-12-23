package testcase;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import week2.wdMethods.ProjectMethods;

public class Contact extends ProjectMethods {	
	@Test
	public void contact() throws InterruptedException{

		login();
		String firstName="andu";
		String lastName="sekar";
		
		String finalName=firstName+" "+lastName;
		System.out.println("First name and last name is .."+finalName);
		
		click(locateElement("xpath","//a[text()='Create Contact']"));
		type((locateElement("id", "firstNameField")),firstName);
		type((locateElement("id","createContactForm_firstNameLocal")),"krithika");
		type((locateElement("id","createContactForm_personalTitle")),"Ms");
		type((locateElement("id","createContactForm_generalProfTitle")),"Proprieter");
		
		/*type((locateElement("id","createContactForm_description")),"call me 769876549");
		type((locateElement("id","createContactForm_importantNote")),"Contact details");
		type((locateElement("id","lastNameField")),lastName);
		type((locateElement("id","createContactForm_lastNameLocal")),"M S");
		type((locateElement("id","createContactForm_departmentName")),"HR");
		selectDropDownUsingIndex((locateElement("id","createContactForm_preferredCurrencyUomId")),3);
		
		
		type((locateElement("id","createContactForm_primaryPhoneCountryCode")),"91");
		type((locateElement("id","createContactForm_primaryPhoneAreaCode")),"044");
		type((locateElement("id","createContactForm_primaryPhoneExtension")),"5313");
		type((locateElement("id","createContactForm_primaryEmail")),"msk@gmail.com");
		type((locateElement("id","createContactForm_primaryPhoneNumber")),"98766");
		type((locateElement("id","createContactForm_primaryPhoneAskForName")),"Sunitha");
		
		
		type((locateElement("id","createContactForm_generalAddress1")),"No.2345");
		type((locateElement("id","createContactForm_generalAddress2")),"17th Street");
		type((locateElement("id","createContactForm_generalAttnName")),"Blue Star");
		type((locateElement("id","createContactForm_generalCity")),"Chennai");
		type((locateElement("id","createContactForm_generalPostalCode")),"987");
		type((locateElement("id","createContactForm_generalPostalCodeExt")),"53");
		
		
		selectDropDownUsingText((locateElement("id","createContactForm_generalCountryGeoId")),"India");
		Thread.sleep(3000);
		selectDropDownUsingText((locateElement("id","createContactForm_generalStateProvinceGeoId")), "TAMILNADU");
		
		Thread.sleep(6000);
		WebElement ele=locateElement("id","generalToNameField");
		
		String newname=ele.getAttribute("value");
		System.out.println("new name to be verified is "+newname);
		
		verifyExactAttribute(ele,"value",finalName);*/
		click(locateElement("xpath", "//input[@value='Create Contact']"));
		close();
		
		
		
	}
}
