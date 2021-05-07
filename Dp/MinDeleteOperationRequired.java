//Find Minimum delete operation required to make string1 equlas string 2 

class MinDeleteOperationRequired {
       public void print(int[][] dp)
        {
            for(int i=0;i<dp.length;i++)
            {
                for(int j=0;j<dp[0].length;j++)
                {
                    System.out.print(dp[i][j]+" ");
                }
                System.out.println();
            }
        }
    public int minDistance(String word1, String word2) {
     
        
       int[][] dp=new int[word1.length()+1][word2.length()+1];
        int i=0;
        int j=0;
       for(i=0;i<dp.length;i++)
       {
           dp[i][0]=i;
       }
       for(j=0;j<dp[0].length;j++)
       {
           dp[0][j]=j;
       }
       for(i=1;i<dp.length;i++)
       {
           for(j=1;j<dp[1].length;j++)
           {
               if(word1.charAt(i-1)==word2.charAt(j-1))
               {
                   dp[i][j]=dp[i-1][j-1];
               }
               else
               {
                   dp[i][j]=Math.min(dp[i][j-1],dp[i-1][j])+1;
               }
           }
       }
    //  print(dp);
       return  dp[i-1][j-1];
    
        
    }
}