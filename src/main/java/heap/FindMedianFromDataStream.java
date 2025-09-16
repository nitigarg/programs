package heap;

import java.util.Comparator;
import java.util.PriorityQueue;

public class FindMedianFromDataStream {
    //leetcode 295
    class MedianFinder {
        private PriorityQueue<Integer> right;
        private PriorityQueue<Integer>left;
        public MedianFinder() {
            right=new PriorityQueue<>();//minHeap gives smallest element on the top
            left=new PriorityQueue<>(Comparator.reverseOrder());//gives largest element on top
        }

        public void addNum(int num) {
            if(left.isEmpty() || num<=left.peek()){
                left.offer(num);
            }
            else{
                right.offer(num);
            }
            //balancing heap
            if(left.size()>right.size()+1){
                right.offer(left.poll());
            }
            else if(right.size()>left.size()){
                left.offer(right.poll());
            }
        }

        public double findMedian() {
            if(left.size()==right.size()){
//heaps are equal means even number of elements
                return (left.peek()+right.peek())/2.0;
            }
            else{
                return left.peek();
            }
        }
    }

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */
}
