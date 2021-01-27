//delete a node from the linkedList for the given position
/*

	Following is the Node class already written for the Linked List

	class LinkedListNode<T> {
    	T data;
    	LinkedListNode<T> next;
    
    	public LinkedListNode(T data) {
        	this.data = data;
    	}
	}

*/

public class LinkedList_delete_node {

	public static LinkedListNode<Integer> deleteNode(LinkedListNode<Integer> head, int pos) {
		//Your code goes here
       if(head==null)
       {
           return head;
       }
       if(pos==0)
       {
           head=head.next;
           return head;
       }
        LinkedListNode<Integer> prev=null;
        int count=0;
        LinkedListNode<Integer> cur=head;
        while(cur!=null&&count<pos)
        {
            prev=cur;
            cur=cur.next;
            count++;
        }
        if(cur!=null)
        {
            prev.next=cur.next;
        }
        return head;
	}
}