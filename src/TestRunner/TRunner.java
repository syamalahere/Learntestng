package TestRunner;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;

public class TRunner {

	public static void main(String[] args) {
		
		TestNG runner = new TestNG();
		
      List<String> list = new ArrayList<String>();
      
      list.add("C:\\Users\\Owner\\workspace\\LearnTestNG\\test-output\\SmokeTestScenarios\\testng-failed.xml");
		
		runner.setTestSuites(list);
		runner.run();

	}

}
