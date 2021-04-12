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

class EliminateConsecutiveDuplicateFromList
{

public static void printList(Node<Integer> head)
{
if(head==null)
{
return;
}
System.out.println(head.data);
printList(head.next());
}
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

public static Node<Integer> removeConsecutiveDuplicate(Node<Integer> head)  
{
Node<Integer> cur=head;
while(cur!=null)
{
while(cur.next!=null&&cur.data==cur.next.data)
{
cur.next=cur.next.next;
}
cur=cur.next;
}
return head;
}

public static Node<Integer> removeConsecutiveDuplicateRec(Node<Integer> head)
{
if(head==null)
{
return null;
}
head.next=removeConsecutiveDuplicateRec(head.next(),head.data);
return head;
}

public static Node<Integer> removeConsecutiveDuplicateRec(Node<Integer> head,int prevData)
{
if(head==null)
{
return null;
}
while(head!=null&&prevData==head.data)
{
head=head.next();
}
if(head!=null)
{
head.next=removeConsecutiveDuplicateRec(head.next,head.data);
}
return head;
}


public static void main(String[] args)
{
Node<Integer> head=null;
head=getList(head);
printList(head);
head=removeConsecutiveDuplicateRec(head);
System.out.println("The Processed LinkedList is ");
printList(head);
}
}
