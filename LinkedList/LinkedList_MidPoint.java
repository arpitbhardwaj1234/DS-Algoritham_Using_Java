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

public class LinkedList_MidPoint
{
public static Node<Integer> getList(Node<Integer> head)
{
Scanner s=new Scanner(System.in);
int x=s.nextInt();
Node<Integer> prev=null;
Node<Integer> cur=null;
if(head==null&&x!=-1)
{
head=new Node<Integer>(x);
x=s.nextInt();
prev=head;
}
else { 
if(head!=null)
{
prev=head;
while(prev.next()!=null)
{
prev=prev.next();
}
}
}
while(x!=-1)
{
cur=new Node<Integer>(x);
prev.next=cur;
prev=cur;
x=s.nextInt();
}
return head;
}

public static int getprevMidPoint(Node<Integer> head)
{
if(head==null)
{
return -1;
}
Node<Integer> slow=head;
Node<Integer> fast=head;
while(fast.next()!=null&&fast.next().next()!=null)
{
slow=slow.next();
fast=fast.next().next();
}
return slow.data;
}

public static int getafterMidPoint(Node<Integer> head)
{
if(head==null)
{
return -1;
}
Node<Integer> slow=head;
Node<Integer> fast=head;
while(fast.next()!=null)
{
slow=slow.next();
if(fast.next().next()!=null)
{
fast=fast.next().next();
}
else
{
fast=fast.next();
}
}
return slow.data;
}


public static void main(String args[])
{
Node<Integer> head=null;
head=getList(head);
System.out.println("The mid point of list is "+getprevMidPoint(head));
System.out.println("The mid point of list is "+getafterMidPoint(head));
}
}