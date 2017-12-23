package week1day2;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dailyques1711 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/checkbox.html");
		driver.manage().window().maximize();
		
		/*WebElement dropdown1=driver.findElementById("dropdown1");
		Select dropdown1select=new Select(dropdown1);
		
		List<WebElement> dropdown1List=dropdown1select.getOptions();
		int length=dropdown1List.size();
		dropdown1select.selectByIndex(length-2);	*/
		
		driver.get("http://leafground.com/pages/checkbox.html");
		driver.manage().window().maximize();
	
		boolean result=driver.findElementByXPath("//div[@class='example'][2]/input").isSelected();
		
		driver.findElementByXPath("//div[@class='example'][2]/input").isSelected();
		if(result) System.out.println("it is selected");
		else System.out.println("It is not selected");
		
		boolean result1=driver.findElementByXPath("//div[@class='example'][3]/input").isSelected();
		if(result1) System.out.println("it is selected");
		else System.out.println("It is not selected");
		
		

	}

}
