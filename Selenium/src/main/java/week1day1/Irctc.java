package week1day1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Irctc {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		
		driver.manage().window().maximize();
		
		driver.findElementById("userRegistrationForm:userName").sendKeys("krith1611921248");
		driver.findElementById("userRegistrationForm:password").sendKeys("Krithi98711");
		driver.findElementById("userRegistrationForm:confpasword").sendKeys("Krithi98711");
		
		Select dropdown1= new Select(driver.findElementById("userRegistrationForm:securityQ"));
		dropdown1.selectByVisibleText("What is your pet name?");
		
		driver.findElementById("userRegistrationForm:securityAnswer").sendKeys("keerthi");
		
		Select dropdown2= new Select(driver.findElementById("userRegistrationForm:prelan"));
		dropdown2.selectByVisibleText("English");
		
		driver.findElementById("userRegistrationForm:firstName").sendKeys("Kiruthika");
		driver.findElementById("userRegistrationForm:middleName").sendKeys("sekar");
		driver.findElementById("userRegistrationForm:lastName").sendKeys("maluvathu");
		
		driver.findElementByXPath("//td/label[contains(text(),'Female')]").click();
		
		driver.findElementByXPath("//td/label[contains(text(),'Unmarried')]").click();
		
		Select dropdown3= new Select(driver.findElementById("userRegistrationForm:occupation"));
		dropdown3.selectByVisibleText("Private");
		
		driver.findElementById("userRegistrationForm:uidno").sendKeys("676736542718");
		driver.findElementById("userRegistrationForm:idno").sendKeys("CBXPK0876A");
		
		Select dropdown4= new Select(driver.findElementById("userRegistrationForm:countries"));
		dropdown4.selectByVisibleText("India");
		
		driver.findElementById("userRegistrationForm:email").sendKeys("msk16.11@gmail.com");
		driver.findElementById("userRegistrationForm:mobile").sendKeys("8765489087");
		
		Select dropdown5= new Select(driver.findElementById("userRegistrationForm:nationalityId"));
		dropdown5.selectByVisibleText("India");
		
		driver.findElementById("userRegistrationForm:address").sendKeys("No.289, Ramapuram");
		driver.findElementById("userRegistrationForm:pincode").sendKeys("600028",Keys.TAB);
		
		Thread.sleep(5000);
		
		Select dropdown6= new Select(driver.findElementById("userRegistrationForm:cityName"));
		dropdown6.selectByVisibleText("Chennai");
		
		Thread.sleep(5000);
		
		Select dropdown7= new Select(driver.findElementById("userRegistrationForm:postofficeName"));
		dropdown7.selectByVisibleText("Ramakrishna Nagar S.O (Chennai)");	
		
		driver.findElementById("userRegistrationForm:landline").sendKeys("8765590987");
		
		driver.findElementByPartialLinkText("Submit Registration Form>>>").click();
		
		
		
		
	}

}
