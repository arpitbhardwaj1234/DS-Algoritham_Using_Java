import java.util.*;


class MergeSortArray
{
    public  void mergeSort(int[] arr,int low,int high)
    {
        if(low<high)
        {
            int mid=(low+high)/2;
          mergeSort(arr,low,mid);
          mergeSort(arr,mid+1,high);
          merge(arr,low,mid,high);
        }
    }

    public  void merge(int[] arr,int low,int mid,int high)
    {
        int[] arr1=new int[mid-low+1];
        int[] arr2=new int[high-mid];
        for(int i=low;i<=mid;i++)
        {
            arr1[i-low]=arr[i];
        }
        for(int j=mid+1;j<=high;j++)
        {
            arr2[j-mid-1]=arr[j];
        }
        int i=0,j=0,k=low;
        while(i<arr1.length&&j<arr2.length)
        {
           if(arr1[i]<arr2[j])
           {
               arr[k]=arr1[i];
               i++;
           }
           else
           {
               arr[k]=arr2[j];
               j++;
           }
           k++;
        }
        while(i<arr1.length)
        {
            arr[k]=arr1[i];
            i++;
            k++;
        }
        while(j<arr2.length)
        {
            arr[k]=arr2[j];
            j++;
            k++;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr={7,6,5,4,3,8,9};
        MergeSortArray ob=new MergeSortArray();
        ob.mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
}