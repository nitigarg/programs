package MooreVotingAlgo;

import java.util.Arrays;

public class MajorityElementOptimisedApproach {
    public int majorityElement(int[] nums) {
        //using sorting + traversing through sorted array to claculate majority element
        Arrays.sort(nums);
        int freq=1;int ans=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                freq++;
            }
            else{
                freq=1;
                ans=nums[i];
            }
            if(freq>nums.length/2){
                return ans;
            }
        }
        return ans;
    }
}
