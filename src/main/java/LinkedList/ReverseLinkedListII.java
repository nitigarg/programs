package LinkedList;

public class ReverseLinkedListII {
    //leetcode 92
    ListNode head;
    class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
            next = null;
        }
    }

        public ListNode reverseBetween(ListNode head, int left, int right) {
            if(head==null || head.next==null||left==right){
                return head;
            }
            ListNode dummy=new ListNode(0);
            dummy.next=head;
            ListNode beforeLeftNode=dummy;
            for(int i=1;i<left;i++){
                beforeLeftNode=beforeLeftNode.next;
            }
            ListNode leftNode=beforeLeftNode.next;
            //at this point we have previous of leftNode and starting left node
            ListNode currentNode=leftNode;
            ListNode prev=null;
            for(int i=left;i<=right;i++){
                ListNode nextNode=currentNode.next;
                currentNode.next=prev;
                prev=currentNode;
                currentNode=nextNode;
            }
            //reconnect
            beforeLeftNode.next=prev;
            leftNode.next=currentNode;
            return dummy.next;
        }
    }


