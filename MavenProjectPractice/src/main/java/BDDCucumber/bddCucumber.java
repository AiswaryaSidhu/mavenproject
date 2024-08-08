package BDDCucumber;

public class bddCucumber {
	
	/* BDD - Behavior driven Development framework enables the software testers to complete the test scripts in simple English
	 * BDD mainly focus on behavior of the product and user acceptance criteria.
	 * Cucumber is one of the best tool used to develop in BDD framework
	 * Add dependencies  cucumber java, JUnit. cucumber junit, selenium java
	 * Under src/test/resources have to create a folder named "Features" and under that folder create a file named "login.feature"
	 * Give the Feature, Scenario, Given, When, And, Then 
	 * rightclick->pretty format
	 * Run the feature file
	 * copy the step definition code
	 * under src/test/java create a folder named "StepDefinitions" and create a class named "login.java"
	 * paste the step definition code under the class, edit and paste the selenium codes
	 * run feature file again
	 * under "StepDefinitions" folder create a class name "TestRunner.java"
	 * Give the below code
	 * @RunWith(Cucumber.class)
	 * @cucumberOptions(features="src/test/resources/Features",glue={"StepDefinitions"},
	 * plugin={"pretty","html:target/cucumber-reports/report.html"},
	 * monochrome=true
	 * )
	 */

}
