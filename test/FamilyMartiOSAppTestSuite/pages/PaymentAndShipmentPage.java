package FamilyMartiOSAppTestSuite.pages;

import java.util.HashMap;
import java.util.Map;
import org.openqa.selenium.By;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;

public class PaymentAndShipmentPage {
	
	public static Map<String, String> paymentAndShipmentPageElementHash() {
		Map<String, String> element = new HashMap<String, String>();
		element.put("payAtStoreOptionID", "超商取貨付款");
		element.put("shipToFamilyMartOptionXpath", "//*[1]//*[2]//*[1]//*[1]//*[2]//*[1]//*[1]//*[2]//*[7]");
		element.put("nextButtonID", "下一步");
		return element;
	}
	
	public static void selectPayAtStore(IOSDriver<MobileElement> driver) throws InterruptedException {
		Map<String, String> element = paymentAndShipmentPageElementHash();
		driver.findElement(By.id(element.get("payAtStoreOptionID"))).click();
		Thread.sleep(2000);
	}
	
	public static void selectShipToFamilyMart(IOSDriver<MobileElement> driver) throws InterruptedException {
		Map<String, String> element = paymentAndShipmentPageElementHash();
		driver.findElement(By.xpath(element.get("shipToFamilyMartOptionXpath"))).click();
		Thread.sleep(2000);
	}
	
	public static void goToPaymentInfoPage(IOSDriver<MobileElement> driver) throws InterruptedException {
		Map<String, String> element = paymentAndShipmentPageElementHash();
		driver.findElement(By.id(element.get("nextButtonID"))).click();
		Thread.sleep(2000);
	}

}
