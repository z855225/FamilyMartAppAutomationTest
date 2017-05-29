package FamilyMartiOSAppTestSuite.pages;

import java.util.HashMap;
import java.util.Map;
import org.openqa.selenium.By;

import FamilyMartiOSAppTestSuite.common.Actions;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;

public class SalePage {
	
	public static Map<String, String> salePageElementHash() {
		Map<String, String> element = new HashMap<String, String>();
		element.put("immediatelyBuyButtonID", "立即結帳");
		return element;
	}
	
	public static void immediatelyBuy(IOSDriver<MobileElement> driver) throws InterruptedException {
		Map<String, String> element = salePageElementHash();
		Actions.swipeToUp(driver, 1, 1);
		driver.findElement(By.id(element.get("immediatelyBuyButtonID"))).click();
	}

}
