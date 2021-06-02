//Minimum Bracket Reversal
/*
For a given expression in the form of a string, find the minimum number of brackets that can be reversed in order to make the expression balanced. The expression will only contain curly brackets.
If the expression can't be balanced, return -1.
Example:
Expression: {{{{
If we reverse the second and the fourth opening brackets, the whole expression will get balanced. Since we have to reverse two brackets to make the expression balanced, the expected output will be 2.

Expression: {{{
In this example, even if we reverse the last opening bracket, we would be left with the first opening bracket and hence will not be able to make the expression balanced and the output will be -1.
Input Format :
The first and the only line of input contains a string expression, without any spaces in between.
Output Format :
The only line of output will print the number of reversals required to balance the whole expression. Prints -1, otherwise.
Note:
You don't have to print anything. It has already been taken care of.
Constraints:
0 <= N <= 10^6
Where N is the length of the expression.

Time Limit: 1sec
Sample Input 1:
{{{
Sample Output 1:
-1
Sample Input 2:
{{{{}}
Sample Output 2:
1 */

import java.util.*;

class MinimumBracketReversal
{
public static int minimumBracketReverse(String s)
{
Stack<Character> stack=new Stack<Character>();
int count=0;
for(char c:s.toCharArray())
{
if(c=='{')
{
stack.push(c);
}
else
{
if(stack.isEmpty())
{
count++;
stack.push('{');
}
else
{
stack.pop();
}
}
}
if(stack.size()%2==0)
{
count+=stack.size()/2;
}
else
{
return -1;
}
return count;
}
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
String ss=s.next();
System.out.println("The minimum bracket reversal required is "+minimumBracketReverse(ss));
}
}

