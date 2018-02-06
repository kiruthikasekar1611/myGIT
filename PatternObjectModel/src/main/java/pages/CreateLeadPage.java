package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class CreateLeadPage extends ProjectMethods {
	
	public CreateLeadPage(RemoteWebDriver driver,ExtentTest test){
		this.driver= driver;
		this.test= test;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.ID,using="createLeadForm_companyName")
	private WebElement compName;
	public CreateLeadPage enterComName(String cName) {
		type(compName,cName);
		return this;
	}
	
	@FindBy(how=How.ID,using="createLeadForm_firstName")
	private WebElement firstName;
	public CreateLeadPage enterfName(String fName) {
		type(firstName,fName);
		return this;
	}
	
	@FindBy(how=How.ID,using="createLeadForm_lastName")
	private WebElement lastName;
	public CreateLeadPage enterlName(String lName) {
		type(lastName,lName);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//input[@class='smallSubmit']")
	private WebElement createLeadButton;
	public ViewLeadPage clickCreateLeadButton() {
		click(createLeadButton);
		return new ViewLeadPage(driver,test);
	}
	
	
	

}
