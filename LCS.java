import java.util.*;

class LCS
{
public static int findLCS(String s,String t)
{
if(s.length()==0||t.length()==0)
{
return 0;
}
if(s.charAt(0)==t.charAt(0))
{
return 1+ findLCS(s.substring(1),t.substring(1));
}
int max=Integer.MIN_VALUE;
max=findLCS(s.substring(1),t.substring(1));
int x=findLCS(s,t.substring(1));
if(x>max)
{
max=x;
}
int y=findLCS(s.substring(1),t);
if(y>max)
{
max=y;
}
return max;
}
public static void main(String args[])
{
String s="arpitbha";
String t="rita";
System.out.println(findLCS(s,t));
}
}