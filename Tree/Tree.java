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


class Tree
{
public static TreeNode<Integer> getTree(TreeNode<Integer> root)
{
Scanner s=new Scanner(System.in);
if(root==null)
{
System.out.println("Enter the root element");
int elem=s.nextInt();
root=new TreeNode<Integer>(elem);
}
System.out.println("Enter the number of child of "+root.data);
int child=s.nextInt();
for(int i=0;i<child;i++)
{
System.out.println("Enter the "+i+" Element");
if(root.child==null)
{
root.child=new ArrayList<TreeNode<Integer>>();
}
TreeNode<Integer> t=new TreeNode<Integer>(s.nextInt());
root.child.add(t);
}
for(int i=0;i<child;i++)
{
root.child.set(i,getTree(root.child.get(i)));
}
return root;
}

public static void printTree(TreeNode<Integer> root)
{
if(root==null)
{
return ;
}
System.out.println(root.data);
if(root.child!=null)
{
for(int i=0;i<root.child.size();i++)
{
printTree(root.child.get(i));
}
}
}
public static void main(String args[])
{
TreeNode<Integer> root=null;
root=getTree(root);
printTree(root);
}
}