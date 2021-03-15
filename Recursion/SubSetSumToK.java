import java.util.*;
import java.lang.*;


class SubSetSumToK
{
public static void printSubSetSumToK(int[] arr,int sum)
{
ArrayList<Integer> subArray=new ArrayList<Integer>();
printSubSetSumToK(arr,sum,subArray,0);
}

public static void printSubSetSumToK(int[] arr,int sum,ArrayList<Integer> subArray,int index)
{
if(sum==0)
{
System.out.println(subArray);
return;
}
if(index>=arr.length&&sum!=0)
{
return;
}
printSubSetSumToK(arr,sum,subArray,index+1);

if(arr[index]<=sum)
{
ArrayList<Integer> arb=new ArrayList<Integer>();
for(int i=0;i<subArray.size();i++)
{
arb.add(subArray.get(i));
}
arb.add(arr[index]);
printSubSetSumToK(arr,sum-arr[index],arb,index+1);
}
}

public static void main(String args[])
{
int sum=5;
int arr[]={4,1,5,2,3,3,2,1,5,3};
printSubSetSumToK(arr,sum);
}
}