package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testngAttributes_login {
	ChromeDriver driver;
	@Test(priority=0,description="Visiting",groups="login")
	public void visit() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aiswarya.hngopal\\Desktop\\Aishu\\Qtree\\chromedriver-win64\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.mycontactform.com/");
	}
	@Test(priority=1,description="Maximizing",groups="login")
	public void max() {
		driver.manage().window().maximize();
	}
	@Test(priority=2,description="Refreshing",timeOut=3000)
	public void ref() {
		driver.navigate().refresh();
	}
	@Test(priority=3,description="User name",groups="login")
	public void user() {
		driver.findElement((By.id("user"))).sendKeys("Aiswarya");
	}
	@Test(priority=4,description="Password",groups="login")
	public void pass() {
		driver.findElementById("pass").sendKeys("Sidhu@123");
	}
	@Test(priority=5,description="logging in",dependsOnGroups="login")
	public void login() {
		driver.findElementByClassName("btn_log").click();
	}
	@Test(priority=6,description="quitting",dependsOnMethods="login")
	public void quit() {
		driver.quit();
	}

}
