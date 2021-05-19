//Minimum Moves to Equal Array Elements II
/*Given an integer array nums of size n, return the minimum number of moves required to make all array elements equal.

In one move, you can increment or decrement an element of the array by 1.

 

Example 1:

Input: nums = [1,2,3]
Output: 2
Explanation:
Only two moves are needed (remember each move increments or decrements one element):
[1,2,3]  =>  [2,2,3]  =>  [2,2,2]
*/
class MinimumMovesToEqualArrayElements{
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int index=nums.length/2;
        int ans=0;
        for(int i=0;i<nums.length;i++)
        {
            int diff=nums[i]-nums[index];
            ans+=diff>0?diff:(-1)*diff;
        }
        return ans;
    }
}