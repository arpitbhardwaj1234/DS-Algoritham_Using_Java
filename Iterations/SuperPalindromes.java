//Super Palindromes
/*
Let's say a positive integer is a super-palindrome if it is a palindrome, and it is also the square of a palindrome.

Given two positive integers left and right represented as strings, return the number of super-palindromes integers in the inclusive range [left, right]. */
class SuperPalindromes {
    
    public String reverse( String s)
    {
        String t="";
        for(int i=s.length();i>0;i--)
        {
            t=t+s.substring(i-1,i);
        }
        return t;
    }
    public int superpalindromesInRange(String left, String right) {
        long l=Long.parseLong(left);
        long r=Long.parseLong(right);
        int count=0;
//        System.out.println(lr+"  "+rr);
        List<Long> palindromeNumbers=new ArrayList<Long>();
        for(long u=1;u<9;u++)
        {
            palindromeNumbers.add(u);
        }
        for(long u=1;u<10000;u++)
        {
            palindromeNumbers.add(Long.parseLong(Long.toString(u)+reverse(Long.toString(u))));
           for(long t=0;t<=9;t++)
        {
            palindromeNumbers.add(Long.parseLong(Long.toString(u)+Long.toString(t)+reverse(Long.toString(u))));
        }
        }
        
        
        for(long num: palindromeNumbers)
        {
 //           System.out.println(num);
            String s=String.valueOf(num);
                String square=String.valueOf(num*num);
                long sq=Long.parseLong(square);
                 if(square.equals(reverse(square))&&l<=sq&&sq<=r)
                    {
                        count++;
                    }
        }
        return count;
        
    }
}