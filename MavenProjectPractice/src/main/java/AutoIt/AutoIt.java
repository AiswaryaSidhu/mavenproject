package AutoIt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class AutoIt {
		@Test
		public void autoIt() throws InterruptedException {
			System.setProperty("webdriver.driver.chrome", "C:\\Users\\aiswarya.hngopal\\Desktop\\Aishu\\Qtree\\chromedriver-win64\\chromedriver.exe");
			ChromeDriver driver=new ChromeDriver();
			driver.get("http://softwaretestingplace.blogspot.com/2015/10/sample-web-page-to-test.html");
			driver.manage().window().maximize();
			driver.executeScript("window.scrollBy(0,1200)");
			Thread.sleep(2000);
			WebElement ele = driver.findElement(By.xpath("//input[@type='file']"));
			Actions ac=new Actions(driver);
			ac.moveToElement(ele).click().build().perform();
			Thread.sleep(2000);
			//Runtime.getRuntime().exec("path of the.exe file in the desktop");
			
			/* AutoIt is a software to automate window GUI
			 * support only window os not linus/mac
			 * selenium web based application like that autoit window based application
			 * It is not platform independent
			 * AutoIt is a combination of simulated keystrokes, mouse movement and window/control manipulation to automate task which is not possible in selenium
			 * autiIt will be helpful to handle non browser interaction
			 * File upload is the best example for autoid
			 * We have to download AutoIt and AutoIt script editor from www.autoItscript.com
			 * Install Au3Info.exe (file editor) and open
			 * open scite.exe editor tool
			 * Launch the application and click on choose file button and open the file dialogue box
			 * In the finder tool drag the finder toola nd drop on the file dialogue "File name" text box  
			 * In selenium we use locator to identify elements here we use controlid 
			 * class and instance together is a control id
			 *  Here we use 3
			 *  ControlFocus-To focus on the element
			 *  ControlSetText- to set the text value
			 *  ControlClick- to click on the object
			 *  In editor tool write the following code
			 *  ControlFocus("Open","","CLick1")
			 *  ControlSetText("Open","","Click1")
			 *  ControlClick("Open","","Button1")
			 *  save as->save(it will save as .aw3 format)
			 *  To check if the code is correct or not, tools->test run->the file will be attached in the website
			 *  To attach the selenium code first we have to convert the .aw3 file to .exe file.
			 *  To do that we have to right click the file->show more options->Compile script(x64). Now the file converted to .exe
			 *  Copy the .exe file path
			 *  In the selenium script write the below code
			 *  RunTime.getrunTime().exce("Path of the.exe file") //TO connect the executable file with selenium this runtime() is used
			 *  Not run the script, the file will be automatically uploaded to the website.
			 */
			
		}
}
