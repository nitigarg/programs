package heap;

import org.junit.Test;

import java.util.PriorityQueue;

import static org.junit.Assert.assertEquals;

public class KthLargestElementInStream {
    //leetcode problem 703
    class KthLargest {
        private int k;
        private PriorityQueue<Integer> minHeap;
        public KthLargest(int k, int[] nums){
            //nums here is refer as stream
            this.k=k;
            minHeap=new PriorityQueue<>();//since it is Integer type comparable is already implemented
        for(int num:nums){
            add(num);
        }
        }
        public int add (int val){
            minHeap.offer(val);
            if(minHeap.size()>k){
                minHeap.poll();
            }
            return minHeap.peek();
        }
    }
    @Test
    public void testKthLargest(){
        int[] nums={4,5,8,2};
        KthLargest obj=new KthLargest(3,nums);
        assertEquals(4,obj.add(3));
    }
}
