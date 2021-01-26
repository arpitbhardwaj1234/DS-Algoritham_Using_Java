import java.util.ArrayList;
import java.util.Iterator;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;
public class GetPathDFS {
    public static ArrayList<Integer> getPath(int[][] edges,int v1,int v2)
    {
        boolean[] visited=new boolean[edges[0].length];
        return getPath(edges,v1,v2,visited);
    }
    
     public static ArrayList<Integer> getPath(int[][] edges,int v1,int v2,boolean[] visited)
     {
         visited[v1]=true;
     if(v1==v2)
     {
         
         ArrayList<Integer> arr=new ArrayList<Integer>();
         arr.add(v1);
         return arr;
     }
         
    else
    {
       int i=0;
        for(i=0;i<edges.length;i++)
        {
            if(edges[v1][i]==1&&visited[i]!=true)
            {
                ArrayList<Integer> arr=getPath(edges,i,v2,visited);
                if(arr!=null)
                {
                    arr.add(v1);
                    return arr;
                }
            }
        }
        return null;
             
    }
     
     }
	
	public static void main(String[] args)  throws NumberFormatException, IOException{        
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
        ArrayList<Integer> arr=getPath(edges,v1,v2);
        if(arr!=null)
        {
            Iterator itr=arr.iterator();
            while(itr.hasNext())
            {
                System.out.print(itr.next()+" ");
            }
        }
	}
}