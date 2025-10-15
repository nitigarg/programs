package FastAndSlowPointerPatterns;

public class ReturnStartOfCycle {
    //leetcode 142
    public ListNode detectCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){//when cycle is detected
                slow=head;//reintialize slow to head to find starting point
                while(slow!=fast){//run the loop until we find slow=fast condition
                    slow=slow.next;
                    fast=fast.next;
                }
                return slow;
            }
        }
        return null;
    }
}
