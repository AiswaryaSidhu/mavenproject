package suiteExe2;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class c3 {
	
	@Test(groups="A")
	public void t3() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aiswarya.hngopal\\Desktop\\Aishu\\Qtree\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver ob=new ChromeDriver();
		ob.get("https://www.facebook.com");
		Set<Cookie> c=ob.manage().getCookies();
		System.out.println("Num of cookies "+ c.size());
		ob.manage().deleteAllCookies();
		Set<Cookie> c1=ob.manage().getCookies();
		System.out.println("Num of cookies after deletion "+ c1.size());
		Thread.sleep(2000);
		ob.quit();
	}

}
