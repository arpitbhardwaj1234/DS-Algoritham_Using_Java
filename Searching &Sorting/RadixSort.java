import java.util.*;

public class RadixSort {

    public static int findMax(int[] arr,int n)
    {
        int max=arr[0];
        for(int i=0;i<n;i++)
        {
            max=Math.max(arr[i],max);
        }
        return max;
    }

    public static void countSort(int[] arr,int n,int exp)
    {
        int count[]=new int[10];
        for(int i=0;i<n;i++)
        {
            count[arr[i]/exp%10]++;
        }
        System.out.println(Arrays.toString(count));
        for(int i=1;i<10;i++)
        {
            count[i]+=count[i-1];
        }
        System.out.println(Arrays.toString(count));
        int[] output=new int[n];
        for(int i=0;i<n;i++)
        {
            output[i]=arr[i];
        }
        for(int i=n-1;i>=0;i--)
        {
         int index=output[i]/exp%10;
         arr[--count[index]]=output[i];
        }
        System.out.println(Arrays.toString(count));
        System.out.println(Arrays.toString(arr));
    }


    public static void radixSort(int[] arr,int n)
    {
        int max=findMax(arr,n);
        for(int exp=1;max/exp>0;exp=exp*10)
        {
            countSort(arr,n,exp);
        }
    }

    public static void main(String[] args)
    {
        int[] arr={17,15,25,13,3,8};

        radixSort(arr,arr.length);
    System.out.println(Arrays.toString(arr));
    }
}
