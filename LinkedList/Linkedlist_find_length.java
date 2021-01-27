//Find the length of given LinkedList
/*

 	Following is the Node class already written for the Linked List

	class LinkedListNode<T> {
		T data;
		LinkedListNode<T> next;

		public Node(T data) {
			this.data = data;
		}
	}

*/


public class Linkedlist_find_length {

	public static int length(LinkedListNode<Integer> head){
		int l = 0;
        if(head == null )
          	l = 0;
        else{
        while(head.next != null){
            head = head.next;
            l++;
        }
        l++;
        }
        return l;
        
	}
 
}