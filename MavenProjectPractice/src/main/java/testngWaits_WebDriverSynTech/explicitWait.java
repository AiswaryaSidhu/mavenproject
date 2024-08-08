package testngWaits_WebDriverSynTech;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class explicitWait {
	/*conditional wait - explicit wait
	 * create an object for the web driver waits
	 * pass the driver instance and time limit
	 * call until method
	 * call condition
	*/
	@Test
	public void tc1() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aiswarya.hngopal\\Desktop\\Aishu\\Qtree\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		WebDriverWait w=new WebDriverWait(driver, 3);
		//title
		//w.until(ExpectedConditions.titleIs("Google"));
		//w.until(ExpectedConditions.titleContains("op"));
		//alert
		//w.until(ExpectedConditions.alertIsPresent());
		//visiblity of element
		w.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("gmail")));
		//visiblity of elements
		//w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.tagName("img")));
		//element id clickable
		//w.until(ExpectedConditions.elementToBeClickable(By.linkText("Images")));
		driver.quit();
	}
}
