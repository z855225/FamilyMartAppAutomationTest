package FamilyMartiOSAppTestSuite.pages;

import java.util.HashMap;
import java.util.Map;
import org.openqa.selenium.By;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;

public class FamilyMartStorePage {
	
	public static Map<String, String> familyMartStorePageElementHash() {
		Map<String, String> element = new HashMap<String, String>();
		element.put("selectStoreByStreetButtonID", "街道查詢");
		element.put("taipeiCityButtonID", "台北市");
		element.put("songshanDistButtonID", "松山區");
		element.put("sec4BadeRdButtonID", "八德路四段");
		element.put("no40ButtonID", "全家復盛店");
		element.put("storeConfirmButtonID", "確定店鋪");
		return element;
	}
	
	public static void selectStoreByStreet(IOSDriver<MobileElement> driver) throws InterruptedException {
		Map<String, String> element = familyMartStorePageElementHash();
		driver.findElement(By.id(element.get("selectStoreByStreetButtonID"))).click();
		Thread.sleep(2000);
		driver.findElement(By.id(element.get("taipeiCityButtonID"))).click();
		Thread.sleep(2000);
		driver.findElement(By.id(element.get("songshanDistButtonID"))).click();
		Thread.sleep(2000);
		driver.findElement(By.id(element.get("sec4BadeRdButtonID"))).click();
		Thread.sleep(2000);
		driver.findElement(By.id(element.get("no40ButtonID"))).click();
		Thread.sleep(3000);
		driver.findElement(By.id(element.get("storeConfirmButtonID"))).click();
		Thread.sleep(3000);

	}

}
