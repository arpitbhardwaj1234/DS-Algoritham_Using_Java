/*
Given a triangle array, return the minimum path sum from top to bottom.

For each step, you may move to an adjacent number of the row below. More formally, if you are on index i on the current row, you may move to either index i or index i + 1 on the next row.
*/
/*
Input: triangle = [[2],[3,4],[6,5,7],[4,1,8,3]]
Output: 11
Explanation: The triangle looks like:
   2
  3 4
 6 5 7
4 1 8 3
The minimum path sum from top to bottom is 2 + 3 + 5 + 1 = 11 (underlined above).
*/
class Tringle{
    public int minimumTotal(List<List<Integer>> triangle) {
        if(triangle.size()==1)
        {
            return triangle.get(0).get(0);
        }
        int i,j;
        for(i=1;i<triangle.size();i++)
        {
            for(j=0;j<triangle.get(i).size();j++)
            {
    //              System.out.println(i+" "+j); 
            if(j==triangle.get(i-1).size())
            {
                int u=triangle.get(i-1).get(j-1);
     //           System.out.println(u);
     //           System.out.println(triangle.get(i).get(j));
                triangle.get(i).set(j,triangle.get(i).get(j)+u);
   //             System.out.println(triangle.get(i).get(j));
            }
            else if(j>0&&j<triangle.get(i-1).size())
             {
              
             int x=Math.min(triangle.get(i-1).get(j-1),triangle.get(i-1).get(j));
                x +=triangle.get(i).get(j); 
                triangle.get(i).set(j,x);
             }
             else
             {
                 triangle.get(i).set(j,triangle.get(i-1).get(j)+triangle.get(i).get(j));
             }    
        }
            
    }
    int min=triangle.get(i-1).get(0);
        for(j=1;j<triangle.size();j++)
        {
            if(min>triangle.get(i-1).get(j))
            {
                min=triangle.get(i-1).get(j);
            }
        }
        return min;
    }
}