/*
Given a string s and a string array dictionary, return the longest string in the dictionary that can be formed by deleting some of the given string characters. If there is more than one possible result, return the longest word with the smallest lexicographical order. If there is no possible result, return the empty string.

 

Example 1:

Input: s = "abpcplea", dictionary = ["ale","apple","monkey","plea"]
Output: "apple" */
//Longest Word in Dictionary through Deleting
class LongestWordInDictionary {
    public String findLongestWord(String s, List<String> dictionary) {
     String res="";
     for(String dic:dictionary)
     {
         if(isSubsequence(s,dic))
         {
             if(dic.length()>res.length()||(dic.length()==res.length()&&dic.compareTo(res)<1))
                {
                    res=dic;
                }
         }
     }
        return res;
    }
    public boolean isSubsequence(String s,String dic)
    {
        int i=0,j=0;
        for(i=0;i<s.length()&&j<dic.length();i++)
        {
            if(s.charAt(i)==dic.charAt(j))
            {
                j++;
            }
        }
        return j==dic.length();
    }
}