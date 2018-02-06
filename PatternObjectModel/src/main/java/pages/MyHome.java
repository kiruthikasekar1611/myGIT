package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import com.relevantcodes.extentreports.ExtentTest;
import wdMethods.ProjectMethods;

public class MyHome extends ProjectMethods{
	
	public MyHome(RemoteWebDriver driver,ExtentTest test) {
		this.driver = driver;
		this.test = test;				
		PageFactory.initElements(driver, this);			
	}
	
	@FindBy(how=How.LINK_TEXT,using="Create Lead")
	private WebElement createLeadLink;
	public CreateLeadPage clickCreateLeadLink() {
		click(createLeadLink);
		return new CreateLeadPage(driver, test);
	}

}