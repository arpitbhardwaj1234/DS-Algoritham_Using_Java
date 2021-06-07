import java.util.Arrays;

class QuickSort {
    public static void sort(int[] arr,int low,int high){
    if(low<high)
    {
        int pi=partition(arr,low,high);
        sort(arr,low,pi-1);
        sort(arr,pi+1,high);
    }
}
    
    public static int partition(int[] arr,int low,int high)
    {
        int pivot=arr[high];
        int i=low-1;
        int j=low;
        for(j=low;j<high;j++)
        {
            if(arr[j]<pivot)
            {
                i++;
                int swap=arr[i];
                arr[i]=arr[j];
                arr[j]=swap;
            }
        }
        int x=arr[i+1];
        arr[i+1]=pivot;
        arr[high]=x;
        System.out.println(Arrays.toString(arr));
        return i+1;
    }
    public static void main(String[] args)
    {
         int[] arr={50,40,30,20,10,5,6,7};
         sort(arr,0,arr.length-1);
         System.out.println(Arrays.toString(arr));
    }
}
