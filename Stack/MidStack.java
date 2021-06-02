//implement a stack where we can find its middle element and can delete that

import java.util.*;

class Node
{
int data;
Node prev;
Node next;
}

class MidStack
{
Node head;
Node mid;
int count=0;

public int popMid()
{
if(head==null)
{
return -1;
}
if(head==mid)
{
int x=head.data;
head=null;
mid=null;
count=0;
return x;
}
count--;
int x=mid.data;
Node prev=mid.prev;
prev.next=mid.next;
Node next=mid.next;
mid=prev;
if(next!=null)
{
next.prev=prev;
}
return x;
}

public void print()
{
Node temp=head;
while(temp!=null)
{
System.out.println(temp.data);
temp=temp.next;
}
}


public int pop()
{
if(head==null)
{
return -1;
}
if(head.next==null)
{
int x=head.data;
head=null;
mid=null;
count=0;
return x;
}
int x=head.data;
head=head.next;
head.prev=null;
count--;
if(count%2==0)
{
mid=mid.next;
}
return x;
}
public void push()
{
System.out.println("Enter the value");
Scanner s=new Scanner(System.in);
if(head==null)
{
head=new Node();
head.data=s.nextInt();
mid=head;
count++;
}
else 
{
Node n=new Node();
n.data=s.nextInt();
n.next=head;
head.prev=n;
head=n;
count++;
if(count%2!=0)
{
mid=mid.prev;
}
System.out.println(mid.data);
}
}
public static void main(String args[])
{
Scanner ss=new Scanner(System.in);
System.out.println("Enter 1 for push 2 for pop 3 for fid mid and 4 for delete mid");
int x=ss.nextInt();
MidStack s=new MidStack();
while(x!=-1)
{
if(x==1)
{
s.push();
}
else if(x==2)
{
s.pop();
}
else if(x==3)
{
if(s.mid!=null)
{
System.out.println(s.mid.data);
}
}
else if(x==4)
{
s.popMid();
}
else 
{
s.print();
}

System.out.println("Enter the choice");
x=ss.nextInt();
}
}
}