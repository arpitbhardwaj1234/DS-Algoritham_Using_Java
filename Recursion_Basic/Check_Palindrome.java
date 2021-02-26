//Check if given string is palindrome or not 

class Check_Palindrome
{
public static boolean checkPalindrome(String s)
{
if(s.length()==0||s.length()==1)
{
return true;
}
if(s.charAt(0)==s.charAt(s.length()-1))
{
return checkPalindrome(s.substring(1,s.length()-1));
}
return false;
}
public static void main(String args[])
{
String s="arpitabtipra";
System.out.println(checkPalindrome(s));
}
}