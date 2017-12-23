package testcase;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import week2.wdMethods.ProjectMethods;

public class EditContact extends ProjectMethods {	

	@Test
	public void editcontact() throws InterruptedException{

		login();{

			click(locateElement("xpath", "//a[text()='Contacts']"));		
			click(locateElement("xpath", "//a[text()='Find Contacts']"));
			type(locateElement("xpath","(//input[@name='firstName'])[3]"),"kirthi");
			click(locateElement("xpath","//button[text()='Find Contacts']"));
			Thread.sleep(9000);

			click(locateElement("xpath","(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a)[1]"));
			verifyTitle("View Contact");
			click(locateElement("xpath","//a[text()='Edit']"));
			
			String newName="Carthika";
			
			type(locateElement("id","updateContactForm_firstName"),newName);
			click(locateElement("xpath","//input[@value='Update']"));
			
			verifyPartialText((locateElement("id","viewContact_fullName_sp")),newName);
			
			close();
			
			
			
			
			





		}

	}
}
