import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;

public class CheckConnected {
    
    public static boolean isConnected(int[][] edges)
    {
        boolean[] visited=new boolean[edges.length];
        traverse(edges,visited,0);
        boolean res=true;
        for(int i=0;i<edges.length;i++)
        {
            res=res&&visited[i];
        }
        return res;
    }
public static void traverse(int[][] edges,boolean[] visited,int sv)
{
    visited[sv]=true;
    for(int i=0;i<edges.length;i++)
    {
        if(edges[sv][i]==1&&visited[i]==false)
        {
            traverse(edges,visited,i);
        }
    }
}
	public static void main(String[] args) throws NumberFormatException, IOException {
        
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
        if(n==1||n==0)
        {
            System.out.println(true);
            return;
        }
        System.out.println(isConnected(edges));
	}

}