package epf;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test1 {

	@Test
	public void test1() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://unifiedportal-emp.epfindia.gov.in/epfo/");
		driver.manage().window().maximize();
		driver.findElementById("username").sendKeys("raoandkhan123");
		driver.findElementById("password").sendKeys("sekar&123");
		
		driver.findElementByXPath("//button[@class='btn btn-success btn-logging']/span").click();
		
		List<WebElement> list1= driver.findElementsByXPath("//a[@class='dropdown-toggle']");
		for(WebElement ele:list1){
			String s1=ele.getText();
			if(s1.equalsIgnoreCase("Payments")){
				ele.click();
				Thread.sleep(3000);
				driver.findElementByXPath("//a[contains(text(),'ECR/RETURN FILING')]").click();			
			}
			Thread.sleep(5000);
			
			driver.findElementByXPath("//a[contains(@title,'upload ECR')]").click();
			//driver.findElementByXPath("(//div[@id='dvUploadECR']/h3)").click();
		}

	}

}
