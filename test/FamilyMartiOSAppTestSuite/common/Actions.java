package FamilyMartiOSAppTestSuite.common;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;

public class Actions {
	
	public static void swipeToUp(IOSDriver<MobileElement> driver,int duration, int step) throws InterruptedException {  
	    int width = driver.manage().window().getSize().width;  
	    int height = driver.manage().window().getSize().height;  
	    for (int i = 0; i < step; i++) {  
	        driver.swipe(width / 2, height * 3 / 4, width / 2, height / 4, duration);  
	    }  
	}
	
	public static String takeScreenShot(IOSDriver<MobileElement> driver) {  
	    Date systemTime = new Date();
	    SimpleDateFormat systemTimeFormat = new SimpleDateFormat("yyyMMdd_HH-mm-ss");
	    String time = systemTimeFormat.format(systemTime);
	    String fileDir = "/Users/River_Lin/Documents/workspace/testreport/ScreenShot/" + time + ".jpeg";
		
	    try {
	    	File scrfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    	
	    	FileUtils.copyFile(scrfile, new File(fileDir));
	    	
	    }
	    
	    catch(Exception e) {
	    	System.out.println("screen shot error:" + e.getMessage());
	    }
		
		return fileDir;
	}

}
