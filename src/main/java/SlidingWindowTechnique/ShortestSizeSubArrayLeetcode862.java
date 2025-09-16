//package SlidingWindowTechnique;
//
//import java.util.Deque;
//import java.util.LinkedList;
//
//public class ShortestSizeSubArrayLeetcode862 {
//    public int shortestSubarray(int[] nums, int k) {
//        int minLength=nums.length+1;
//        long prefixSum[]=new long[nums.length+1];
//        //building a prefixSum of all the elements
//        //[2,-1,2] for example here prefixSum array will be [0,2,1,3] which gives us prefixSum at oth indec is zer
//      prefixSum[0]=0;
//        //prefix Sum at index 1 is 2 & so on...So whenever we are taking prefixSum we are not including element at that particular index
//    for(int i=0;i<nums.length+1;i++){
//        prefixSum[i+1]=prefixSum[i]+nums[i];
//    }
////Intializing Deque because we can insert or remove elements at both end in deque so we can slide or we
//        //can shrink and expand using deque
//        Deque<Integer> deque=new LinkedList<>();
//    //iterate over prefixSum array
//        for(int i=0;i<prefixSum.length;i++){
//            // Check if current prefixSum - earliest prefixSum >= target
//            while(!deque.isEmpty()&& prefixSum[i]-prefixSum[deque.peekFirst()]>=k){
//                minLength=Math.min(minLength,i- deque.pollFirst());
//            }
//            while(){
//
//            }
//        }
//    }
//}
