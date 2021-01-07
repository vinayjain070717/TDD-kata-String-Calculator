import org.junit.Test;
import static org.junit.Assert.assertEquals;
import com.vinay.calculator.*;
public class CalculatorTestCasesUnit
{
	@Test
	public void TestWithEmptyNumberInString()
	{
		assertEquals(0,new StringCalculator().Add(""));
	}

	@Test
	public void TestWithOneNumberInString()
	{
		assertEquals(5,new StringCalculator().Add("5"));
	}

	@Test
	public void TestWithTwoNumberInString()
	{
		assertEquals(25,new StringCalculator().Add("15,10"));
	}

	@Test
	public void TestWithMultipleNumberInString()
	{
		assertEquals(116,new StringCalculator().Add("15,10,25,10,56"));
	}

}