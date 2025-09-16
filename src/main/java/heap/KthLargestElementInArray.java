package heap;

import java.util.PriorityQueue;

public class KthLargestElementInArray {
    //not optimal solution and have O(n log n) time complexity
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>((a, b)->b.compareTo(a));
        for(int i:nums){
            pq.offer(i);
        }
        for(int i=1;i<=nums.length;i++){
            if(!pq.isEmpty() && i==k){
                return  pq.poll();
            }
            pq.poll();
        }
        return -1;
    }
    //more optimal than above but still O(n log k)
    public int findKthLargestOptimal(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        //instead of maintaining element in descending order in pq
        // we will keep pollling until length of pq is less than or equal to k
        for(int i=0;i<nums.length;i++){  //nums = [3,2,1,5,6,4], k = 2
            pq.offer(nums[i]); // [3],[3,2],[3,2,1],[3,2,5],[3,5,6],[5,6,4],[5,6]
            if(pq.size()>k){
               pq.poll(); //1,2,3,4
            }
        }
        return pq.peek(); //[5,6] -> top will be 5
    }
}
