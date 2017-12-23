package week1day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login {

	public static void main(String[] args) {
		// To Load driver
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
//		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver_32bit.exe");
		
		//Classname object=new Classname();
		
//		FirefoxDriver driver = new FirefoxDriver();
		ChromeDriver driver = new ChromeDriver();
		
		//Load the Url
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
	//find user name and password
		
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		
		driver.findElementByClassName("decorativeSubmit").click();
		
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();
		
//		driver.findElementById("username").sendKeys("DemoSalesManager");
//		driver.findElementById("password").sendKeys("crmsfa");
		
		driver.findElementById("createLeadForm_companyName").sendKeys("Test Leaf 1");
		driver.findElementById("createLeadForm_firstName").sendKeys("Chitra");
		driver.findElementById("createLeadForm_lastName").sendKeys("Krithika");
		driver.findElementByName("submitButton").click();

	}

}
