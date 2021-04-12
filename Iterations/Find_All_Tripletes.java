class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
        int i,j;
        List<List<Integer>> nums=null;
        for(i=0;i<arr.length-1;i++)
        {
           HashSet<Integer> set =new HashSet<Integer>();
            for(j=i+1;j<arr.length;j++)
            {
                int x=-(arr[i]+arr[j]);
                if(set.contains(x))
                {
                    List<Integer> l1=new ArrayList<Integer>();
                    l1.add(x);
                    l1.add(arr[i]);
                    l1.add(arr[j]);
                    if(nums==null)
                    {
                        nums=new ArrayList<List<Integer>>();
                    }
                    nums.add(l1);
                }
                else 
                {
                    set.add(arr[j]);
                }
            }
        }
        return nums;
        
    }
}