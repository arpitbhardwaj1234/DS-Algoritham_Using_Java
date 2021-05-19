import java.util.*;
import java.lang.*;
/*
You are given an array people where people[i] is the weight of the ith person, and an infinite number of boats where each boat can carry a maximum weight of limit. Each boat carries at most two people at the same time, provided the sum of the weight of those people is at most limit.

Return the minimum number of boats to carry every given person.

 

Example 1:

Input: people = [1,2], limit = 3
Output: 1
Explanation: 1 boat (1, 2)
*/
class BoatsToSavePeople {
    public int numRescueBoats(int[] people, int limit) {
        if(people.length==1)
        {
            return 1;
        }
        Arrays.sort(people);
        boolean[] isRescued=new boolean[people.length];
        int x=0;
        int y=people.length-1;
        int count=0;
        while(x<=y)
        {
            if(people[x]+people[y]<=limit)
            {
                isRescued[x]=true;
                isRescued[y]=true;
                count++;
                x++;
                y--;
            }
            else
            {
                isRescued[y]=true;
                count++;
                y--;  
            }
        }
        return count;
    }
}