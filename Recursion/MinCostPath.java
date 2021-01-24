//min CostPath
public class MinCostPath {

	public static int minCostPath(int[][] input) {
		//Your code goes here
        return minCostPath(input,0,0);
	}
    public static int minCostPath(int[][] input,int i,int j)
    {
        if(i>=input.length||j>=input[0].length)
        {
            return -1;
        }
        if(i==input.length-1&&j==input[0].length-1)
        {
            return input[i][j];
        }
        else
        {
                int sum=input[i][j];
                int x=minCostPath(input,i+1,j);
                int y=minCostPath(input,i,j+1);
                int z=minCostPath(input,i+1,j+1);
                 int min=sum;
                if(x!=-1)
                {
                    min=min+x;
                }
                if(y!=-1)
                {   if(min!=sum)
                    min=min>sum+y?sum+y:min;
                    else
                     min=min+y;   
                }
                if(z!=-1)
                {   if(min!=sum)
                    min=min>sum+z?sum+z:min;
                    else
                      min=min+z;  
                }
            return min;
        }
    }
}