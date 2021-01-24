import java.util.ArrayList;
import java.util.Queue;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public class BFSTraversal {
    public static void printHalper(int[][] edges,int sv,boolean[] visited)
    {
             ArrayList<Integer> arr
            = new ArrayList<Integer>();
        arr.add(sv);
        visited[sv]=true;
        while(arr.size()!=0)
        {
           sv=arr.get(0); 
          for(int i=0;i<edges.length;i++)
          {
              if(edges[sv][i]==1&&visited[i]==false)
              {
                  arr.add(i);
                  visited[i]=true;
              }
       //     System.out.println(arr.size());
         
            
              
          }
         System.out.print(arr.remove(0)+" ");   
        }
    }
    
    public static void print(int[][] edges)
    {
        boolean[] visited=new boolean[edges.length];
        int i;
        for(i=0;i<visited.length;i++)
        {
            if(!visited[i])
            printHalper(edges,i,visited);
        }
    }

	public static void main(String[] args) throws NumberFormatException, IOException {
        
        /* Write Your Code Here
		 * Complete the Rest of the Program
		 * You have to take input and print the output yourself
		 */
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int v=s.nextInt();
        int[][] edges=new int[n][n];
        for(int i=0;i<v;i++)
        {
            int sv=s.nextInt();
            int ev=s.nextInt();
            edges[sv][ev]=1;
            edges[ev][sv]=1;
        }
        print(edges);
	}

}