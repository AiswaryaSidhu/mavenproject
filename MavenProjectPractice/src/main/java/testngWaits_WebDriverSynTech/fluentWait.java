package testngWaits_WebDriverSynTech;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.Test;

public class fluentWait {
	
	/*it is a kind of explicit wait
	 * In explicit wait if we give 10 seconds time it will take as 1 cycle only
	 * but here in fluent wait if we give 6seconds wait so 3 cycles each 2seconds 
	 * If will check if the condition is in 1st cycle if yes it will not go to next two cycle
	 * If no it will go to next cycle 
	 * We will be checking frequently
	 * Fluent wait in selenium marks the maximum amount of time in selenium web driver
	 * To wait for a certain condition (web element) becomes visible
	 * It also defines how frequently webdriver will check if the condition appears before throwing the exception
	 * create an object for the FluentWait and pass the driver instance
	 */
	@Test
	public void tc1() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aiswarya.hngopal\\Desktop\\Aishu\\Qtree\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		FluentWait f=new FluentWait(driver);
		//specify time out of the weight
		f.withTimeout(6000,TimeUnit.MILLISECONDS);
		//specify pooling time
		f.withTimeout(6000,TimeUnit.MILLISECONDS);
		f.until(ExpectedConditions.alertIsPresent());
		driver.quit();
	}

}
