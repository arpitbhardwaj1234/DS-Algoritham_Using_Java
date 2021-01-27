import java.util.*;
import java.lang.*;
///find all binary string  of length n
class BinaryString
{
public static void generateString(int[] arr,int n,int i)
{
if(n==i)
{
System.out.println(Arrays.toString(arr));
}
else
{
arr[i]=0;
generateString(arr,n,i+1);
arr[i]=1;
generateString(arr,n,i+1);
}
}

public static void main(String args[])
{
int n=3;
int arr[]=new int[3];
generateString(arr,3,0);
}
}
