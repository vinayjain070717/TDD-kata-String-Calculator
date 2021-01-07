package com.vinay.utility;
import java.util.regex.*;
import java.util.*;
public class ParserUtility
{
public String[] parseString(String numberString)
{
String delimiter="";
String [] strs=null;
String regex="//(.+)\n(.*)";
Pattern pattern=Pattern.compile(regex,Pattern.MULTILINE);
Matcher matcher=pattern.matcher(numberString);
if(matcher.find())
{
delimiter=checkReservedCharactersInDelimiter(parseDelimiter(matcher.group(1)));
String customStr=matcher.group(2);
strs=customStr.split(delimiter);
}
return strs;
}
public String parseDelimiter(String delimiter)
{
long countOfStartingBracket=delimiter.chars().filter(num -> num == '[').count();
if(countOfStartingBracket==1)
{
// for one delimiter
delimiter=delimiter.substring(1,delimiter.length()-1);
}
if(countOfStartingBracket>1)
{
// for more than one delimiter
delimiter=combineMultipleDelimiter(delimiter);
delimiter=delimiter.substring(0,delimiter.length()-1);
}
return delimiter;
}

public String combineMultipleDelimiter(String delimiter)
{
String regex="\\[(.)\\]";
StringBuilder sb=new StringBuilder();
Matcher matcher=Pattern.compile(regex,Pattern.MULTILINE).matcher(delimiter);
while(matcher.find()) sb.append(matcher.group(1)+"|");
return sb.toString();
}

public String checkReservedCharactersInDelimiter(String delimiter)
{
String reservedCharacters="*+^";
StringBuilder sb=new StringBuilder();
for(int i=0;i<delimiter.length();i++)
{
if(reservedCharacters.indexOf(delimiter.charAt(i))!=-1)
{
sb.append("\\"+delimiter.charAt(i));
}
else sb.append(delimiter.charAt(i));
}
delimiter=sb.toString();
return delimiter;
}

}
