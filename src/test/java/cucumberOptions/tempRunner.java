package cucumberOptions;

import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;

import automationFramework.pageBase;
import pageObjects.wowHomePage;

public class tempRunner {
	
	public static WebDriver driver;
	public static Properties prop;
	public static wowHomePage pgHome;

	public static void main(String[] args) throws IOException {
		driver = pageBase.getDriver();
		prop = pageBase.getConfig();		
		pgHome = new wowHomePage(driver);
		pgHome.driver.get("http://localhost/wow/index.php");
		//pgHome.getGoToLessonsButton().click();
		pgHome.getCreateNewAccountButton().click();
		System.out.println("run complete");
	}

}
