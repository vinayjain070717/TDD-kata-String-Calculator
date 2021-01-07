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

	@Test
	public void TestWithNewLineCharacterInString()
	{
		assertEquals(30,new StringCalculator().Add("15,10\n5"));
	}

	@Test
	public void TestWithDifferentDelimiter1()
	{
		assertEquals(50,new StringCalculator().Add("//;\n17;18;15"));
	}

	@Test
	public void TestWithDifferentDelimiter2()
	{
		assertEquals(4,new StringCalculator().Add("//#\n1#2#1"));
	}

	@Test(expected=NegativeNumberException.class)
	public void TestWithNegativeNumberInString()
	{
		assertEquals(4,new StringCalculator().Add("2,-1,3,4"));
	}
	
}