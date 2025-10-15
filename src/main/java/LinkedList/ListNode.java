package LinkedList;

public class ListNode {
    Node head;
    class Node{
        int val;
        Node next;
        public Node(int val){
            this.val=val;
            next=null;
        }
    }
    //addFirst for adding node at start
    public void addFirst(int val){
        //create new node which we want to add at first
        Node newNode=new Node(val);
        //always check if head is null and there are no nodes in list
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    //add at last
    public void addLast(int val){
        Node newNode=new Node(val);
        if(head==null){
            head=newNode;
            return;
        }
        Node currentNode=head;
        while(currentNode.next!=null){
            currentNode=currentNode.next;
        }
        currentNode.next=newNode;
    }
    //print list
    public void print(){
        if (head==null){
            System.out.println("List is empty");
            return;
        }
        Node currentNode=head;
        while(currentNode!=null){
            System.out.print(currentNode.val+"->");
            currentNode=currentNode.next;
        }
        System.out.print("Null");
    }

    //delete First
    public void deleteFirst(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        head=head.next;
    }
    //delete last
    public void deleteLast(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node currentNode=head;
        if(head.next==null){
            head=null;
            return;
        }
        while(currentNode.next.next!=null){
            currentNode=currentNode.next;
        }
        currentNode.next=null;
    }
    public static void main(String[] args) {
        ListNode list=new ListNode();
        list.addFirst(2);
        list.addFirst(1);
        //list.print();
        list.addLast(3);
        list.print();
    }
}
