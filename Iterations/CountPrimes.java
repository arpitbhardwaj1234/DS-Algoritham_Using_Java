class Solution {
    public void print(boolean[] notPrime)
    {
        for(int j=0;j<notPrime.length;j++)
        {
            System.out.print(notPrime[j]+"  ");
        }
    }
    public int countPrimes(int n)  {
        if(n<=1)
        {
            return 0;
        }
        if(n==2||n==3)
        {
            return n-2;
        }
        boolean[] notPrime=new boolean[n];
        notPrime[0]=true;
        notPrime[1]=true;
      int count=0;
        for(int i=2;i*i<=n;i++)
        {
            if(!notPrime[i])
            {
                for(int j=2;i*j<n;j++)
                {
                    notPrime[i*j]=true;
                }
                
            }
        }
        for(int i=2;i<n;i++)
        {
            if(!notPrime[i])
            {
                count++;
            }
        }
        
        return count;
        
    
    }
}