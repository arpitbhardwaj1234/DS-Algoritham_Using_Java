import java.util.*;
import java.lang.*;
//find all the combination of kth binary number of length n


class Kbinary
{
public static void main(String args[])
{
int n=3;
int k=2;
int arr[]=new int[3];
print_arr(arr,3,2,0);
}

public static void print_arr(int[] arr,int n,int k,int i) 
{
if(i==n)
{
System.out.println(Arrays.toString(arr));

}
else
{
int j=0;
for(j=0;j<=k;j++)
{
arr[i]=j;
print_arr(arr,n,k,i++);
}
}
}


}
