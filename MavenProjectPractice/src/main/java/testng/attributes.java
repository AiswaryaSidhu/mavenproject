package testng;

import org.testng.annotations.Test;

public class attributes {
	//attributes
	//priority attribute - To run test cases in a particular order
	//description - Add information about the text case
	//groups - To group testcases
	//invocationCount - To run same test case multiple times
	//enabled=false - TO disable/ignore particular test case
	//timeOut=to set time limit for particular test case
	//dependency attribute
	//1. dependsOnMethods - To build a connection between testcases
	//2. dependsOnGroups - To build connection between groups. all test cases under particular groups should be passed
	
	
	@Test(priority=0,description="TC1",groups="A", invocationCount=3)
	public void tc1() {
		System.out.println("Test case 1");
	}
	@Test(priority=1,description="TC2",groups="B", enabled=false)
	public void tc2() {
		System.out.println("Test case 2");
	}
	@Test(priority=2,description="TC3",groups="A", timeOut=2000)
	public void ab() {
		System.out.println("Test case 3");
	}
	@Test(priority=3)
	public void tc4() {
		System.out.println("Test case 4");
	}
	@Test(priority=4,dependsOnMethods="tc4")
	public void tc5() {
		System.out.println("Test case 5");
	}
	// tc4:pass		tc5"pass
	//tc4:fails		tc5:skipped
	@Test(priority=5,dependsOnGroups="A")
	public void tc6() {
		System.out.println("Test case 6");
	}
	//groups: A all pass		tc6:pass
	//groups: A any 1 fails		tc6:skipped
	
}
