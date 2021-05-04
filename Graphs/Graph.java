//Class Graph implemetation using Adjacancy LinkedList
import java.util.*;
import java.lang.*;


class Graph
{
int V;
List<LinkedList<Integer>> adj;
Graph(int V)
{
this.V=V;
adj=new ArrayList<LinkedList<Integer>>();
for(int i=0;i<V;i++)
{
adj.add(new LinkedList<Integer>());
}
System.out.println("The size of adj is "+adj.size());
}

void addEdge(int u,int v)
{
adj.get(u).add(v);
adj.get(v).add(u);
}

void printDFS()
{
boolean[] visited=new boolean[V];
for(int i=0;i<visited.length;i++)
{
if(visited[i]==false)
{
printDFSHalper(i,visited);
}
}
}

public void printDFSHalper(int index,boolean[] visited)
{
System.out.println(index);
visited[index]=true;
for(int i=0;i<adj.get(index).size();i++)
{
if(visited[adj.get(index).get(i)]==false)
{
printDFSHalper(adj.get(index).get(i),visited);
}
}
}
public static void main(String[] args)
{
System.out.println("Enter the size of graph");
Scanner s=new Scanner(System.in);
Graph g=new Graph(s.nextInt());
int n=0;
System.out.println("Enter the number of edges");
n=s.nextInt();
for(int i=0;i<n;i++)
{
int u=s.nextInt();
int v=s.nextInt();
g.addEdge(u,v);
}
g.printDFS();
}
}

