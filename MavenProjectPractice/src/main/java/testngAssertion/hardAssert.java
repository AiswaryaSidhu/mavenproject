package testngAssertion;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class hardAssert {
	ChromeDriver driver;
	@Test
	public void tc1() throws InterruptedException {
		/*assertion - technique where we will be obtaining the actual result and obtained result
		 * Hard assert:
		 * 		provided by assert built in classes
		 * 		static in nature
		 * 		If assertion fails then the execution will stop there itself
		 * Soft assert
		 * 		provided by soft assert built in classes
		 * 		Have to create an object fpr asser
		 * 		even if the assertion fails it will continue further will not stop there itself
		 */
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aiswarya.hngopal\\Desktop\\Aishu\\Qtree\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		Assert.assertEquals(driver.getTitle(), "Google");
		Assert.assertNotEquals(driver.getTitle(), "google");
		driver.findElementById("APjFqb").sendKeys("Hara Name meaning");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.navigate().refresh();
		driver.quit();
	}

}
