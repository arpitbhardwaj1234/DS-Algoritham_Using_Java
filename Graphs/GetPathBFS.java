import java.util.ArrayList;
import java.util.Iterator;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;
public class GetPathBFS {
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
          ArrayList<Integer> arr=new ArrayList<Integer>();
             int map[]=new int[edges.length];
  
   
       
        arr.add(v1);
    first:    while(arr.size()!=0)
        {   int v_temp=arr.remove(0);
            for(int i=0;i<edges.length;i++)
            {
                if(edges[v_temp][i]==1&&visited[i]==false)
                {   visited[i]=true;
                    arr.add(i);
                    map[i]=v_temp;
                    if(i==v2)
                    {
                        break first;
                    }
                }
            }
          
        }
    
        if(arr==null||arr.size()==0)
        {
            return null;
        }
        else
        {
            int res=arr.get(arr.size()-1);
            ArrayList<Integer> result=new ArrayList<Integer>();
            result.add(res);
        while(res!=v1)
        {
            res=map[res];
                result.add(res);
        }
       return result;     
             
    }
    
     
     }
	
	public static void main(String[] args)  throws NumberFormatException, IOException{
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