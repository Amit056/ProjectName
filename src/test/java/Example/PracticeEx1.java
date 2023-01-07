package Example;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PracticeEx1 {
	@Test
	public void example1()
	{
		int a=10;
		int b=30;
		System.out.println(a+b+"new project");
	Reporter.log("pass", false);
	Reporter.log("pass", a+b, false);
	System.out.println("amit kumar ray");
	}
}
