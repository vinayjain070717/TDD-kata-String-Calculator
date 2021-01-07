package com.vinay.calculator;
public class Utility
{
	public int toInt(String str)
	{
		return Integer.parseInt(str);
	}
	public int sumOfString(String[] numbers) throws NegativeNumberException
	{
		int sum=0;
		for(int i=0;i<numbers.length;i++)
		{
			int num=toInt(numbers[i]); 
			if(num<0) throw new NegativeNumberException("negatives not allowed : "+num);
			sum=sum+num;
		}
		return sum;
	}
}
