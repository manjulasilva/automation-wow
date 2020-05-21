package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class wowLoginPage {
	public WebDriver ldriver;	

	public wowLoginPage(WebDriver driver) {
		this.ldriver = driver;
	}
	
	By eMail = By.name("login_email");
	public WebElement getEmail() {
		return ldriver.findElement(eMail);
	}
	
	By password = By.name("login_password");
	public WebElement getPassword() {
		return ldriver.findElement(password);		
	}
	
	By loginButton = By.name("submit");
	public WebElement getLoginButton() {
		return ldriver.findElement(loginButton);
	}

}// end class wowLoginPage
