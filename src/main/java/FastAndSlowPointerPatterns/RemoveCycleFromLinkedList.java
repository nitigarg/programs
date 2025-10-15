package FastAndSlowPointerPatterns;

public class RemoveCycleFromLinkedList {
    public void removeCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

            if(slow==fast){
                slow=head;
                //case if cycle starts at head
                if(slow==fast){
                    //move fast to last node in cycle
                    while(fast.next!=slow){
                        fast=fast.next;
                    }
                    fast.next=null;
                    return;
                }
                //case when cycle does not starts at head

                ListNode prev=null;
                while(slow!=fast){
                    slow=slow.next;
                    prev=fast;
                    fast=fast.next;
                }
                prev.next=null;
                return;
            }
        }
    }
}
