package week2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.manage().window().maximize();

		//WebElement web=driver.findElementById("iframeResult");
		//driver.switchTo().frame(web);
		driver.switchTo().frame("iframeResult");
		

		driver.findElementByXPath("//button[@onclick='myFunction()']").click();

		Alert alert1=driver.switchTo().alert();

		String str=alert1.getText();
		System.out.println(str);

		String str1="danvanth_chitra";
		alert1.sendKeys(str1);

		alert1.accept();
		
		String str2=driver.findElementByXPath("//body/p[@id='demo']").getText();
		System.out.println("Text in frame ...."+str2);
		
		if(str2.contains(str1)){
			System.out.println("entered text is same as the displayed text");
		}
		else{
			System.out.println("text not matching");
		}


	}

}
