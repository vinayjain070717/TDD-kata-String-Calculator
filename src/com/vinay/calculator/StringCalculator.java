package com.vinay.calculator;
public class StringCalculator
{
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
			String[] strs=numberString.split(",");
			return Integer.parseInt(strs[0])+Integer.parseInt(strs[1]);
		}

	}
}