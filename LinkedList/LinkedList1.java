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
class LinkedList1
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

public static void printList(Node<Integer> head)
{
if(head==null)
{
return;
}
System.out.println(head.data);
printList(head.next());
}

public static int getSize(Node<Integer> head)
{
if(head==null)
{
return 0;
}
int len=0;
while(head!=null)
{
len++;
head=head.next();
}
return len;
}
public static int getSizeRecur(Node<Integer> head)
{
if(head==null)
{
return 0;
}
return 1+getSizeRecur(head.next());
}

public static void add(Node<Integer> head,int index,int num)
{
if(head==null)
{
head=new Node<Integer>(num);
return;
}
int len=0;
Node<Integer> prev=head;
while(head.next()!=null&&len<index)
{
prev=head;
len++;
head=head.next();
}
if(len==index)
{
Node<Integer> n=new Node<Integer>(num);
n.next=head;
prev.next=n;
}
else
{
Node<Integer> n=new Node<Integer>(num);
head.next=n;
}
}

public static Node<Integer> delete(Node<Integer> head,int index)
{
if(head==null)
{
return null;
}
if(head!=null&&head.next()==null)
{
return null;
}

if(index==0)
{
return head.next();
}
head.next=delete(head.next(),index-1);
return head;
}

public static Node<Integer> insertRecur(Node<Integer> head,int num,int pos)
{
if(head==null||pos==0)
{
Node<Integer> n=new Node<Integer>(pos);
n.next=head;
return n;
}
head.next=insertRecur(head,num,pos-1);
return head;
}



public static void main(String args[])
{
Node<Integer> head=null;
head=getList(head);
printList(head);
head=getList(head);
System.out.println("Linked List after insertion");
printList(head);
System.out.println("The length of the node is "+getSize(head));
printList(head);
System.out.println("The length of the node is recursively "+getSizeRecur(head));
add(head,4,-15);//Add 3 at 2nd index of list
//printList(head);
head=delete(head,3);
printList(head);
}
} 