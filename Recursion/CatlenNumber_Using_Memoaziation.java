import java.util.*;
import java.lang.*;

class CatlenNumber_Using_Memoaziation
{
public static int findCatlan(int n)
{
if(n<1)
{
return 1;
}
int[] storage=new int[n+1];
for(int i=0;i<=n;i++)
{
storage[i]=-1;
}
return findCatlan(n,storage);
}
public static int findCatlan(int n,int[] storage)
{
System.out.println("Hello World");
storage[0]=1;
storage[1]=1;
if(storage[n]!=-1)
{
return storage[n];
}
else
{
int x=0;
for(int i=0;i<n;i++)
{
x+=findCatlan(i,storage)*findCatlan(n-i-1,storage);
}
System.out.println(x);
storage[n]=x;
return storage[n];
}
}

public static void main(String args[])
{
int n=3;
System.out.println(findCatlan(n));
}
}