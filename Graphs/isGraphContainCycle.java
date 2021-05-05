//Class Graph implemetation using Adjacancy LinkedList to check if graph contain cycle
import java.util.*;
import java.lang.*;


class isGraphContainCycle
{
int V;
List<LinkedList<Integer>> adj;
isGraphContainCycle(int V)
{
this.V=V;
adj=new ArrayList<LinkedList<Integer>>();
for(int i=0;i<V;i++)
{
adj.add(new LinkedList<Integer>());
}
System.out.println("The size of adj is "+adj.size());
}

boolean isContainCycle()
{
boolean visited[]=new boolean[V];
boolean res;
for(int i=0;i<V;i++)
{
if(visited[i]!=true)
{
res=checkCycle(i,visited, -1);
if(res)
return res;
}
}
return false;
}

boolean checkCycle(int index,boolean[] visited,int parent)
{
visited[index]=true;
Iterator<Integer> itr=adj.get(index).iterator(); 
while(itr.hasNext())
{
int x=itr.next();
if(!visited[x])
{
if(checkCycle(x,visited,index))
{
return true;
}
}
else if(x!=parent)
{
return true;
}
}
return false;
}

void addEdge(int u,int v)
{
adj.get(u).add(v);
adj.get(v).add(u);
}

public static void main(String[] args)
{
System.out.println("Enter the size of graph");
Scanner s=new Scanner(System.in);
isGraphContainCycle g=new isGraphContainCycle(s.nextInt());
int n=0;
System.out.println("Enter the number of edges");
n=s.nextInt();
for(int i=0;i<n;i++)
{
int u=s.nextInt();
int v=s.nextInt();
g.addEdge(u,v);
}
System.out.println("Does Graph contain cycle :"+g.isContainCycle());
}
}

