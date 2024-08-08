package testng;

import org.testng.annotations.Test;

public class testngBasics {
	
	/*TestNG-Test Next Generation
	 * Download testng form eclipse->help->eclipse marketplace->testng->download
	 * add sl4j and testng dependencies in pom.xml 
	 * 1 package and 1 class without main method, non static should use @Test annotation-default(alphabetical) order while executing
	 * Testng is an automation testing framework for jave, It helps in automating tests for software application.
	 *  It is inspired by junit and nunit but provides more features than it.
	 *  It allows you to write and organize testcases, execute them efficiently and generate detailed test reports. 
	 * Testng supports various testing scenarious like unit testing, integration testing,and end to end testing.
	 * Features of testng
	 * 				Before and After annotation
	 * 				Dependent methods
	 * 				groups
	 * 				dependent groups
	 * 				parameterizarion of test methods
	 * 				better reporting
	 * 				data driven testing
	 * 				multithreaded execution
	 * 				XML based test configuration
	 * 				open API  
	 */
	
	//defalult order
	@Test
	public void tc1() {
		System.out.println("testcase 1");
	}
	@Test
	public void tc2() {
		System.out.println("testcase 2");
	}
	@Test
	public void ab() {
		System.out.println("test case 3");
	}

}
