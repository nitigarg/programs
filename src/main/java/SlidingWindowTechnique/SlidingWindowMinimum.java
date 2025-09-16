package SlidingWindowTechnique;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;

public class SlidingWindowMinimum {
    //Description:
    //
    //Given an array nums[] and an integer k, return a list of the minimum values in every contiguous subarray of size k.
    //
    //Example:
    //Input: nums = [1, 3, -1, -3, 5, 3, 6, 7], k = 3
    //Output: [ -1, -3, -3, 3, 3, 3 ]


    //Important
    //General Rule:
    //
    //If you're moving a window of size k across an array of length n:
    //
    //The first window ends at index k - 1
    //
    //The last window ends at index n - 1
    //
    //So, the number of valid windows is:
    //
    //From index: 0
    //To index: n - k
    //Total = (n - k + 1)
    public static int[] minSlidingWindow(int[] nums, int k) {
        Deque<Integer> deque=new ArrayDeque<>();
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<k;i++){
          while(!deque.isEmpty() && nums[deque.getLast()]>=nums[i]){
              deque.pollLast();
          }
          deque.addLast(i);
        }
        for(int i=k;i<nums.length;i++){
            ans.add(nums[deque.getFirst()]);
            //remove elements which are not part of window
            while(!deque.isEmpty() && deque.getFirst()<i-k+1){
                deque.pollFirst();
            }
            while(!deque.isEmpty() && nums[deque.getLast()]>=nums[i]){
                deque.pollLast();
            }
            deque.addLast(i);
        }
        ans.add(nums[deque.getFirst()]);
        return ans.stream().mapToInt(Integer::intValue).toArray();
    }
    public static void main(String args[]){
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        System.out.println(Arrays.toString(minSlidingWindow(nums,k)));
    }
}
