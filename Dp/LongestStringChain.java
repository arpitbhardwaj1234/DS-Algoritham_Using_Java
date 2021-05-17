//Leet code problem
/*
1048. Longest String Chain
Medium

1811

109

Add to List

Share
Given a list of words, each word consists of English lowercase letters.

Let's say word1 is a predecessor of word2 if and only if we can add exactly one letter anywhere in word1 to make it equal to word2. For example, "abc" is a predecessor of "abac".

A word chain is a sequence of words [word_1, word_2, ..., word_k] with k >= 1, where word_1 is a predecessor of word_2, word_2 is a predecessor of word_3, and so on.

Return the longest possible length of a word chain with words chosen from the given list of words.
*/
class LongestStringChain {
    public int longestStrChain(String[] words) {
        Arrays.sort(words,(a,b)->a.length()-b.length());
        HashMap<String,Integer> map=new HashMap<String,Integer>();
        int tmax=Integer.MIN_VALUE;
        for(int i=0;i<words.length;i++)
        {
            int max=Integer.MIN_VALUE;
            if(map.containsKey(words[i]))
            {
               max= map.get(words[i]);
            }
          else  if(words[i].length()==1)
            {
                map.put(words[i],1);
                max=1;
            }
            else
            {
            for(int j=0;j<words[i].length();j++)
            {
                String s=words[i].substring(0,j)+words[i].substring(j+1);
                int x=map.containsKey(s)?map.get(s):0;
   //             System.out.println(s+" "+(x+1)+ "   , "+words[i]);
                max=max<x?x:max;
            }
                map.put(words[i],max+1);
            }
            tmax=Math.max(max+1,tmax);
        }
        return tmax;
    }
}