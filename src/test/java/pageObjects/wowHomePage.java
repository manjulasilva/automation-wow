package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class wowHomePage {	
	public WebDriver driver;

	public wowHomePage(WebDriver driver) {
		this.driver = driver;
	}	
	
	
	By goLessonBtn = By.xpath("/html/body/doctype/table/tbody/tr[1]/td/a/img");
	public WebElement getGoToLessonsButton(){
		return driver.findElement(goLessonBtn);
	}
	
	By createNewAcctBtn = By.xpath("/html/body/doctype/table/tbody/tr[2]/td/a/img");
	public WebElement getCreateNewAccountButton() {
		return driver.findElement(createNewAcctBtn);
	}


}
