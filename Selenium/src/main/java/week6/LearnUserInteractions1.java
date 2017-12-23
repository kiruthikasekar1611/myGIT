package week6;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnUserInteractions1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.findElementByXPath("//button[@class='_2AkmmA _29YdH8']").click();
		
		WebElement ele=driver.findElementByXPath("//span[text()='Electronics']");
		
		Actions a=new Actions(driver);
		a.moveToElement(ele);
		Thread.sleep(3000);
		WebElement ele1=driver.findElementByXPath("//span[text()='Motorola']");
		a.click(ele1).build().perform();
		
		
		
		
		
		
	}

}
