package FamilyMartiOSAppTestSuite.pages;

import java.util.HashMap;
import java.util.Map;
import org.openqa.selenium.By;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;

public class ShoppingCartConfirmPage {
	
	public static Map<String, String> shoppingCartConfirmPageElementHash() {
		Map<String, String> element = new HashMap<String, String>();
		element.put("nextButtonID", "下一步");
		return element;
	}
	
	public static void goToPaymentAndShipmentPage(IOSDriver<MobileElement> driver) throws InterruptedException {
		Map<String, String> element = shoppingCartConfirmPageElementHash();
		driver.findElement(By.id(element.get("nextButtonID"))).click();
		Thread.sleep(2000);
	}

}
