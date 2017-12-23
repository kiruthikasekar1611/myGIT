package week1day2;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Learndropdown {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();

		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementById("username").sendKeys("DemoCSR");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();

		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();
		
		WebElement sourcedropdown = driver.findElementById("createLeadForm_dataSourceId");
		Select dropdown= new Select(sourcedropdown);
		List<WebElement> sourcelist= dropdown.getOptions();
		int sourcesize= sourcelist.size();
		dropdown.selectByIndex(sourcesize-1);
		
		WebElement marketingdropdown = driver.findElementById("createLeadForm_marketingCampaignId");
		Select dropdown1= new Select(marketingdropdown);
		dropdown1.selectByVisibleText("Car and Driver");
		
		WebElement countrydropdown = driver.findElementById("createLeadForm_generalCountryGeoId");
		Select dropdown2= new Select(countrydropdown);
		dropdown2.selectByValue("BTN");
		
		
		

	}

}
