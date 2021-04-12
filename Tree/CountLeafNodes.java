import java.util.*;
import java.lang.*;

class TreeNode<T>
{
T data;
ArrayList<TreeNode<T>> child;
TreeNode(T data)
{
this.data=data;
child=null;
}
}

class CountLeafNodes
{
public static TreeNode<Integer> getBFSTree(TreeNode<Integer> root)
{
Scanner s=new Scanner(System.in);
if(root==null)
{
System.out.println("Enter the root element");
root=new TreeNode<Integer>(s.nextInt());
}
Queue<TreeNode<Integer>> q= new LinkedList<>();
q.add(root);
while(q.size()!=0)
{
TreeNode<Integer> head=q.remove();
System.out.println("Enter the number of child of "+head.data);
int child=s.nextInt();
for(int i=0;i<child;i++)
{
System.out.println("Enter the "+(i+1)+" Element");
if(head.child==null)
{
head.child=new ArrayList<TreeNode<Integer>>();
}
TreeNode<Integer> t=new TreeNode<Integer>(s.nextInt());
head.child.add(t);
q.add(t);
}
}
return root;
}

public static void printBFSTree(TreeNode<Integer> root)
{
if(root==null)
{
return;
}
Queue<TreeNode<Integer>> q= new LinkedList<>();
q.add(root);
q.add(null);
System.out.println(root.data);
while(q.size()!=1)
{
TreeNode<Integer> head=q.remove();
if(head==null)
{
System.out.println();
q.add(null);
}
else
{
if(head.child!=null)
{
for(int i=0;i<head.child.size();i++)
{
q.add(head.child.get(i));
System.out.print(head.child.get(i).data+" ");
}
}
}
}
}
public static int countLeafNodes(TreeNode<Integer> root)
{
if(root==null)
{
return 0;
}
int count=0;
if(root.child==null)
{
return 1;
}
for(int i=0;i<root.child.size();i++)
{
count+=countLeafNodes(root.child.get(i));
}
return count;
}

public static void main(String args[])
{
TreeNode<Integer> root=null;
root=getBFSTree(root);
printBFSTree(root);
System.out.println("The leaf nodes are "+countLeafNodes(root));
}
}