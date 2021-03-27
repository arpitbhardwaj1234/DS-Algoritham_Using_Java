//Given a string s and an integer k, return the length of the longest substring of s such that the frequency of each character in this substring is greater than or equal to k.

class CheckValidityOfString {
    public int longestSubstring(String s, int k) {
        if(k==0||k==1)
        {
            return s.length();
        }
        if(s.length()<k)
        {
            return 0;
        }
        HashMap<Character,Integer> map=new HashMap<Character,Integer>();
        int n=s.length();
        for(int i=0;i<n;i++)
        {
            if(map.containsKey(s.charAt(i)))
            {
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }
            else
            {
                map.put(s.charAt(i),1);
            }
        }
        int l1=0;
        while(l1<n&&map.get(s.charAt(l1))>=k)
        {
            l1++;
        }
        if(l1==n||l1==n-1)
        {
            return l1;
        }
        int l=l1;
        l1=longestSubstring(s.substring(0,l1),k);
        while(l<n&&map.get(s.charAt(l))<k)
        {
            l++;
        }
        int l2=n>l?longestSubstring(s.substring(l),k):0;
        return l1>l2?l1:l2;
    }
}