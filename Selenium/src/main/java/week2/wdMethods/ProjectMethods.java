package week2.wdMethods;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ProjectMethods extends SeMethods {
	
	public void login(){
		startApp("chrome", "http://leaftaps.com/opentaps");
		WebElement eleUserName = locateElement("id", "username");
		type(eleUserName, "DemoSalesManager");		
		type(locateElement("id", "password"), "crmsfa");
		click(locateElement("class", "decorativeSubmit"));
		click(locateElement("CRM/SFA"));
	}
	
	
	public void close(){
		closeBrowser();
		
	}

}
