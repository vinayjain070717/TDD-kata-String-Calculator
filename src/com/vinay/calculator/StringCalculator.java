package com.vinay.calculator;
import com.vinay.utility.*;
public class StringCalculator
{
	public CalculationUtility calculationUtility;
	public ParserUtility parserUtility;
	public String delimiter;
	public String[] strs;
	public StringCalculator()
	{
		calculationUtility=new CalculationUtility();
		parserUtility=new ParserUtility();
		delimiter=",|\n"; // default delimeter
	}
	public int Add(String numberString) 
	{
		numberString=numberString.trim();
		if(numberString.length()==0) return 0;
		else if(numberString.startsWith("//"))
		{
			return calculationUtility.sumOfString(parserUtility.parseString(numberString));
		}
		else if(numberString.indexOf(",")==-1)
		{
			//one number
			return calculationUtility.toInt(numberString);
		}
		else
		{
			//more than one number
			strs=numberString.split(delimiter);
			return calculationUtility.sumOfString(strs);
		}

	}
}