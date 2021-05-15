//DFS Using Adjacancy list;
import java.util.*;

class DFSUsingAdjList
{
int V;
List<List<Integer>> adj;
DFSUsingAdjList(int v)
{
this.V=v;
adj=new ArrayList<List<Integer>>();
for(int i=0;i<v;i++)
{
ArrayList<Integer> arr=new ArrayList<Integer>();
adj.add(arr);
}
}
public void addEdge(int u,int v)
{
adj.get(u).add(v);
adj.get(v).add(u);
}

public void DFS()
{
boolean[] visited=new boolean[V];
for(int i=0;i<V;i++)
{
if(!visited[i])
{
DFS(i,visited);
}
}
}

public void DFS(int index,boolean[] visited)
{
System.out.print(index+" ");
visited[index]=true;
for(int x:adj.get(index))
{
if(!visited[x])
{
DFS(x,visited);
}
}
}

public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the number of edges");
DFSUsingAdjList g=new DFSUsingAdjList(s.nextInt());
System.out.println("Enter no of edges");
int e=s.nextInt();
for(int i=0;i<e;i++)
{
int u=s.nextInt();
int v=s.nextInt();
g.addEdge(u,v);
}
g.DFS();
}
}

