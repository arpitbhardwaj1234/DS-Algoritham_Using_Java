
public class MinCostPath_MEMO {

	public static int minCostPath(int[][] input) {
		//Your code goes here
        int[][] cost=new int[input.length][input[0].length];
        for(int i=0;i<input.length;i++)
        {
            for(int j=0;j<input[0].length;j++)
            {
                cost[i][j]=-1;
            }
        }
        return minCostPath(input,cost,0,0);
	}
    public static int minCostPath(int[][] input, int[][] cost ,int i,int j)
    {   
        if(i>=input.length||j>=input[0].length)
        {
          return -1;
        }
        
        if(cost[i][j]!=-1)
        {
            return cost[i][j];
        }
        if(i==input.length-1&&j==input[0].length-1)
        {
            cost[i][j]=input[i][j];
            return cost[j][j];
        }
        int sum=input[i][j];
        int x=minCostPath(input,cost,i+1,j);
        int y=minCostPath(input,cost,i+1,j+1);
        int z=minCostPath(input,cost,i,j+1);
        int min=sum;
        if(x!=-1)
        {
            min=min+x;
        }
       if(y!=-1)
        {   if(min!=sum)
                min=min>sum+y?sum+y:min;
             else
               min=sum+y;
        }
        if(z!=-1)
        {   if(min==sum)
            min=min+z;
            else
                min=min>sum+z?sum+z:min;
                
        }
       cost[i][j]=min;
     return cost[i][j];
    }
}