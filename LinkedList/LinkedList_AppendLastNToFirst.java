//Append Last N node of linkedlist to first

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

public class Solution {

	public static LinkedListNode<Integer> appendLastNToFirst(LinkedListNode<Integer> head, int n) {
		//Your code goes here
        if(head==null||n==0)
        {
            return head;
        }
        LinkedListNode<Integer> temp=head;
         LinkedListNode<Integer> prev=null;
        LinkedListNode<Integer> last=null;
        int len=0;
        while(temp!=null)
        {   last=temp;
            len++;
            temp=temp.next;
        }
        temp=head;
        if(n==len)
        {
            return head;
        }
        int i=0;
        while(i<len-n)
        { prev= temp;
         temp=temp.next;   
            i++;
        }
    
     prev.next=null;
     last.next=head;   
      head=temp;
        return head;
	}

}