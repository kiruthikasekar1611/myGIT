package week6;

import java.util.*;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnSortable {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://jqueryui.com/");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.findElementByLinkText("Sortable").click();
		
		driver.findElementByXPath("//a[text()='Sortable']").click();
		WebElement demo= driver.findElementByClassName("demo-frame");
		driver.switchTo().frame(demo);
		
		List<WebElement> list1=driver.findElementsByXPath("//ul[@id='sortable']/li");

		WebElement ele1=list1.get(0);
		WebElement ele4=list1.get(3);
		
		int x=ele4.getLocation().getX();
		int y=ele4.getLocation().getY();
		
		Actions a=new Actions(driver);
		
		a.clickAndHold(ele1).moveByOffset(x, y).build().perform();		
		driver.close();
	}

}
