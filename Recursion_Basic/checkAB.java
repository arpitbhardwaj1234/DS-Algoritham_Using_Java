import java.util.*;
import java.lang.*;
//Pattern
//String should statt with a or followed by nothin or bb or a
//bb is not followed by b
class checkAB
{
public static boolean checkPattern(String s)
{
if(s.charAt(0)=='a')
{
return checkPattern(s.substring(1),s.substring(0,1));
}
return false;
}
public static boolean checkPattern(String s,String prev)
{
if(s.equals(""))
{
return true;
}
if(s.charAt(0)=='a')
{
return checkPattern(s.substring(1),"a");
}
if(s.charAt(0)=='b'&&s.length()>1&&s.charAt(1)=='b'&&!prev.equals("bb"))
{
return checkPattern(s.substring(2),"bb");
}
return false;
}

public static void main(String[] args)
{
String[] s={"abb","bba","abbabb","abbab","aaabbaaaaaaa"};
for(String str:s)
{
System.out.println(str+" "+checkPattern(str));
}
}
}
