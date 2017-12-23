package week1day2;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Country_irctc_count {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();

		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		driver.manage().window().maximize();

		WebElement country=driver.findElementById("userRegistrationForm:countries");

		Select dropdown=new Select(country);
		List <WebElement> options = dropdown.getOptions();	
		int a=options.size();
		System.out.println(a);
		int count=0;
		
		for(WebElement web:options){
			if(web.getText().startsWith("E")){
				count++;
				if(count==2){
					String reqcountry=web.getText();
					System.out.println("Required Country in index 2 is "+reqcountry);
					dropdown.selectByVisibleText(reqcountry);
					break;
				}
			}

		}
		
		

	}

}




