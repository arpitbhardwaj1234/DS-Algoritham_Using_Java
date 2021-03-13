import java.util.*;
import java.lang.*;

class SubSetOfAnArray
{
public static ArrayList<ArrayList<Integer>> printAllSubSet(int arr[],int index)
{
if(arr.length==index)
{
ArrayList<Integer> arb=new ArrayList<>();
ArrayList<ArrayList<Integer>> arc=new ArrayList<ArrayList<Integer>>();
arc.add(arb);
return arc;
}
ArrayList<ArrayList<Integer>> arc=printAllSubSet(arr,index+1);
ArrayList<ArrayList<Integer>> arb=new ArrayList<ArrayList<Integer>>();
for(int i=0;i<arc.size();i++)
{
ArrayList<Integer> temp=new ArrayList<>();
temp.add(arr[index]);
for(int k=0;k<arc.get(i).size();k++)
{
temp.add(arc.get(i).get(k));
}

arb.add(temp);
}
for(int i=0;i<arc.size();i++)
{
arb.add(arc.get(i));
}
return arb;
}

public static void main(String args[])
{
int[] arr={1,2,3};
System.out.println(printAllSubSet(arr,0));
}
}