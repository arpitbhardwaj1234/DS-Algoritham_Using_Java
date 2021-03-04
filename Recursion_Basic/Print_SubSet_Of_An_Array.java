//Print_SubSet_Of_An_Array

import java.util.*;


class Print_SubSet_Of_An_Array
{
public static ArrayList<ArrayList<Integer>> printAllSubset(int[] arr)
{
ArrayList<ArrayList<Integer>> subsets=new ArrayList<ArrayList<Integer>>();
ArrayList<Integer> temp=new ArrayList<Integer>();
return printAllSubset(arr,0,subsets,temp);
}

public static ArrayList<ArrayList<Integer>> printAllSubset(int[] arr,int index,ArrayList<ArrayList<Integer>> subset,ArrayList<Integer> temp)
{
if(index==arr.length)
{
subset.add(temp);
return subset;
}
int x=arr[index];
ArrayList<Integer> temp1=new ArrayList<Integer>();
temp1.addAll(temp);
temp1.add(x);
printAllSubset(arr,index+1,subset,temp1);
printAllSubset(arr,index+1,subset,temp);
return subset;
}
public static void main(String[] args)
{
int[] arr={1,2,3,4};
System.out.println(printAllSubset(arr));
}
}