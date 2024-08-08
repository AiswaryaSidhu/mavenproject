package suiteExe1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class c1 {
	/*test suite execution
	* test suite means collection of test cases that are grouped for execution purpose.
	* run as whole project
	* create more than 1 packages and classes with same and different groups
	* right click on project->testng->convert to testng->no changes->finish(testng.xml file will be available)
	* right click on testng.xml file->openwith->text editor.
	* after <suite>
	* <groups>
	* <run>
	* <include name="group name you want to run">  </include>
	* <exclude name="group name you don't want to run>  </exclude>
	* </run>
	* </groups>
	*/
	@Test(groups="A")
	public void t1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aiswarya.hngopal\\Desktop\\Aishu\\Qtree\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver ob=new ChromeDriver();
		ob.get("https://www.google.com");
		Actions ac=new Actions(ob);
		WebElement ele = ob.findElementByName("q");
		ac.click(ele).sendKeys("Selenium").sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		ob.quit();
	}

	
}
