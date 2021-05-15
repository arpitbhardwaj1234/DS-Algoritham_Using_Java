import java.util.*;

class FindKCores
{
int V;
List<List<Integer>> adj;        
FindKCores(int V)
{
this.V= V;
this.adj = new ArrayList<List<Integer>>();
for (int i = 0; i < V; i++)
adj.add(new ArrayList<Integer>());
}
public void addEdge(int u,int v)
{
adj.get(u).add(v);
adj.get(v).add(u);
}

public void printKCores(int k)
{
boolean[] visited=new boolean[V];
int[] degree=new int[V];
for(int i=0;i<V;i++)
{
degree[i]=adj.get(i).size();
}
int minDegree=Integer.MAX_VALUE;
int index=-1;
for(int i=0;i<V;i++)
{
if(minDegree>degree[i])
{
minDegree=degree[i];
index=i;
}
}
DFS(index,visited,k,degree);
for(int i=0;i<visited.length;i++)
{
if(!visited[i])
{
DFS(i,visited,k,degree);
}
}
for(int i=0;i<visited.length;i++)
{
if(degree[i]>=k)
{
System.out.println();
System.out.print("["+i+"]");
for( int j:adj.get(i))
{
if(degree[j]>=k)
System.out.print(" -> "+j);
}
}
}
}

public void DFS(int index,boolean[] visited,int k,int[] degree)
{
visited[index]=true;
if(degree[index]<k)
{
degree[index]--;
for(int x:adj.get(index))
{
degree[x]--;
if(!visited[x])
{
DFS(x,visited,k,degree);
}
}
}
}
public static void main(String[] args)
{
 int k = 3;
        FindKCores g1 = new FindKCores(9);
        g1.addEdge(0, 1);
        g1.addEdge(0, 2);
        g1.addEdge(1, 2);
        g1.addEdge(1, 5);
        g1.addEdge(2, 3);
        g1.addEdge(2, 4);
        g1.addEdge(2, 5);
        g1.addEdge(2, 6);
        g1.addEdge(3, 4);
        g1.addEdge(3, 6);
        g1.addEdge(3, 7);
        g1.addEdge(4, 6);
        g1.addEdge(4, 7);
        g1.addEdge(5, 6);
        g1.addEdge(5, 8);
        g1.addEdge(6, 7);
        g1.addEdge(6, 8);
        g1.printKCores(k);
}
}