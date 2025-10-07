package PrepareForInterview;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {
    int limit;
    Node head;
    Node tail;
    Map<Integer,Node> map;
    class Node{
        Node prev, next;
        int key;
        int value;
        Node(int key, int value){
            this.key=key;
            this.value=value;
            prev=null;
            next=null;
        }
    }
    private void addInFront(Node newNode){
        //head-x-A
        newNode.next = head.next;
        newNode.prev = head;
        head.next.prev = newNode;
        head.next = newNode;

    }
    private void delete(Node node){
        // <-> A <-> B <-> C <-> remove B
        node.prev.next=node.next;
        node.next.prev=node.prev;

    }
    public LRUCache(int capacity) {
        this.limit=capacity;
        head=new Node(-1,-1);
        tail=new Node(-1,-1);
        head.next=tail;
        tail.prev=head;
        map=new HashMap<>();
    }

    public int get(int key) {
        if(!map.containsKey(key)){
            return -1;
        }
        Node newNode=map.get(key);
        delete(newNode);
        addInFront(newNode);
        return newNode.value;
    }

    public void put(int key, int value) {
        //when map already have same key
        //delete previous key value pair and at same location add new key value pair
        if(map.containsKey(key)){
            delete(map.get(key));
            map.remove(key);
        }
        if(map.size()==limit){
            Node lruNode=tail.prev;
            delete(lruNode);
            map.remove(lruNode.key);
        }
        Node newNode=new Node(key,value);
        addInFront(newNode);
        map.put(key,newNode);

    }
}
