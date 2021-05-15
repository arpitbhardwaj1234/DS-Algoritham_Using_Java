import java.util.*;
import java.lang.*;
/*
Given a string s, partition s such that every substring of the partition is a palindrome. Return all possible palindrome partitioning of s.

A palindrome string is a string that reads the same backward as forward.

 

Example 1:

Input: s = "aab"
Output: [["a","a","b"],["aa","b"]]
Example 2:

Input: s = "a"
Output: [["a"]]
*/

class PalindromePartition {
    public boolean isPalindrome(String s)
    {
      if(s.length()==1||s.length()==0)
      {
          return true;
      }
        int n=s.length();
      for(int i=0;i<=s.length()/2;i++)
      {
          if(s.charAt(i)!=s.charAt(n-i-1))
          {
              return false;
          }
      }
        return true;
    }
    
    public List<List<String>> partition(String s) {
        List<List<String>> arr=new ArrayList<List<String>>();
        List<String> arb=new ArrayList<String>();
        return partition(s,arr,arb);
        
    }
    
    public List<List<String>> partition(String s,List<List<String>> arr,List<String> arb)
    {
//        System.out.println(s);
        if(s.length()==0)
        {
            arr.add(arb);
            return arr;
        }
        if(s.length()==1)
        {
            arb.add(s);
            return partition(s.substring(1),arr,arb);
         //   arr.add(arb);
        }
        for(int i=1;i<=s.length();i++)
        {
            List<String> arc=new ArrayList<String>();
            arc.addAll(arb);
  //          System.out.ptintln(arc);
            if(isPalindrome(s.substring(0,i)))
            {
                arc.add(s.substring(0,i));
                partition(s.substring(i),arr,arc);
            }
        }
        return arr;
    }
}