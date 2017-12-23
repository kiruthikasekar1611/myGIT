package week2;

import org.openqa.selenium.chrome.ChromeDriver;
import java.util.*;

public class LearnWindows {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		
		driver.findElementByLinkText("Contact Us").click();
		
		Set<String> allWindows=driver.getWindowHandles();
		
		for(String web:allWindows){
			driver.switchTo().window(web);
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
		}
		
		

	}

}
