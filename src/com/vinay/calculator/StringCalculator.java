package com.vinay.calculator;

class Utility
{
	public int toInt(String str)
	{
		return Integer.parseInt(str);
	}
	public int sumOfString(String[] numbers)
	{
		int sum=0;
		for(int i=0;i<numbers.length;i++) sum=sum+toInt(numbers[i]);
		return sum;
	}
}
public class StringCalculator
{
	public Utility utility;
	public StringCalculator()
	{
		utility=new Utility();
	}
	public int Add(String numberString)
	{
		numberString=numberString.trim();
		if(numberString.length()==0) return 0;
		else if(numberString.indexOf(",")==-1)
		{
			//one number
			return Integer.parseInt(numberString);
		}
		else
		{
			//more than one number
			String[] strs=numberString.split(",|\n");
			return utility.sumOfString(strs);
		}

	}
}