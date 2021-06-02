import java.util.*;
import java.lang.*;


class TransitiveClouser
{
int V;
List<List<Integer>> adj;
int[][] tc;
TransitiveClouser(int V)
{
this.V=V;
this.adj=new ArrayList<List<Integer>>();
for(int i=0;i<V;i++)
{
List<Integer> arr=new ArrayList<Integer>();
adj.add(arr);
}
}
public void getClouser()
{
tc=new int[V][V];
//boolean[] visited=new boolean[V];
for(int i=0;i<V;i++)
{
BFS(i);
}
for(int i=0;i<V;i++)
{
System.out.println(Arrays.toString(tc[i]));
}
}

public void BFS(int sv)
{
boolean[] visited=new boolean[V];
ArrayList<Integer> q=new ArrayList<Integer>();
q.add(sv);
while(q.size()!=0)
{
int x=q.remove(0);
visited[x]=true;
tc[sv][x]=1;
for(int temp:adj.get(x))
{
if(!visited[temp])
{
q.add(temp);
}
}
}
}



public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the number of vertices");
TransitiveClouser t=new TransitiveClouser(s.nextInt());
System.out.println("Enter the number of edges");
int e=s.nextInt();
for(int i=0;i<e;i++)
{
int u= s.nextInt();
int v=s.nextInt();
t.adj.get(u).add(v);
}
t.getClouser();
}
}