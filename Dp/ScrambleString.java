import java.util.*;
/*
We can scramble a string s to get a string t using the following algorithm:

If the length of the string is 1, stop.
If the length of the string is > 1, do the following:
Split the string into two non-empty substrings at a random index, i.e., if the string is s, divide it to x and y where s = x + y.
Randomly decide to swap the two substrings or to keep them in the same order. i.e., after this step, s may become s = x + y or s = y + x.
Apply step 1 recursively on each of the two substrings x and y.
Given two strings s1 and s2 of the same length, return true if s2 is a scrambled string of s1, otherwise, return false
*/
class ScrambleString {
    HashMap<String,Boolean> map=new HashMap<String,Boolean>();
    public boolean isScramble(String s1, String s2) {
        if(map.containsKey(s1+"*"+s2))
        {
            return map.get(s1+"*"+s2);
        }
      if(s1.length()==1)
      {
          return s1.equals(s2);
      }
      if(s1.equals(s2))
      {
          return true;
      }
      for(int i=1;i<s1.length();i++)
      {
          
         if((isScramble(s1.substring(0,i),s2.substring(0,i))&&isScramble(s1.substring(i),s2.substring(i)))
              ||(isScramble(s1.substring(s1.length()-i),s2.substring(0,i))&&isScramble(s1.substring(0,s1.length()-i),s2.substring(i))))
         {
             map.put(s1+"*"+s2,true);
             return true;
         }
      map.put(s1+"*"+s2,false);    
              
      }
        return false;
    }
}