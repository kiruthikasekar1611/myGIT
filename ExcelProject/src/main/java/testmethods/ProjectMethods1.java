package testmethods;

import org.testng.annotations.*;

public class ProjectMethods1 extends SeMethods1 {
	
	@Parameters({"browser","URL","uName","pwd"})
	@BeforeMethod(groups="common")
	public void login(String browser,String URL,String uName, String pwd){
		startApp(browser, URL);
		type((locateElement("id", "username")), uName);		
		type(locateElement("id", "password"), pwd);
		click(locateElement("class", "decorativeSubmit"));
		click(locateElement("CRM/SFA"));
	}
	
	@AfterMethod(groups="common")
	public void close(){
		closeBrowser();
		
	}

}
