import java.util.*;


class DFSTraversal
{
public static void printHalper(int[][] edges,int sv,boolean[] visited)
{
System.out.println(sv);
visited[sv]=true;

int i,j;
for(i=0;i<edges[sv].length;i++)
{
if(edges[sv][i]==1&&visited[i]==false)
{
printHalper(edges,i,visited);
}
}
}
public static void print(int[][] edges)
{
boolean[] visited=new boolean[edges.length];
for(int i=0;i<visited.length;i++)
{
int sv=i;
if(!visited[sv])
{
printHalper(edges,sv,visited);
}
}
}
  

public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int i,j;
System.out.println("Enter the number of vertices");
int n=s.nextInt();
int[][] edges=new int[n][n];
System.out.println("Enter the number of edges");
int e=s.nextInt();
for(j=0;j<e;j++)
{
int sv=s.nextInt();
int ev=s.nextInt();
edges[sv][ev]=1;
edges[ev][sv]=1;
}
print(edges);
}
}

