package StepDefinitions;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login {
	ChromeDriver driver;
	@Given("User is on login page")
	public void user_is_on_login_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aiswarya.hngopal\\Desktop\\Aishu\\Qtree\\chromedriver-win64\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.mycontactform.com/");
	}

	@When("Give the username and password")
	public void give_the_username_and_password() {
		driver.findElementById("user").sendKeys("shshshs");
		driver.findElementById("pass").sendKeys("egeh223");
	}
	
	@And("Click on login button")
	public void click_on_login_button() {
		driver.findElementByXPath("//*[@id=\"right_col_top\"]/form/div/input").click();
	}

	@Then("Land on home page")
	public void land_on_home_page() {
		driver.quit();
	}


}
