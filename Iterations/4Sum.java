/*
Given an array nums of n integers, return an array of all the unique quadruplets [nums[a], nums[b], nums[c], nums[d]] such that:

0 <= a, b, c, d < n
a, b, c, and d are distinct.
nums[a] + nums[b] + nums[c] + nums[d] == target
You may return the answer in any order. */
class 4Sum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        if(nums.length<4)
        {
            return new ArrayList<List<Integer>>();
        }
        List<List<Integer>> arr=new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        int i=0,j,k,l;
        while(i<nums.length-3)
        {
            j=i+1;
    while(j<nums.length-2)
            {
//              System.out.println("J is "+j);
                int x=j+1;
                int y=nums.length-1;
                while(x<y)
                {
                    if(nums[i]+nums[j]+nums[x]+nums[y]<target)
                    {
                        x++;
                        continue;
                    }
                    else  if(nums[i]+nums[j]+nums[x]+nums[y]>target)
                    {
                        y--;
                        continue;
                    }
                    else
                    {
 //                 System.out.println("got the call"+i+" "+j+" "+x+" "+y);    
                    ArrayList<Integer> arb=new ArrayList<Integer>();
                        arb.add(nums[i]);
                        arb.add(nums[j]);
                        arb.add(nums[x]);
                        arb.add(nums[y]);
                        arr.add(arb);
                        while(x<y&&nums[x]==nums[x+1])
                        {
                            x=x+1;
                        }
                        while(y>x&&y>=3&&nums[y]==nums[y-1])
                        {
                            y=y-1;
                        }
                        x=x+1;
                        y=y-1;
//                      System.out.println(x+" x and y are"+y);
                    }
                }
               while(nums[j]==nums[j+1]&&j<nums.length-2)
               {
                   j=j+1;
               }
//            System.out.println("J is "+j);
               j=j+1;
//               System.out.println("J is "+j);
            }
            while(i<nums.length-1&&nums[i]==nums[i+1])
            {
                i=i+1;
            }
            i=i+1;
            
        }
        return arr;
        
    }
}