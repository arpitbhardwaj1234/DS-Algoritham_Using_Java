//Check if a linkedList is palindrome

import java.util.*;

class Palindrome
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
public static Node<Integer> findMidPoint(Node<Integer> head)
{
if(head==null)
{
return null;
}
Node<Integer> slow=head;
Node<Integer> fast=head;
while(fast!=null&&fast.next()!=null)
{
slow=slow.next();
if(fast.next()!=null)
{
fast=fast.next().next();
}
else
{
fast=fast.next();
}
}
return slow;
}
 


public static boolean checkPalindromeOptimized(Node<Integer> head)
{
//FirstFind Mid Point 
//Then reverse the hlaf list and compare
//Then again reverse 
//And attach to start 
if(head==null||head.next()==null)
{
return true;
}
Node<Integer> mid=findMidPoint(head);
Node<Integer> prev=head;
while(prev.next()!=mid)
{
prev=prev.next();
}
System.out.println(prev.data);
prev.next=null;
Node<Integer> rmid=reverse(mid);
while(head!=null&&head.data==rmid.data)
{
head=head.next();
rmid=rmid.next();
}

public static Node<Integer> reverse(Node<Integer> head)
{
Node<Integer> prev=null;
Node<Integer> cur=head;
while(cur!=null)
{
Node<Integer> temp=cur.next();
cur.next=prev;
prev=cur;
cur=temp;
}
return prev;
}
public static boolean checkPalindrome(Node<Integer> head)
{

if(head==null||head.next==null)
{
return true;
}
else
{
Stack<Integer> s=new Stack<Integer>();
Node<Integer> prev=head;
while(prev!=null)
{
s.push(prev.data);
prev=prev.next();
}
Node<Integer> cur=head;
while(cur!=null)
{
int x=s.pop();
if(cur.data==x)
cur=cur.next();
else 
return false;
}
}
return true;
}

public static void main(String[] args)
{
Node<Integer> head=null;
head=getList(head);
printList(head);
System.out.println("is LinkedList palindrome "+checkPalindrome(head));
System.out.println(findMidPoint(head).data);
System.out.println(checkPalindromeOptimized(head));
}
}
