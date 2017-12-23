package week1day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Homework {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();
		
		driver.findElementById("createLeadForm_companyName").sendKeys("LTI");
		driver.findElementById("createLeadForm_firstName").sendKeys("krithika");
		
		Select dropdown=new Select(driver.findElementById("createLeadForm_dataSourceId"));
		dropdown.selectByVisibleText("Cold Call");
		
		driver.findElementById("createLeadForm_firstNameLocal").sendKeys("Krithi");
		driver.findElementById("createLeadForm_personalTitle").sendKeys("Ms");
		driver.findElementById("createLeadForm_generalProfTitle").sendKeys("Hi");
		driver.findElementById("createLeadForm_annualRevenue").sendKeys("300000");
		
		Select dropdown1= new Select(driver.findElementById("createLeadForm_industryEnumId"));
		dropdown1.selectByVisibleText("Computer Software");
		
		Select dropdown2= new Select(driver.findElementById("createLeadForm_ownershipEnumId"));
		dropdown2.selectByVisibleText("S-Corporation");
		
		driver.findElementById("createLeadForm_sicCode").sendKeys("9087");
		driver.findElementById("createLeadForm_description").sendKeys("TestLeaf chennai");
		driver.findElementById("createLeadForm_importantNote").sendKeys("Important note..");
		driver.findElementById("createLeadForm_primaryPhoneCountryCode").sendKeys("91");
		driver.findElementById("createLeadForm_primaryPhoneAreaCode").sendKeys("044");
		driver.findElementById("createLeadForm_primaryPhoneExtension").sendKeys("000");
		
		driver.findElementById("createLeadForm_primaryEmail").sendKeys("msk16.11@gmail.com");
		driver.findElementById("createLeadForm_generalToName").sendKeys("KIRTHI");
		driver.findElementById("createLeadForm_generalAddress1").sendKeys("RAMAPURAM");
		driver.findElementById("createLeadForm_generalCity").sendKeys("CHENNAI");
		driver.findElementById("createLeadForm_generalPostalCode").sendKeys("600089");
		driver.findElementById("createLeadForm_generalPostalCodeExt").sendKeys("90899");
		
		
		
		driver.findElementById("createLeadForm_lastName").sendKeys("sekar");
		
		Select dropdown3= new Select(driver.findElementById("createLeadForm_marketingCampaignId"));
		dropdown3.selectByVisibleText("Car and Driver");
		
		driver.findElementById("createLeadForm_lastNameLocal").sendKeys("M.S.");
		driver.findElementById("createLeadForm_departmentName").sendKeys("ECE");
		
		Select dropdown4= new Select(driver.findElementById("createLeadForm_currencyUomId"));
		dropdown4.selectByVisibleText("BDT - Bangladesh Taka");
		
		driver.findElementById("createLeadForm_numberEmployees").sendKeys("5000");
		driver.findElementById("createLeadForm_tickerSymbol").sendKeys("YUUUU");
		
		driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("978543271912");
		driver.findElementById("createLeadForm_primaryPhoneAskForName").sendKeys("Sekar");
		driver.findElementById("createLeadForm_primaryWebUrl").sendKeys("www.krithi.in");
		driver.findElementById("createLeadForm_generalAttnName").sendKeys("Vijaya");
		driver.findElementById("createLeadForm_generalAddress2").sendKeys("porur");
		
		Select dropdown5= new Select(driver.findElementById("createLeadForm_generalStateProvinceGeoId"));
		dropdown5.selectByVisibleText("Delaware");
		
		Select dropdown6= new Select(driver.findElementById("createLeadForm_generalCountryGeoId"));
		dropdown6.selectByVisibleText("Bangladesh");
		
		driver.findElementByName("submitButton").click();
		
	}

}
