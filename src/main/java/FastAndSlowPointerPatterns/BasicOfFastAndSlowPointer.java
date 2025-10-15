package FastAndSlowPointerPatterns;

public class BasicOfFastAndSlowPointer {
    //leetcode 141 detect cycle in linkedlist
    //basic idea behind this pattern is that we will have one fast and other slow pointer
    //slow will move by one step and fast will move by two step
    //if slow and fast are equal at some point then we have found a cycle
    public boolean hasCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        //fast!=null is taking care of even linkedlist and fats.next!=null is taking care of odd linkedlist
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

            if(slow==fast){
                //cycle detected
                return true;
            }
        }
        return false;
    }
}
class ListNode{
    ListNode next;
    int val;
    ListNode(int x){
        this.val=x;
        next=null;
    }
}
