package stepDefinitions;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
//import automationFramework.pageBase;
import automationFramework.stepBase;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks  extends stepBase{

	public Hooks() {
		// TODO Auto-generated constructor stub
	}// end constructor
	
	@Before()
	public void beforevaldiation()
	{
		// System.out.println("Before Mobile  hook");
	}
	
	@After("@SmokeTest")
	public void Aftervaldiation()
	{
		// Below close only the current window. Use if if you are required multiple tabs.
		//driver.close(); 
		
        driver.quit(); // close the browser
	}

}// end class
