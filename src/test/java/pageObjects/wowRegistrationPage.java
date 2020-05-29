package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class wowRegistrationPage {
	public WebDriver ldriver;

	public wowRegistrationPage(WebDriver driver) {
		this.ldriver = driver;
	} //end constructor
	
	By userName = By.name("reg_username");
	public WebElement getUserName() {
		return ldriver.findElement(userName);
	}
	
	By email = By.name("reg_email");
	public WebElement getEmail() {
		return ldriver.findElement(email);
	}
	
	By termsCheckBox = By.name("terms_cond_checkbox");
	public WebElement getTermsAndConditionCheckBox() {
		return ldriver.findElement(termsCheckBox);
	}
	
	By sendActivationCodeButton = By.name("submit");
	public WebElement getSendActivationCodeButton() {
		return ldriver.findElement(sendActivationCodeButton);
	}
	
	By pageBody = By.tagName("body");
	public WebElement getBodyText() {
		return ldriver.findElement(pageBody);
	}
	

}// end class wowRegistrationPage
