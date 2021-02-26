//Given an araay and a number x you neet to retuan an array with that contain al the indexes in incresing order 
import java.util.*;

class Find_All_Index
{
public static ArrayList<Integer> findAllIndex(int arr[],int x)
{
ArrayList<Integer> indexArr=new ArrayList<Integer>();
return findAllIndex(arr,x,0,indexArr);
}

public static ArrayList<Integer> findAllIndex(int arr[],int x,int index,ArrayList<Integer>  indexArr)
{
if(index>=arr.length)
{
return indexArr;
}
if(arr[index]==x)
{
indexArr.add(index);
}
indexArr= findAllIndex(arr,x,index+1,indexArr);
return indexArr;
}
public static void main(String args[])
{
int arr[]={1,1,2,3,4,7,8,9,1};
int x=1;
ArrayList<Integer> result=findAllIndex(arr,x);
System.out.println(result);
}
}
