package TestngLogging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class log {
	
	/*Log4j is a java based logging framework
	 *  simple, flexible, fast
	 *  recording for events
	 *  We can pass different types of messages like information, warning, critical, debug. 
	 *  can add extra informations like date, time, hour, minutes, seconds 
	 *  Also we can save as separate files
	 *  advance print statement is logging 
	 */
	//to connect class and log
	static Logger log= LogManager.getLogger(log.class);  //classname.class
	@Test(groups="one")
	public void l1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aiswarya.hngopal\\Desktop\\Aishu\\Qtree\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver ob=new ChromeDriver();
		//right click on src/.ain/resources->new->file->file name - log4j2.properties file
		//copy page the code
		//first 8 lines is used to generate logs in console 
		//remaining lines code is used to save as separate file
		//change the "appender.file.fileName - ${filename}/aiswarya.log
		//also have to change "logger.file.name" - TestngLogging    //package name 
		log.info("visiting google.com");
		ob.get("https://www.google.com");
		Actions ac=new Actions(ob);
		WebElement ele = ob.findElementByName("q");
		log.warn("finding the element");
		ac.click(ele).sendKeys("Selenium").sendKeys(Keys.ENTER).build().perform();
		log.info("searching as selenium using keyboard");
		Thread.sleep(2000);
		log.info("going to close");
		ob.quit();
	}
}
