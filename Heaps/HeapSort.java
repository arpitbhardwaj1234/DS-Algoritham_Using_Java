import java.util.*;
import java.lang.*;
public class HeapSort {

	public static void inplaceHeapSort(int arr[]) {
		/* Your class should be named Solution
		* Don't write main().
		* Don't read input, it is passed as function argument.
		* Change in the given input itself.
		* Taking input and printing output is handled automatically.
		*/
        if(arr.length==0||arr.length==1)
        {
            return ;
        }
        //creating max heap
        int i=1;
        while(i<arr.length)
        {
            int ci=i;
            int pi=(ci-1)/2;
            while(ci>0&&arr[pi]>arr[ci])
            {
                int temp=arr[pi];
                arr[pi]=arr[ci];
                arr[ci]=temp;
                ci=pi;
                pi=(ci-1)/2;
            }
            i++;
        }
        //create descending order using minhep
        //now heap size=i
 //       System.out.println(Arrays.toString(arr));
        while(i>1)
        {
         int temp=arr[i-1];
        arr[i-1]=arr[0];
            i--;
        arr[0]=temp;
        int pi=0;
        int c1=2*pi+1;
        int c2=2*pi+2;
        int mi=c1;
        if(c2<i&&arr[c1]>arr[c2])
        {
            mi=c2;
        }
        while(mi<i&&arr[pi]>arr[mi])
        {
            int tt=arr[pi];
            arr[pi]=arr[mi];
            arr[mi]=tt;
            pi=mi;
            c1=2*pi+1;
            c2=2*pi+2;
            mi=c1;
            if(c2<i&&arr[c1]>arr[c2])
            {
                mi=c2;
            }
        }
     //   System.out.println(Arrays.toString(arr));    
       //  i--;    
        } 
    }
	}