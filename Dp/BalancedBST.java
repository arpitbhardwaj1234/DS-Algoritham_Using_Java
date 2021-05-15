//Balanced BST
/*
Code: Number of Balanced BTs
Send Feedback
Given an integer h, find the possible number of balanced binary trees of height h. You just need to return the count of possible binary trees which are balanced.
This number can be huge, so, return output modulus 10^9 + 7.
Write a simple recursive solution.
Input Format :
The first and only line of input contains an integer, that denotes the value of h. Here, h is the height of the tree.
Output Format :
The first and only line of output contains the count of balanced binary trees modulus 10^9 + 7.
Constraints :
1 <= h <= 24
Time Limit: 1 sec
Sample Input 1:
3
Sample Output 1:
15
Sample Input 2:
4
Sample Output 2:
315 
*/
/*
    Time complexity: O(2^N)
    Space complexity: O(N)

    where N is the final height of the binary tree
*/

public class Solution {

	public static long balancedBTs(long n){

		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
        */
        if(n==1)
        {
            return 1;
        }
        if(n==2)
        {
            return 3;
        }
        long x=0;
        long u=balancedBTs(n-1);
        long v=balancedBTs(n-2);
        x+=2*u*v+u*u;
        return x;   
	}
}

//DP

public class Solution {

	public static int balancedBTs(int h){

		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
        */
   if(h==1)
   {
       return 1;
   }
    if(h==2)
    {
      return 3;
    }
     int arr[]=new int[h+1];
        arr[0]=1;
        arr[1]=1;
        arr[2]=3;
        int mod=(int)Math.pow(10,9)+7;
        for(int i=3;i<arr.length;i++)
        {
            long u=(long)arr[i-1]*arr[i-1];
            long v=(long)2*arr[i-1]*arr[i-2];
            int x=(int)(u%mod);
            int y=(int)(v%mod);
            arr[i]=(x+y)%mod;
        }
        return arr[h];
	}
}