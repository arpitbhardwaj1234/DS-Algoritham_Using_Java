//Given a string s and an integer k, return the length of the longest substring of s such that the frequency of each character in this substring is greater than or equal to k

class CheckValidityOfString{
    
    public static boolean isValid(String s,int k)
    {
      if(s.length()==0)
      {
          return true;
      }
       int freq[]=new int[26];
    for(int i=0;i<s.length();i++)
    {
        freq[s.charAt(i)-'a']++;
    }
    System.out.println(s+" "+freq[0]);    
    for(int i=0;i<freq.length;i++)
    {
        if(freq[i]>0&&freq[i]<k)
        {
            return false;
        }
    }
        return true;
    }
    
    
    public static int longestSubstring(String s, int k) {
        
        int i,j;
        int maxLength=0;
        for(i=0;i<s.length();i++)
        {
          System.out.println(s.substring(i));
                if(isValid(s.substring(i),k))
                {
                    maxLength=maxLength>s.substring(i).length()?maxLength:s.substring(i).length();
                } 
            for(j=i;j<=s.length();j++)
            {
                if(isValid(s.substring(i,j),k))
                {
                    maxLength=maxLength>s.substring(i,j).length()?maxLength:s.substring(i,j).length();
                }    
            }
        }
        return maxLength;
    }
   public static void main(String[] args)
   {
   System.out.println(longestSubstring("a",1));
     
    }
}