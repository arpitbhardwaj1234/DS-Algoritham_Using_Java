import java.util.*;
import java.lang.*;
//To detect cycle in graph

class UnionFindAlgo {
    public int find(int x,int[] parent)
    {
        System.out.println(" Find "+x);
        while(parent[x]!=0)
        {
            x=parent[x];
        }
        return x;
    }
    public void print(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
        System.out.print(arr[i]+" ");
        }
    }
    
    public int[] findRedundantConnection(int[][] edges) {
        if(edges.length==0||edges.length==1)
        {
            return null;
        }
        int[] parent=new int[edges.length+2];
        for(int i=0;i<edges.length;i++)
        {
            int src=edges[i][0];
            int dest=edges[i][1];
            int parentsrc=find(src,parent);
            int parentdest=find(dest,parent);
            if(parentsrc==parentdest)
            {
                return edges[i];
            }
            parent[parentsrc]=parentdest;
        }
        return null;
        
    }
    
}