/*
Code: Edit Distance
Send Feedback
Given two strings s and t of lengths m and n respectively, find the edit distance between the strings.
Edit Distance
Edit Distance of two strings is minimum number of operations required to make one string equal to other. In order to do so you can perform any of the following three operations only :
1. Delete a character
2. Replace a character with another one
3. Insert a character
Note
Strings don't contain spaces
Input Format :
The first line of input contains a string, that denotes the value of s. The following line contains a string, that denotes the value of t.
Output Format :
The first and only line of output contains the edit distance value between the given strings.
Constraints :
1<= m,n <= 10
Time Limit: 1 second
Sample Input 1 :
abc
dc
Sample Output 1 :
2 */

public class Solution {

	
	public static int editDistance(String s1, String s2){

		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
        */   
        if(s1.length()==0&&s2.length()==0)
        {
            return 0;
        }
        if(s1.length()==0&&s2.length()!=0)
        {
            return s2.length();
        }
        if(s1.length()!=0&&s2.length()==0)
        {
            return s1.length();
        }
        if(s1.charAt(0)==s2.charAt(0))
        {
            return editDistance(s1.substring(1),s2.substring(1));
        }
            int max=Integer.MAX_VALUE;
            int x=1+editDistance(s2.substring(0,1)+s1,s2);
            if(max>x)
            {
                max=x;
            }
            int y=1+editDistance(s1.substring(1),s2.substring(1));
            if(max>y)
            {
                max=y;
            }
            int z=1+editDistance(s1.substring(1),s2);
            if(max>z)
            {
                max=z;
            }
    
        return max;
            
}
}

//Memozation
	
public class Solution {

	public static int editDistance(String s1, String s2) {
		//Your code goes here4
        
         if(s1.length()==0&&s2.length()==0)
        {
            return 0;
        }
        if(s1.length()==0&&s2.length()!=0)
        {
            return s2.length();
        }
        if(s1.length()!=0&&s2.length()==0)
        {
            return s1.length();
        }
        if(s1.charAt(0)==s2.charAt(0))
        {
            return editDistance(s1.substring(1),s2.substring(1));
        }
        int[][] storage=new int[s1.length()+1][s2.length()+1]; 
        for(int i=0;i<storage.length;i++)
        {
            for(int j=0;j<storage[0].length;j++)
            {
                storage[i][j]=-1;
            }
        }
        return editDistance(s1,s2,storage);
    }
    public static int editDistance(String s1, String s2,int[][] storage)
    {
     if(storage[s1.length()][s2.length()]!=-1)
     {
         return storage[s1.length()][s2.length()];
     }
        if(s1.length()==0&&s2.length()==0)
        {
            storage[s1.length()][s2.length()]=0;
            return 0;
        }
        if(s1.length()==0&&s2.length()!=0)
        {
            storage[0][s2.length()]=s2.length();
            return s2.length();
        }
        if(s1.length()!=0&&s2.length()==0)
        {
            storage[s1.length()][0]=s1.length();
            return s1.length();
        }
        if(s1.charAt(0)==s2.charAt(0))
        {
            storage[s1.length()][s2.length()]=editDistance(s1.substring(1),s2.substring(1),storage);
                return storage[s1.length()][s2.length()];
        }
        int max=Integer.MAX_VALUE;
        int x=1+editDistance(s1.substring(1),s2.substring(1),storage);
        if(max>x)
        {
            max=x;
        }
        int y=1+editDistance(s1.substring(1),s2,storage);
        if(max>y)
        {
            max=y;
        }
        int z=1+editDistance(s2.substring(0,1)+s1.substring(1),s2,storage);
        if(max>z)
        {
            max=z;
        }
        storage[s1.length()][s2.length()]=max;
        return storage[s1.length()][s2.length()];
    }

}

//DP

	