package parameterization;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class p1 {
	@Parameters({"A","B"})//A-u, B-v
	@Test
	public void tc1(String u, String v) {
		//parameterization is the process of peratemerizing test scripts in order to pass numerious data into the application dureing run time
		//1 maven project, add selenium java, testng, sl4j dependencies, 1 package, 1 class, write one testcase
		//convert to testng then write code
		//without giving test data directly giving through testng.xml file
		//if values using frequently we can go there and change like username, password, 
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aiswarya.hngopal\\Desktop\\Aishu\\Qtree\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://mycontactform.com");
		driver.findElementById("user").sendKeys(u);
		driver.findElementById("pass").sendKeys(v);
		driver.findElementByXPath("//*[@id=\"right_col_top\"]/form/div/input").click();
		//in testng.xml file after <suite> tag add the<parameter> tag
	}

}
