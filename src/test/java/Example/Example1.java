package Example;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Example1 {
	@Test
	public void example1()
	{
		//
		int a=10;
		int b=30;
		System.out.println(a+b+"new project");
	Reporter.log("pass", false);
	Reporter.log("pass", a+b, false);
	}
}
