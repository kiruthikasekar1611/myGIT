package week1day2;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Irctc_country {

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
		
		ArrayList<String> list1=new ArrayList<String>();
		
	    for(WebElement web:options){
	    	if(web.getText().startsWith("E")){
	    		String web11=web.getText();
	    		System.out.println(web11);
	    		list1.add(web11);
	    	}
	    	
	    }
	   for(String str:list1){
		   System.out.println(str);
	   }	        		
	   System.out.println("The size of the List of country names starting with E is "+ list1.size());
	   String reqcountry=list1.get(1); 
	   System.out.println("Required Country in index 2 is "+reqcountry);
	   
	   dropdown.selectByVisibleText(reqcountry);

	    }

	}


