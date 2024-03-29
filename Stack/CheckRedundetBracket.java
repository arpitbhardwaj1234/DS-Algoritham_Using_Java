//Check redundant brackets
/*
For a given expression in the form of a string, find if there exist any redundant brackets or not. It is given that the expression contains only rounded brackets or parenthesis and the input expression will always be balanced.
A pair of the bracket is said to be redundant when a sub-expression is surrounded by unnecessary or needless brackets.
Example:
Expression: (a+b)+c
Since there are no needless brackets, hence, the output must be 'false'.
Expression: ((a+b))
The expression can be reduced to (a+b). Hence the expression has redundant brackets and the output will be 'true'.
*/
import java.util.*;

class CheckRedundetBracket{

public static boolean isValid(String s)
{
Stack<Character> stack=new Stack<Character>();
for(int i=0;i<s.length();i++)
{
if(s.charAt(i)!=')')
{
stack.push(s.charAt(i));
}
else
{
int count=0;
while(stack.peek()!='(')
{
stack.pop();
count++;
}
if(count==0||count==1)
{
return false;
}
}
}
return true;
}
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
String ss=s.next();
System.out.println(isValid(ss));
}
}