package week2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertWindowHomework {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Merge Leads").click();
		driver.findElementByXPath("//a/img[@src='/images/fieldlookup.gif']").click();
		
		
		Set<String> allWindows= driver.getWindowHandles();
		String parentWindowHandle=driver.getWindowHandle();
		System.out.println("Parent Handle ..."+parentWindowHandle);
		
		for(String str:allWindows){
			driver.switchTo().window(str);
			driver.manage().window().maximize();
		}
		
		Thread.sleep(2000);
				
		String childWindowHandle=driver.getWindowHandle();
		System.out.println("Child window .."+childWindowHandle);
		driver.findElementByXPath("//div/input[@name='id']").sendKeys("12269");
		driver.findElementByXPath("//tr/td/em/button[@class='x-btn-text']").click();
		Thread.sleep(3000);
		WebElement firstnameEle=driver.findElementByXPath("//a[@class='linktext'][1]");
		String firstname=firstnameEle.getText();
		firstnameEle.click();
		driver.switchTo().window(parentWindowHandle);
		System.out.println("Switched to main window ...");
		System.out.println(driver.getWindowHandle());
		
		System.out.println(driver.getTitle());

		driver.findElementByXPath("(//img[@alt='Lookup'])[2]").click();
		
		Set<String> allWindows1= driver.getWindowHandles();
		for(String str1:allWindows1){
			driver.switchTo().window(str1);
			driver.manage().window().maximize();
		}
		
		String childWindow2= driver.getWindowHandle();
		driver.switchTo().window(childWindow2);
		
		driver.findElementByXPath("//div/input[@name='id']").sendKeys("12265");
		driver.findElementByXPath("//tr/td/em/button[@class='x-btn-text']").click();
		Thread.sleep(3000);
		driver.findElementByXPath("//a[@class='linktext'][1]").click();
		
		driver.switchTo().window(parentWindowHandle);
		driver.findElementByXPath("//a[@class='buttonDangerous']").click();
		
		driver.switchTo().alert().accept();
		
		driver.findElementByLinkText("Find Leads").click();
		
		driver.findElementByXPath("//input[@name='id']").sendKeys(firstname);
		Thread.sleep(5000);
		
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		
		Thread.sleep(3000);
		String resultText=driver.findElementByXPath("//div[@class='x-paging-info'][1]").getText();
		
		System.out.println(resultText);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}

}
