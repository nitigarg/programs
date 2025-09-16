package SlidingWindowTechnique;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class SlidingWindowMaximum {
    //leetcode problem 239
    public int[] maxSlidingWindow(int[] nums, int k) {
        ArrayList<Integer> ans=new ArrayList<>();
        Deque<Integer> deque=new ArrayDeque<>();
        for(int i=0;i<k;i++){
            while(!deque.isEmpty() && nums[deque.getLast()]<=nums[i]){
                //if last element present in deque is less than current element
                //then remove that element
                deque.pollLast();
            }
            deque.addLast(i);
        }
        for(int i=k;i<nums.length;i++){
            ans.add(nums[deque.getFirst()]);
            //if elements in deque are not part of current window then remove them
            while(!deque.isEmpty() && deque.getFirst()< i-k+1){
                deque.pollFirst();
            }
            while(!deque.isEmpty()&& nums[deque.getLast()]<=nums[i]){
                deque.pollLast();
            }
            deque.addLast(i);
        }
        ans.add(nums[deque.getFirst()]);
        return ans.stream().mapToInt(Integer::intValue).toArray();
    }


    //optimised form of above method
    public int[] maxSlidingWindowOptimised(int[] nums, int k) {
        int ans[]=new int[nums.length-k+1];
        int index=0;
        Deque<Integer>deque=new ArrayDeque<>();
        for(int i=0;i<nums.length;i++){

            //if elements in deque are not part of current window then remove them
            while(!deque.isEmpty() && deque.getFirst()< i-k+1){
                deque.pollFirst();
            }
            while(!deque.isEmpty()&& nums[deque.getLast()]<=nums[i]){
                deque.pollLast();
            }
            deque.addLast(i);
            if(i>=k-1){
                ans[index]=nums[deque.getFirst()];
                index++;
            }

        }
        return ans;
    }
}
