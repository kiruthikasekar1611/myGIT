package week2.wdMethods;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnLinks {


	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();

		driver.get("https://www.google.co.in/");

		driver.manage().window().maximize();


		driver.findElementById("lst-ib").sendKeys("testleaf");

		Thread.sleep(3000);
		driver.findElementByXPath("//input[@value='Google Search']").click();
		File src= driver.getScreenshotAs(OutputType.FILE);

		List <WebElement> noOfLinks= driver.findElementsByTagName("a");

		int sizeOfList =noOfLinks.size();
		
		System.out.println("number of links present "+sizeOfList);

		for( WebElement allLinks:noOfLinks){
			
			if((allLinks.getText()).contains("test")){
				System.out.println(allLinks.getText());	
			
		}
			noOfLinks.get(0).click();

		File dest= new File("./snaps/snap.jpeg");

		try {
			FileUtils.copyFile(src, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}





	}
	}
}
