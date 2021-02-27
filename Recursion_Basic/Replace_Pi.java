import java.util.*;
import java.lang.*;
//replace Pi with 3.14 
class Replace_Pi
{
public static String replacePiRecursively(String s)
{
if(s.length()==0||s.length()==1)
{
return s;
}
if(s.charAt(0)=='p'&&s.charAt(1)=='i')
{
return "3.14"+ replacePiRecursively(s.substring(2,s.length()));
}
return s.substring(0,1)+replacePiRecursively(s.substring(1,s.length()));
}
public static void main(String args[])
{
String[] s={"arpit","bhardwaj","piartpi", "pipip"};
for(String str:s)
{
System.out.println(replacePiRecursively(str));
}
}
}
