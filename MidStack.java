//implement a stack where we can find its middle element and can delete that


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
count++;
if(count%2==0)
{
mid=mid.next;
}
}

public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter 1 for push 2 for pop 3 for fid mid and 4 for delete mid");
int x=s.nextInt();
MidStack s=new MidStack();
while(x!=-1)
{
if(x==1)
{
s.push();
}
}