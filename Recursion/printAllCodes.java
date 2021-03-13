/*
Print all Codes - String
Send Feedback
Assume that the value of a = 1, b = 2, c = 3, ... , z = 26. You are given a numeric string S. Write a program to print the list of all possible codes that can be generated from the given string.
Note : The order of codes are not important. Just print them in different lines.
Input format :
A numeric string S
Output Format :
All possible codes in different lines
Constraints :
1 <= Length of String S <= 10
Sample Input:
1123
Sample Output:
aabc
kbc
alc
aaw
kw */

class PrintAllCode
{
public static char getChar(int n)
{
return (char) (n + 96);
}

public static void printAllCodes(String s,String ans)
{
if(s.length()==0)
{
System.out.println("");
return;
}
int n=Character.getNumericValue(s.charAt(0));
printAllCodes(s.substring(1),getChar(n)+ans);
if(s.length()>1)
{
int secNumber=Character.getNumericValue(s.charAt(0))*10+Character.getNumericValue(s.charAt(1));
printAllCodes(s.substring(2),getChar(secNumber)+ans);
}
}
public static void main(String args[])
{
String s="11";
printAllCodes(s,"");
}
}
