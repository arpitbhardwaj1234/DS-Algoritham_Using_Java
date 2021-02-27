//Geometric _Sum

import java.util.*;
import java.lang.*;

class Geometric_Sum
{
public static void main(String args[])
{
int[] arr={2,3,4};
for(int i=0;i<arr.length;i++)
{
System.out.println(findGeometricSum(arr[i]));
}
}
public static double findGeometricSum(int i)
{
return findGeometricSum(i,0);
}
public static double findGeometricSum(int i,int count)
{
if(count==i)
{
return 1/Math.pow(2,count);
}
return 1/Math.pow(2,count)+findGeometricSum(i,count+1);
}
}