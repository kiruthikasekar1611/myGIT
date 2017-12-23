package week1day2;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Irctc_countryalone {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		driver.manage().window().maximize();
		WebElement country=driver.findElementById("userRegistrationForm:countries");
		Select dropdown=new Select(country);
		List <WebElement> options = dropdown.getOptions();	
		for(WebElement web:options){
			System.out.println(web.getText());
		}
			
	}

}
