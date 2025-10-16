package LinkedList;

public class MiddleNodeOfLinkedList {
    //leetcode 876
    ListNode head;
    class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
            next = null;
        }
    }
    public ListNode middleNode(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null ){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}
