package FamilyMartiOSAppTestSuite.pages;

import java.util.HashMap;
import java.util.Map;
import org.openqa.selenium.By;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;

public class PaymentInfoPage {
	
	public static Map<String, String> paymentInfoPageElementHash() {
		Map<String, String> element = new HashMap<String, String>();
		element.put("nameFieldXpath", "//*[1]//*[2]//*[1]//*[1]//*[2]//*[1]//*[1]//*[2]//*[1]//*[1]//*[1]//*[1]//*[6]//*[2]");
		element.put("phoneNumberFieldXpath", "//*[1]//*[2]//*[1]//*[1]//*[2]//*[1]//*[1]//*[2]//*[1]//*[1]//*[1]//*[1]//*[7]//*[2]");
		element.put("selectStoreButtonXpath", "//*[1]//*[2]//*[1]//*[1]//*[2]//*[1]//*[1]//*[2]//*[1]//*[1]//*[1]//*[1]//*[8]");
		element.put("emailFieldXpath", "//*[1]//*[2]//*[1]//*[1]//*[2]//*[1]//*[1]//*[2]//*[1]//*[1]//*[1]//*[1]//*[13]//*[1]");
		return element;
	}
	
	public static void enterName(IOSDriver<MobileElement> driver, String name) throws InterruptedException {
		Map<String, String> element = paymentInfoPageElementHash();
		driver.findElement(By.xpath(element.get("nameFieldXpath"))).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath(element.get("nameFieldXpath"))).sendKeys(name);
		Thread.sleep(2000);
	}
	
	public static void enterPhoneNumber(IOSDriver<MobileElement> driver, String phoneNumber) throws InterruptedException {
		Map<String, String> element = paymentInfoPageElementHash();
		driver.findElement(By.xpath(element.get("phoneNumberFieldXpath"))).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath(element.get("phoneNumberFieldXpath"))).sendKeys(phoneNumber);
		Thread.sleep(2000);
	}
	
	public static void selectStore(IOSDriver<MobileElement> driver) throws InterruptedException {
		Map<String, String> element = paymentInfoPageElementHash();
		driver.findElement(By.xpath(element.get("selectStoreButtonXpath"))).click();
		Thread.sleep(2000);
	}
	
	public static void enterEmail(IOSDriver<MobileElement> driver, String email) throws InterruptedException {
		Map<String, String> element = paymentInfoPageElementHash();
		driver.findElement(By.xpath(element.get("emailFieldXpath"))).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath(element.get("emailFieldXpath"))).sendKeys(email);
		Thread.sleep(2000);
	}

}
