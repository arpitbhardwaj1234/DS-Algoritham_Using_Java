import java.util.*;
import java.lang.*;

class Node{
int color=1;
List<Integer> edges;
Node()
{
this.color=1;
this.edges=new ArrayList<Integer>();
}
}

class GraphColoring
{
 public static boolean canPaint(ArrayList<Node> nodes,int n,int m)
 {
     boolean[] visited=new boolean[n];
     Queue<Node> q=new LinkedList<Node>();
     q.add(nodes.get(0));
     for(int i=0;i<n;i++)
     {
       if(!visited[i])
	   {
       while(q.size()>0)
       {
        Node nn=q.remove();
        for(int child:nn.edges)
        {
         Node lt=nodes.get(child);
         if(lt.color==nn.color)
         {
           lt.color=lt.color+1;
           if(lt.color>=m)
          {
           return false;
           }
          }
		 
		  if(!visited[child])
		  		{    q.add(lt);
		   visited[child]=true;
		   }
          }
		  }
		  }
		  }
		  return true;
     }
 public static void main (String[] args)
    {
        int n = 4;
        int [][] graph = {{ 0, 1, 1, 1 },{ 1, 0, 1, 0 },
                          { 1, 1, 0, 1 },{ 1, 0, 1, 0 }};
     int m = 3; 

        ArrayList<Node> nodes = new ArrayList<Node>();
         
        for(int i = 0; i < n+ 1; i++)
        {
            nodes.add(new Node());
        }
         
        // Add edges to each node as per given input
      for (int i = 0; i < n; i++)
      {
         for(int j = 0; j < n; j++)
         {
             if(graph[i][j] > 0)
             {
                 // Connect the undirected graph
                  nodes.get(i).edges.add(i);
                  nodes.get(j).edges.add(j);
             }
         }
      }
       
      // Display final answer
        System.out.println(canPaint(nodes, n, m));
    }
}