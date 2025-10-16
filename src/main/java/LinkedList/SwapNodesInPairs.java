package LinkedList;

public class SwapNodesInPairs {
    //leetcode 24
    ListNode head;
    class ListNode {
        int val;
      ListNode next;

        public ListNode(int val) {
            this.val = val;
            next = null;
        }
    }
    public ListNode swapPairs(ListNode head) {
        //check if there is only one node in linkedlist then no pint if changing or swapping nodes
        if(head==null || head.next==null){
            return head;
        }
        ListNode first=head;
        ListNode second=head.next;
        ListNode prev=null;
        while(first!=null && second!=null){
           ListNode third=second.next;
           second.next=first;
           first.next=third;
           if(prev!=null){
               prev.next=second;
           }
           else{
               head=second;
           }
           //updating of prev,first and second
            prev=first;
           first=third;
           if(third!=null){
               second=third.next;
           }
           else{
               second=null;
           }
        }
        return head;
    }
}
