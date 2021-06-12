import java.util.*;

public class Heapify {
    public static int[] heapify(int[] arr)
    {
        int n=arr.length;
      for(int i=n/2-1;i>=0;i--)
      {
         int index=i;
         while(2*index+1<n)
         {
             int maxIndex=2*index+1;
             if(2*index+2<n)
             {
                 maxIndex=arr[2*index+2]>arr[2*index+1]?2*index+2:2*index+1;
             }
             if(arr[index]<arr[maxIndex])
             {
                 int swap=arr[index];
                 arr[index]=arr[maxIndex];
                 arr[maxIndex]=swap;
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
    public static void main(String[] args)
    {
        int[] arr={10,15,20,30,40};
        arr=heapify(arr);
        System.out.println(Arrays.toString(arr));

    }
}
