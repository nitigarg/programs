package MooreVotingAlgo;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    //Leetcode 1
    //Given an array of integers nums and
    // an integer target, return indices of the two numbers such that they add up to target.
    //
    //You may assume that each input would have exactly one solution,
    // and you may not use the same element twice.
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map=new HashMap<>();
        int[] result=new int[2];
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                result[0]=i;
                result[1]=map.get(target-nums[i]);
            }
            else{
                map.put(nums[i],i);
            }
        }
        return result;
    }
}
