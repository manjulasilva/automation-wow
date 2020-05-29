package stepDefinitions;

import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class screenshotManager {

	public screenshotManager() {
		// TODO Auto-generated constructor stub
	}// end constructor screenshotManager
	
	public void takeSnapShot(WebDriver webdriver, String fileWithPath) throws Exception{
        //Convert web driver object to TakeScreenshot
        TakesScreenshot scrShot =((TakesScreenshot)webdriver);

        //Call getScreenshotAs method to create image file
        File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

        //Move image file to new destination
        File DestFile=new File(fileWithPath);

        //Copy file at destination
        //FileUtils.copyFile(SrcFile, DestFile);
        FileHandler.copy(SrcFile, DestFile);
        
        // sleep 500 ms
        Thread.sleep(500);
    }

	
	public String getNewImgeFileName(String imgPath) {
		// to dynamically generate a unique file name for screenshot like: 
		// C:\01_work\TER\TER_Java\screenShot\TER_0130_07-13-56.jpg
		  
		LocalDateTime myDateObj = LocalDateTime.now();
		    
		//DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("yyyy-MM-dd HH-mm-ss");
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("MMdd_HH-mm-ss");
		String formattedDate = myDateObj.format(myFormatObj);
		    
		String fileName;
		    
		fileName = imgPath + "TER_"  + formattedDate + ".jpg";
		return fileName;
	}
}// end class screenshotManager
