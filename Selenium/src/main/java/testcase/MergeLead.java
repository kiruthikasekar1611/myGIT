package testcase;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import week2.wdMethods.ProjectMethods;

public class MergeLead extends ProjectMethods{
	
	@Test
	public void mergeLead() throws InterruptedException {
		
		login();	
		click(locateElement("Leads"));
		click(locateElement("Merge Leads"));
		
	// From Lead
		click(locateElement("xpath","//a/img[@src='/images/fieldlookup.gif']"));
		switchToWindow(1);
		Thread.sleep(2000);
		type(locateElement("xpath", "//div/input[@name='id']"), "10057");
		click(locateElement("xpath", "//tr/td/em/button[@class='x-btn-text']"));
		
		Thread.sleep(3000);
		
		WebElement firstnameEle=locateElement("xpath","//a[@class='linktext']");
		String firstname = firstnameEle.getText();
		click(firstnameEle);
		
		switchToWindow(0);

	// To Lead	
		
		click(locateElement("xpath","(//img[@alt='Lookup'])[2]"));
		
		switchToWindow(1);
		
		Thread.sleep(2000);
		
		type(locateElement("xpath", "//div/input[@name='id']"), "10066");
		click(locateElement("xpath", "//tr/td/em/button[@class='x-btn-text']"));
		
		Thread.sleep(3000);
		
		click(locateElement("xpath","//a[@class='linktext'][1]"));
		
		switchToWindow(0);
		
		click(locateElement("xpath","//a[@class='buttonDangerous']"));
		acceptAlert();
		
		click(locateElement("Find Leads"));
		
		type(locateElement("xpath","//input[@name='id']"),firstname);
		
		Thread.sleep(5000);
		
		click(locateElement("xpath","//button[text()='Find Leads']"));
		
		Thread.sleep(3000);
		String resultText=getText(locateElement("xpath","(//div[@class='x-paging-info'])[1]"));
		
		System.out.println("Result Text is "+resultText);
		
		close();
		
	
	}

}
