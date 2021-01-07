package com.vinay.calculator;
import java.util.regex.*;

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
	public String delimiter;
	public String[] strs;
	public StringCalculator()
	{
		utility=new Utility();
		delimiter=",|\n"; // default delimeter
	}
	public int Add(String numberString)
	{
		numberString=numberString.trim();
		if(numberString.length()==0) return 0;
		else if(numberString.startsWith("//"))
		{
			String regex="//(.)\n(.*)";
			Pattern pattern=Pattern.compile(regex,Pattern.MULTILINE);
			Matcher matcher=pattern.matcher(numberString);
			if(matcher.find())
			{
				delimiter=matcher.group(1);
				String customStr=matcher.group(2);
				strs=customStr.split(delimiter);
			}
			return utility.sumOfString(strs);
		}
		else if(numberString.indexOf(",")==-1)
		{
			//one number
			return Integer.parseInt(numberString);
		}
		else
		{
			//more than one number
			strs=numberString.split(delimiter);
			return utility.sumOfString(strs);
		}

	}
}