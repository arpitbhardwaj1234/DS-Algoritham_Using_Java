import java.util.*;

class StockSpan
{
public static int[] stockSpan(int[] stock)
{
int[] arr=new int[stock.length];
Stack<Integer> s=new Stack<Integer>();
arr[0]=1;
s.push(0);
for(int i=1;i<stock.length;i++)
{
if(stock[i]<stock[s.peek()])
{
s.push(i);
arr[i]=1;
}
else
{
int sum=1;
while(!s.empty()&&stock[i]>stock[s.peek()])
{
sum=sum+arr[s.pop()];
}
arr[i]=sum;
s.push(i);
}
}
return arr;
}
public static void main(String args[])
{
int[] stock={100,80,60,70,60,75,85};
System.out.println(Arrays.toString(stockSpan(stock)));
}
}
