//code to check if The Graph has a path between given to vertices

import java.util.LinkedList;
import java.util.Queue;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;
public class HasPath {
    public static boolean checkPath(int[][] edges,int v1,int v2)
    { 
        boolean[] visited=new boolean[edges.length];
       return  checkPath(edges ,v1,v2,visited);
        
    }
     public static boolean checkPath(int[][] edges,int v1,int v2,boolean[] visited)
     {
         if(v1==v2)
         {
             return true;
         }
         visited[v1]=true;
         boolean isPath=false;
         for(int i=0;i<edges[v1].length;i++)
         {
             if(v2==i&&edges[v1][i]==1)
             {
                 return true;
             }
             if(edges[v1][i]==1&&visited[i]==false)
             {
                 isPath=isPath||checkPath(edges,i,v2,visited);
             }
         }
         return isPath;
         
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
        int v1=s.nextInt();
        int v2=s.nextInt();
         System.out.println(checkPath(edges ,v1,v2));
	}

}