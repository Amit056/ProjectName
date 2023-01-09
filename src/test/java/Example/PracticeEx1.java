package Example;

import org.testng.Reporter;
import org.testng.annotations.Test;


//Amit ray 1122


public class PracticeEx1 {
	@Test
	public void example1()
	{
		int a=10;
		int b=30;
		System.out.println(a+b+"new project");
	Reporter.log("pass", false);
	Reporter.log("pass", a+b, false);
	}
}
