package FamilyMartiOSAppTestSuite.pages;

import java.util.HashMap;
import java.util.Map;
import org.openqa.selenium.By;
import FamilyMartiOSAppTestSuite.common.Actions;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;

public class HomeHotSalePage {
	
	public static Map<String, String> hotSalePageElementHash() {
		Map<String, String> element = new HashMap<String, String>();
		element.put("Top1SaleItemXpath", "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView[1]/XCUIElementTypeCell[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeCollectionView[1]/XCUIElementTypeCell[4]/XCUIElementTypeOther[1]/XCUIElementTypeImage[1]");
		element.put("homeButtonID", "首頁");
		element.put("favouriteButtonID", "我的收藏");
		
		return element;
	}
	
	public static void goToTop1SalePage(IOSDriver<MobileElement> driver) throws InterruptedException {
		Map<String, String> element = hotSalePageElementHash();
		
		//跳過限時搶購商品
		driver.findElement(By.id(element.get("favouriteButtonID"))).click();
		driver.findElement(By.id(element.get("homeButtonID"))).click();
		Actions.swipeToUp(driver, 1, 3);
		Thread.sleep(2000);
				
		driver.findElement(By.xpath(element.get("Top1SaleItemXpath"))).click();
		Thread.sleep(2000);
	}

}
