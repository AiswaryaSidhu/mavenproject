package basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class mavenstart {

	public static void main(String[] args) {
		//maven - is a project management tool, it is a framework
		//maven - don't want to download any jar files
		//Just download from online 
		//add dependencies in pom.xml file
		//copy "selenium-jave - version 3.141" from mvnrepository website and paste it in pom.xml after <version>
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aiswarya.hngopal\\Desktop\\Aishu\\Qtree\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://google.com");

		
		/*Maven simplies the code handling and the process of building the project
		 * Most of the projects follow maven structure
		 * You have to add maven dependencies from mvn repository 
		 * If any of the dependencies are not available, then we have to add repository path in pom.xml explicitly
		 * There are many other tools are available but maven is the best while dealing with versions and dependencies
		 * Other tools many not provide such flexibility than maven 
		 */
	}

}
