//Find a Mother Vartex
import java.util.*;


class FindMotherVartex{    
static void addEdge(int u, int v,
 ArrayList<ArrayList<Integer>> adj)
{
    adj.get(u).add(v);
}

public static int motherVertex(ArrayList<ArrayList<Integer>> adj,int V)
{
boolean[] visited=new boolean[V];
int x=-1;
for(int i=0;i<V;i++)
{
if(!visited[i])
{
DFS(i,visited,adj);
x=i;
}
}
boolean check[]=new boolean[V];
DFS(x,check,adj);
for(int i=0;i<check.length;i++)
{
if(!check[i])
{
return -1;
}
}
return x;
}

static void DFS(int index , boolean[] visited,ArrayList<ArrayList<Integer>> adj)
{
//System.out.print(index+" ");
visited[index]=true;
for(int x:adj.get(index))
{
if(!visited[x])
{
DFS(x,visited,adj);
}
}
}

public static void main(String[] args)
 {
    int V = 7;
    int E = 8;
     
    ArrayList<
    ArrayList<Integer>> adj = new ArrayList<
                                  ArrayList<Integer>>();
    for(int i = 0; i < V; i++)
    {
        adj.add(new ArrayList<Integer>());
    }
    addEdge(0, 1,adj);
    addEdge(0, 2,adj);
    addEdge(1, 3,adj);
    addEdge(4, 1,adj);
    addEdge(6, 4,adj);
    addEdge(5, 6,adj);
    addEdge(5, 2,adj);
    addEdge(6, 0,adj);
     
    System.out.println("The mother vertex is " +
                        motherVertex(adj, V));
}
}
