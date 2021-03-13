//Pramutation of A String

import java.util.*;
import java.lang.*;

class PramutationOfArray
{
public static ArrayList<String> printAllPramutation(String s,ArrayList<String> ss)
{
if(s.length()==1)
{
ss.add(s);
return ss;
}
else
{
ArrayList<String> arr=new ArrayList<String>();
ArrayList<String> arb=printAllPramutation(s.substring(1),ss);
for(int i=0;i<arb.size();i++)
{
String str=arb.get(i);
for(int j=0;j<str.length();j++)
{
arr.add(str.substring(0,j)+s.charAt(0)+str.substring(j));
}
arr.add(str+s.charAt(0));
}
return arr;
}
}
public static void main(String args[])
{
String s="arpi";
ArrayList<String> ss=new ArrayList<String>();
System.out.println(printAllPramutation(s,ss));
}
}