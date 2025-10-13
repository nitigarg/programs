package TwoPointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    //leetcode problem 15
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>>ans=new ArrayList<>();//this will be our ans
        //in order to avoid duplicacy and use binary search algo we need to sort the array
        Arrays.sort(nums);
        //Once we sort the array we can work towards elminating duplicacy
        //outer most loop for fixed i or first number
        for(int i=0;i<nums.length;i++){
            //we have to make sure that we don't calculate triplets for same values of i
            //also we know that repeated values in sorted array will appear adjacently
            //so below condition will prevent to compute values for same i in a row
            if(i>0 && nums[i]==nums[i-1]){
                //in this case we just want to kip the iteration and don't want to enter in inner loop
                continue;
            }
            int left=i+1;
            int right=nums.length-1;
            //inner loop for calculating other two numbers where first number is nums[i]
            while(left<right){
                if(nums[i]+nums[left]+nums[right]>0){
                    //we need to move right pointer
                    right--;
                }
                else if(nums[i]+nums[left]+nums[right]<0){
                   left++;
                }
                else{
                    ans.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    left++;
                    right--;
                    //there can be a case when we can compute triplets for two equal values of j
                    //so in order to avoid that we will use below loop
                    while(left<right && nums[left]==nums[left-1]){
                        left++;
                    }
                }
            }
        }
return ans;
    }
}
