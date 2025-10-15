package LinkedList;

public class ReverseLinkedList {
    Node head;

    class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
            next=null;
        }
    }
    //Reverse Linked List
    public void reverse(){
        if(head==null || head.next==null){
            return;
        }
        Node prevNode=head;
        Node currentNode=head.next;
        while(currentNode!=null){
            Node nextNode=currentNode.next;
            currentNode.next=prevNode;
            //update all three
            prevNode=currentNode;
            currentNode=nextNode;
        }
        head.next=null;
        head=prevNode;
    }
}
