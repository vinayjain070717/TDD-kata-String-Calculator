import org.junit.runner.*;
import org.junit.runner.notification.*;
public class CalculatorTestCasesRunner
{
	public static void main(String gg[])
	{
		Result result=JUnitCore.runClasses(CalculatorTestCasesUnit.class);
		for(Failure failure:result.getFailures())
		{
			System.out.println(failure.toString());
		}
		if(result.wasSuccessful()) System.out.println("All Test Cases Passed");
		else System.out.println("Test Cases Failed");
	}
}