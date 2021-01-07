package com.vinay.utility;
import com.vinay.exception.*;

public class CalculationUtility
{
	StringBuilder sb;
	public int toInt(String str)
	{
		return Integer.parseInt(str);
	}
	public void checkForNegativeNumbers(String[] numbers)
	{
		sb=new StringBuilder();
		for(int i=0;i<numbers.length;i++)
		{
			if(toInt(numbers[i])<0)
			{
				sb.append(numbers[i]+" ");
			}
		}
		if(sb.toString().length()>0) throw new NegativeNumberException("Negatives not allowed : "+sb.toString().trim());
	}
	public int sumOfString(String[] numbers)
	{
		int sum=0;
		checkForNegativeNumbers(numbers);
		for(int i=0;i<numbers.length;i++)
		{
			int num=toInt(numbers[i]); 
			if(num>1000) continue;
			sum=sum+num;
		}
		return sum;
	}
}
