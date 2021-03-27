import java.util.*;
import java.lang.*;


class Node<T>
{
T data;
Node<T> next;
Node(T data)
{
this.data=data;
this.next=null;
}
public Node<T> next()
{
return this.next;
}
}

public class LinkedList
{
public static void printList(Node<Integer> head)
{
if(head==null)
{
return;
}
while(head!=null)
{
System.out.println(head.data);
head=head.next();
}
}

public static void main(String args[])
{
Node<Integer> head=new Node<Integer>(5);
Node<Integer> n1=new Node<Integer>(6);
Node<Integer> n2=new Node<Integer>(7);
head.next=n1;
n1.next=n2;
printList(head);
}
}
