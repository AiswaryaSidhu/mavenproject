package screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ss {
	
@Test
public void tc1() throws IOException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\aiswarya.hngopal\\Desktop\\Aishu\\Qtree\\chromedriver-win64\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://google.com");
	//screenshot
	//3 steps, 1. take ss, 2. save in file, 3. give file name
	File s=driver.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(s, new File("go1.png"));
	//refresh the project file will be available
}

}
