package suiteExe1;


import java.io.IOException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class c2 {
	
	@Test(groups="B")
	public void t2() throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aiswarya.hngopal\\Desktop\\Aishu\\Qtree\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver ob=new ChromeDriver();
		ob.get("https://jqueryui.com/datepicker/");
		ob.switchTo().frame(0);
		ob.findElementById("datepicker").click();
		for(int i=0;i<2;i++) {
		ob.findElementByXPath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span").click();
		}
		ob.findElementByCssSelector("#ui-datepicker-div > table > tbody > tr:nth-child(1) > td:nth-child(6) > a").click();
		
	}

}
