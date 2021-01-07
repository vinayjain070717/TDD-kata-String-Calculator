package com.vinay.utility;
import com.vinay.exception.*;
public class Utility
{
	StringBuilder sb;
	public int toInt(String str)
	{
		return Integer.parseInt(str);
	}
	public int sumOfString(String[] numbers) throws NegativeNumberException
	{
		int sum=0;
		boolean isNegativeNumberExist=false;
		for(int i=0;i<numbers.length;i++)
		{
			int num=toInt(numbers[i]); 
			if(num<0) throw new NegativeNumberException("Negatives not allowed : "+num); // multiple negative number case
			sum=sum+num;
		}
		return sum;
	}
}
