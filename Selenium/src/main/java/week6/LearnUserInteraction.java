package week6;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnUserInteraction {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://jqueryui.com/");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.findElementByLinkText("Draggable").click();
		
		WebElement ele=driver.findElementByXPath("//iframe[@class='demo-frame']");
		
		driver.switchTo().frame(ele);
		WebElement ele1=driver.findElementById("draggable");
		int x=ele1.getLocation().getX();
		int y=ele1.getLocation().getY();
		
		System.out.println(" Coordinates are ...."+x+" "+y);
		
		Actions a=new Actions(driver);
		a.dragAndDropBy(ele1,107,60).build().perform();
		
		int x1=ele1.getLocation().getX();
		int y1=ele1.getLocation().getY();
		
		System.out.println("After dragging Coordinates are ..."+x1+" "+y1);
		
		driver.close();	

	}

}
