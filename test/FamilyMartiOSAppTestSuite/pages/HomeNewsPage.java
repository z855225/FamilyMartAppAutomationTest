package FamilyMartiOSAppTestSuite.pages;

import java.util.HashMap;
import java.util.Map;
import org.openqa.selenium.By;

import FamilyMartiOSAppTestSuite.common.Actions;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;

public class HomeNewsPage {

	public static Map<String, String> homePageElementHash() {
		Map<String, String> element = new HashMap<String, String>();
		element.put("notificationDontAllowButtonID", "Don’t Allow");
		element.put("skipGetCouponButtonID", "先逛逛");
		element.put("hotSaleTabID", "viewPagerSecondTab");
		
		return element;
	}
	
	public static void skipNotification(IOSDriver<MobileElement> driver) throws InterruptedException {
		Map<String, String> element = homePageElementHash();
		driver.findElement(By.id(element.get("notificationDontAllowButtonID"))).click();
		driver.findElement(By.id(element.get("skipGetCouponButtonID"))).click();
	}
	
	public static void goToHomeHotSalePage(IOSDriver<MobileElement> driver) throws InterruptedException {
		Map<String, String> element = homePageElementHash();
		Actions.swipeToUp(driver, 1, 1);
		driver.findElement(By.id(element.get("hotSaleTabID"))).click();
		Thread.sleep(2000);
	}

}
