public class IntersectionOf2List {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode resulthead=null;
        ListNode resulttell=null;
        HashSet<Integer> set=new HashSet<Integer>();
        while(headA!=null)
        {
            set.add(headA.val);
            headA=headA.next;  
        }
        while(headB !=null)
        {
            if(set.contains(headB.val))
            {
                ListNode temp=new ListNode(headB.val);
                if(resulthead==null)
                {
                    resulthead=temp;
                    resulttell=temp;
                }
                else
                {
                    resulttell.next=temp;
                    resulttell=resulttell.next;
                }
            }
            headB=headB.next;
            
        }
        return resulthead;
    }
}