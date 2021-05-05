//Get all connected component of graph

import java.io.*;
import java.util.*;
//Strongly Connected Components

class Graph
{
int V;
List<LinkedList<Integer>> adj;
Graph(int v)
{
this.V=v;
adj=new ArrayList<LinkedList<Integer>>();;
for(int i=0;i<V;i++)
{
LinkedList<Integer> l=new LinkedList<Integer>();
adj.add(l);
}
}

public void addEdge(int u,int v)
{
adj.get(u).add(v);
}

public void addInOrder(int index,boolean[] visited,Stack<Integer> s)
{
visited[index]=true;
Iterator<Integer> itr=adj.get(index).iterator();
while(itr.hasNext())
{
int x=itr.next();
if(!visited[x])
{
addInOrder(x,visited,s);
}
}
s.push(index);
}

public Graph transpot()
{
Graph g=new Graph(V);
for(int i=0;i<V;i++)
{
Iterator<Integer> itr=adj.get(i).iterator();
while(itr.hasNext())
{
int x=itr.next();
g.adj.get(x).add(i);
}
}
return g;
}

public void printDFS(int index,boolean[] visited)
{
visited[index]=true;
System.out.print(index+"  ");
Iterator<Integer>  itr=adj.get(index).iterator();
while(itr.hasNext())
{
int x=itr.next();
if(!visited[x])
{
printDFS(x,visited);
}
}
}

public void findAllConnectedComponent()
{
Stack<Integer> s=new Stack<Integer>();
boolean[] visited=new boolean[V];
for(int i=0;i<V;i++)
{
if(!visited[i])
addInOrder(i,visited,s);
}
Graph gr=transpot();
for(int i=0;i<visited.length;i++)
{
visited[i]=false;
}
while(s.empty()==false)
{
int x=s.pop();
if(!visited[x])
{
gr.printDFS(x,visited);
System.out.println();
}
}
}

public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the size of graph");
Graph g=new Graph(s.nextInt());
System.out.println("Enter the number of edges");
int n=s.nextInt();
for(int i=0;i<n;i++)
{
int u=s.nextInt();
int v=s.nextInt();
g.addEdge(u,v);
}
g.findAllConnectedComponent();
}
}