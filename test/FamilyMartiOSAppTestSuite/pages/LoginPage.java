package FamilyMartiOSAppTestSuite.pages;

import java.util.HashMap;
import java.util.Map;
import org.openqa.selenium.By;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;

public class LoginPage {
	
	public static Map<String, String> loginPageElementHash() {
		Map<String, String> element = new HashMap<String, String>();
		element.put("accountFieldXpath", "//*[1]//*[2]//*[1]//*[1]//*[2]//*[1]//*[1]//*[1]//*[2]//*[1]//*[1]//*[1]");
		element.put("loginOrSignUpButtonID", "登入/註冊");
		element.put("passwordFieldXpath", "//*[1]//*[2]//*[1]//*[1]//*[2]//*[1]//*[1]//*[1]//*[2]//*[1]//*[1]//*[1]");
		element.put("loginButtonID", "登入");
		return element;
	}
	
	public static void login(IOSDriver<MobileElement> driver, String account, String password) throws InterruptedException {
		Map<String, String> element = loginPageElementHash();
		driver.findElement(By.xpath(element.get("accountFieldXpath"))).sendKeys(account);
		driver.findElement(By.id(element.get("loginOrSignUpButtonID"))).click();
		driver.findElement(By.xpath(element.get("passwordFieldXpath"))).sendKeys(password);
		driver.findElement(By.id(element.get("loginButtonID"))).click();
		Thread.sleep(2000);
	}

}
