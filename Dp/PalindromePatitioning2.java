import java.util.*; 
class PalindromePatitioning2 {
    public int minCut(String s) {
        if(s.length()==0||s.length()==1)
        {
            return 0;
        }
        int i,j,L,m;
        boolean[][] P=new boolean[s.length()][s.length()];
        int[] C=new int[s.length()];
        for(i=0;i<s.length();i++)
        {
            P[i][i]=true;
        }    
        for(L=2;L<=s.length();L++)
        {
            for(i=0;i<s.length()-L+1;i++)
            {
                j=i+L-1;
                if(L==2)
                {
                    P[i][j]=s.charAt(i)==s.charAt(j);
                }
                else
                {
                    P[i][j]=s.charAt(i)==s.charAt(j)&&P[i+1][j-1];
                }
            }
        }
        for(i=0;i<s.length();i++)
        {
            if(P[0][i])
            {
                C[i]=0;
            }
            else
            {
                int x=Integer.MAX_VALUE;
                for(j=0;j<i;j++)
                {
                    if(P[j+1][i]==true&&1+C[j]<=x)
                    {
                        x=1+C[j];
                    }
                }
                C[i]=Math.min(x,i);
            }
        }
        
        return C[i-1];
        
        
    
    }
}