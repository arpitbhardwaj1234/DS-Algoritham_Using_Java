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



public class MergeSortLL {

    public static LinkedListNode<Integer> getMid(LinkedListNode<Integer> head)
    {
        LinkedListNode<Integer> slow=head;
        LinkedListNode<Integer> fast=head;
        while(fast!=null&&fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    
	public static LinkedListNode<Integer> mergeSort(LinkedListNode<Integer> head) {
		//Your code goes here
        if(head==null||head.next==null)
        {
            return head;
        }
        LinkedListNode<Integer> mid=getMid(head);
        LinkedListNode<Integer> temp=head;
        while(temp.next!=mid)
        {
            temp=temp.next;
        }
        temp.next=null;
        LinkedListNode<Integer> l1=mergeSort(head);
        LinkedListNode<Integer> l2=mergeSort(mid);
        return merge(l1,l2);
	}
    
    public static LinkedListNode<Integer> merge(LinkedListNode<Integer> l1,LinkedListNode<Integer> l2)
    {
        LinkedListNode<Integer> head=null;
        LinkedListNode<Integer> tell=null;
        while(l1!=null&&l2!=null)
        {
            if(l1.data<l2.data)
            {
                if(head==null)
                {
                    head=l1;
                    tell=head;
                    
                }
                else
                {
                    tell.next=l1;
                    tell=tell.next;
                }
                l1=l1.next;
                tell.next=null;
            }
            else
            {
                if(head==null)
                {
                    head=l2;
                    tell=head;
                    
                }
                else
                {
                    tell.next=l2;
                    tell=tell.next;
                }
                 l2=l2.next;
                tell.next=null;
            }
        }
        if(l1!=null)
        {
            tell.next=l1;
        }
        if(l2!=null)
        {
            tell.next=l2;
        }
            
        return head;
    }
    
    

}