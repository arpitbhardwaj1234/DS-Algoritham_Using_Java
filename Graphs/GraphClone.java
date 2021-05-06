/*
Given a reference of a node in a connected undirected graph.

Return a deep copy (clone) of the graph.

Each node in the graph contains a value (int) and a list (List[Node]) of its neighbors.

class Node {
    public int val;
    public List<Node> neighbors;
} */
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class GraphClone {
    public Node cloneGraph(Node node) {
        if(node==null)
        {
            return null;
        }
         Queue<Node> q
            = new LinkedList<Node>();
        HashMap<Node,Node> map=new HashMap<Node,Node>();
         Node nn=new Node(node.val);
        map.put(node,nn);
        q.add(node);
        Node newGraph=nn;
        while(q.size()!=0)
        {
            Node temp=q.remove();
            newGraph=map.get(temp);
            Iterator<Node> itr=temp.neighbors.iterator();
            while(itr.hasNext())
            {
                Node x=itr.next();
                Node xu=map.get(x); 
                if(xu==null)
                {
                    xu=new Node(x.val);
                    map.put(x,xu);
                     q.add(x);
                }
                 newGraph.neighbors.add(xu);
               
            }
            
        }
        return nn;
        
    }
}