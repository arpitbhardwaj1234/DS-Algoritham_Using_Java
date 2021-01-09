import java.util.*;
class SubSetSumProblem_Using_DP
{
public static boolean checkSubSet(int[] arr,int sum)
{
boolean dp[][]=new boolean[arr.length+1][sum+1];
int i,j;
dp[0][0]=true;
for(i=0;i<dp.length;i++)
{
dp[i][0]=true;
}
for(j=1;j<dp[0].length;j++)
{
dp[0][j]=false;
}
for(i=1;i<dp.length;i++)
{
for(j=1;j<dp[0].length;j++)
{
if(j<arr[i-1])
{
dp[i][j]=dp[i-1][j];
}
else
{
dp[i][j]=dp[i-1][j]||dp[i-1][j-arr[i-1]];
}
}
}
return dp[i-1][j-1];
}
public static void main(String args[])
{
int sum=1;
int[] arr={2,4,6,8,5,3};
System.out.println(checkSubSet(arr,sum));
}
}