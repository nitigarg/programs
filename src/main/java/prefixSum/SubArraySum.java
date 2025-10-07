package prefixSum;

import java.util.HashMap;
import java.util.Map;

public class SubArraySum {
    //leetcode problem 560
    public int SubArraySum(int [] nums, int k){
        int count=0;
        int prefixSum=0;
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,1);//this is required to put for subarray that can be at index zero and whose sum is equal to k
        //remember single element also is one subarray
        for(int i=0;i<nums.length;i++){
            prefixSum=prefixSum+nums[i];
            if(map.containsKey(prefixSum-k)){
               count=count+map.get(prefixSum-k);
            }
            map.put(prefixSum,map.getOrDefault(prefixSum,0)+1);
        }
        return count;
    }
}
