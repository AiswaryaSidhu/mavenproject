package testngWaits_WebDriverSynTech;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class implicitWait {
	
	/*testng waits/webdriver synchronization technique
	 * two types of waits
	 * conditional waits - explicit wait
	 * unconditional waits - implicit wait
	 * Implicit wait - Once it is declared all the code present after this, will take the time limit 
	 * If the code is correct- It will execute within the time limit, it will proceed further, it will not wait for the completion of the time limit
	 * If the code is wrong - It will wait till the completion of the time limit and throw the error
	*/
	@Test
	public void tc1() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\aiswarya.hngopal\\Desktop\\Aishu\\Qtree\\chromedriver-win64\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.google.com");
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	driver.getCurrentUrl();//3s
	driver.getTitle();//3s
	driver.findElementByLinkText("Img").click();//3s
	driver.quit();
	}
}
