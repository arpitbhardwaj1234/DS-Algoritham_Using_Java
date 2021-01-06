import java.util.*;
import java.lang.*;

class SubSetSumProblem
{
public static boolean checkSubSetSum(int[] arr,int sum)
{
return checkSubSetSum(arr,sum,0);
}
public static boolean checkSubSetSum(int[] arr,int sum,int index)
{
if(sum==0)
{
return true;
}
if(index==arr.length-1&&sum!=0)
{
return false;
}
return checkSubSetSum(arr,sum-arr[index],index+1)||checkSubSetSum(arr,sum,index+1);
}
 
public static void main(String[] args)
{
int[] arr={1,2,5,6,3,8};
int sum=8;
System.out.println(checkSubSetSum(arr,sum));
}
}