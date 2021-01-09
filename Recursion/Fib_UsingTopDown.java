import java.util.*;
import java.lang.*;
//Memoization
class Fib_UsingTopDown
{
public static int fibM(int n)
{
int[] storage=new int[n+1];
int i,j;
for(i=0;i<storage.length;i++)
{
storage[i]=-1;
}
return fibM(n,storage);
}
public static int fibM(int n,int[] storage)
{
if(n==0||n==1)
{
storage[n]=n;
return storage[n];
}
else
{
storage[n]=fibM(n-1,storage)+fibM(n-2,storage);
}
return storage[n];
}
public static void main(String args[])
{
int n=78;
System.out.println(fibM(5));
}
}