package testngAssertion;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softAssert {
	@Test
	public void tc1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aiswarya.hngopal\\Desktop\\Aishu\\Qtree\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		SoftAssert s=new SoftAssert();
		s.assertEquals(driver.getTitle(), "google");
		s.assertNotEquals(driver.getTitle(), "google");
		WebElement ele = driver.findElementByLinkText("Images");
		driver.findElementById("APjFqb").sendKeys("HAra");
		Thread.sleep(2000);
		s.assertTrue(ele.isDisplayed());
		s.assertFalse(ele.isSelected());
		driver.quit();
		//s.assertAll();
	}

}
