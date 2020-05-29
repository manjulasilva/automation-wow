package stepDefinitions;


import java.util.Properties;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;


//import pageObjects.wowHomePage;
import pageObjects.wowLoginPage;
//import pageObjects.wowRegistrationPage;
//import automationFramework.pageBase;
import automationFramework.stepBase;


public class stepDef_wowLoginPage extends stepBase{
	public wowLoginPage pgLogin;
	

	
	
	
	public stepDef_wowLoginPage() {
		//wowLoginPage pgLogin = new wowLoginPage(driver);
		pgLogin = new wowLoginPage(driver); 
	}
	
	// *********************************** LOGIN PAGE  ACTIONS **********************************************
	
		//ALREADY IMPLEMENTED : Then User presented with WOW home page having title "Login"
		
			@Then("^User Enter email \"([^\"]*)\"$")
			public void user_Enter_email(String pEmailID) throws Throwable {
				pgLogin.getEmail().clear();
				pgLogin.getEmail().sendKeys(pEmailID);
			}

			@Then("^User Enter password \"([^\"]*)\"$")
			public void user_Enter_password(String pPassword) throws Throwable {
				pgLogin.getPassword().clear();
				pgLogin.getPassword().sendKeys(pPassword);
			}

			@Then("^User press login button$")
			public void user_press_login_button() throws Throwable {
				//take screenshot before submit
				saveScreenShotInFolder();			
				pgLogin.getLoginButton().click();
			}
			
	

}
