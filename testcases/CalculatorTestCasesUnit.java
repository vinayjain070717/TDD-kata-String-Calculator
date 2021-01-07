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

}