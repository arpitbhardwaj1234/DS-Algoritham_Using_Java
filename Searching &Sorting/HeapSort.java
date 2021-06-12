import java.util.*;
//Step1 Create the heap
//step 2  delete the heap element one by one

public class HeapSort {

public static int[] buildHeap(int[] arr)
{
    //0th element is allready in heap
    //Creating max heap
    for(int i=1;i<arr.length;i++)
    {
        int index=i;
        if(i%2==0)
        {
            index=arr[i-1]>arr[i]?i-1:i;
        }
        while(index>0&&arr[index]>arr[(index-1)/2])
        {
            int temp=arr[index];
            arr[index]=arr[(index-1)/2];
            arr[(index-1)/2]=temp;
            index=(index-1)/2;
        }
        System.out.println("Inside "+Arrays.toString(arr));
    }
    return arr;
}
public static int[] sortHeap(int[] arr)
{
    for(int i=arr.length-1;i>0;i--)
    {
        int temp=arr[0];
        arr[0]=arr[i];
        arr[i]=temp;
     int index=0;
     while(2*index+1<i)
     {
         int maxIndex=2*index+1;
         if(2*index+2<i)
         {
             maxIndex=arr[2*index+1]<arr[2*index+2]?2*index+2:2*index+1;
         }
         if(arr[index]<arr[maxIndex])
         {
             int temp2=arr[index];
             arr[index]=arr[maxIndex];
             arr[maxIndex]=temp2;
             index=maxIndex;
         }
         else
         {
             break;
         }

     }
    }
    return arr;
}
public static void main(String args[])
{
int[] arr={30,20,70,80,11,5,7,13,21,45,65,78,91,94,31};
arr=buildHeap(arr);
System.out.println("MaxHeap is "+Arrays.toString(arr)); 
arr=sortHeap(arr); 
System.out.println("Array after sorting is "+Arrays.toString(arr));
}
}