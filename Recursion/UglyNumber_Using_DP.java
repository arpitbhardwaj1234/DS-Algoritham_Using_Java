import java.util.*;
import java.lang.*;

class UglyNumber_Using_DP
{
public static int findUgly(int n)
{
int[] arr=new int[n];
if(n==1||n==2||n==3||n==5)
{
return n;
}
else
{
arr[0]=1;
int i2=0,i3=0,i5=0,i=0;
for(i=1;i<n;i++)
{
arr[i]=Math.min((i2+1)*2,Math.min((i3+1)*3,(i5+1)*5));
if(arr[i]==(i2+1)*2)
{
i2++;
}
if(arr[i]==(i3+1)*2)
{
i3++;
}
if(arr[i]==(i5+1)*2)
{
i5++;
}
}
return arr[n-1];
}
}

public static void main(String[] args)
{
int n=9;
System.out.println(findUgly(n));
}
}
