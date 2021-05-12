//3SumClosest
/*
Given an array nums of n integers and an integer target, find three integers in nums such that the sum is closest to target. Return the sum of the three integers. You may assume that each input would have exactly one solution.
*/
import java.util.*;
class 3SumClosest {
    public int threeSumClosest(int[] nums, int target) {
            
        Arrays.sort(nums);
        int differece=Integer.MAX_VALUE;
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<nums.length-2;i++)
        {
            for(int j=i+1;j<nums.length-1;j++)
            {
              int k=nums.length-1;  
            while(j<k)
            {
                
                int sum=nums[i]+nums[j]+nums[k];
//                System.out.println(i+",  "+j+" "+k+" , "+sum);
                int diff=sum-target>0?sum-target:(-1)*(sum-target);
                ans=diff<differece?sum:ans;
                differece=diff<differece?diff:differece;
                k--;
            }
            }
        }
        return ans;
    }
}