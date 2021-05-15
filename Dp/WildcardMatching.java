//Wildcard Matching
/*
Given an input string (s) and a pattern (p), implement wildcard pattern matching with support for '?' and '*' where:

'?' Matches any single character.
'*' Matches any sequence of characters (including the empty sequence).
The matching should cover the entire input string (not partial).  */
class WildcardMatching {
    public void print(boolean[][] lookup)
    {
        for(int i=0;i<lookup.length;i++)
        {
            for(int j=0;j<lookup[0].length;j++)
            {
                System.out.print(lookup[i][j]+" ");
            }
            System.out.println();
            
                
        }
    }
    public boolean isMatch(String s, String p) {
        if(s.length()==0&&p.length()==0)
        {
            return true;
        }
        boolean[][] lookup=new boolean[p.length()+1][s.length()+1];
        lookup[0][0]=true;
        int i,j;
        for(i=1;i<lookup.length;i++)
        {
            if(p.charAt(i-1)=='*')
            {
                lookup[i][0]=lookup[i-1][0];
            }
            else
            {
                lookup[i][0]=false;
            }
        }
        for(j=1;j<lookup[0].length;j++)
        {
            lookup[0][j]=false;
        }
        for(i=1;i<lookup.length;i++)
        {
            for(j=1;j<lookup[0].length;j++)
            {
                if(p.charAt(i-1)=='*')
                {
                    lookup[i][j]=lookup[i-1][j]||lookup[i][j-1];
                }
                else if(p.charAt(i-1)=='?'||s.charAt(j-1)==p.charAt(i-1))
                {
                    lookup[i][j]=lookup[i-1][j-1];
                }
                else
                {
                    lookup[i][j]=false;
                }
            }
        }
    //    print(lookup);
      return lookup[i-1][j-1];
    }
}