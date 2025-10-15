package LinkedList;

public class ReverseList {
    //leetcode problem 206
    ListNode head;
    class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
            next = null;
        }
    }
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode prevNode=head;
        ListNode currentNode=head.next;
        while(currentNode!=null){
            ListNode nextNode=currentNode.next;
            currentNode.next=prevNode;
            prevNode=currentNode;
            currentNode=nextNode;
        }
        head.next=null;
        head=prevNode;
        return head;
    }
}
