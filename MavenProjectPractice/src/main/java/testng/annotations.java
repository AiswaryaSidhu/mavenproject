package testng;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class annotations {
	
	/*Before Test - run only once before all the test cases starts the execution
	 * After Test - run Only once after all the test cases completed the execution	
	 * Before Class - run once after before method
	 * After Class - run once before after method
	 * Before Method - run before each test case 
	 * After Method - run after each test case
	 * 
	 * Before Test
	 * 		Before Class
	 * 				Before Method TC1 After Method
	 * 		After Class
	 * After Test
	 * 
	 * Before Test: Visit
	 * 		Before Class: maximize
	 * 				Before Method:refresh	TC1:login-send keys		After Method:delete cookies
	 * 				Before Method:refresh	Tc2:login-chick			After Method:delete cookies
	 * 		After Class:gettile
	 * After Test:closing
	 * 
	 */
	ChromeDriver driver;
	@BeforeTest
	public void visit() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aiswarya.hngopal\\Desktop\\Aishu\\Qtree\\chromedriver-win64\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.mycontactform.com/");
	}
	@AfterTest
	public void quit() {
		driver.quit();
	}
	@BeforeClass
	public void max() {
		driver.manage().window().maximize();
	}
	@AfterClass
	public void title() {
		driver.getTitle();
	}
	@BeforeMethod
	public void ref() {
		driver.navigate().refresh();
	}
	@AfterMethod
	public void cookies() {
		driver.manage().deleteAllCookies();
	}
	@Test
	public void login() throws InterruptedException {
		driver.findElementById("user").sendKeys("Aishu");
		Thread.sleep(2000);
		driver.findElementById("pass").sendKeys("teye@111");
		driver.findElementByName("btnSubmit").click();
	}
	}
