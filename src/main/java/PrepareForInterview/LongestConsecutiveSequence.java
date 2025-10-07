package PrepareForInterview;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int maxLength=1;
        Set<Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        for(int num:set){
            if(!set.contains(num-1)){
                int currentNum=num;
                int length=1;
                while(set.contains(currentNum+1)){
                    currentNum++;
                    length++;
                }
                maxLength=Math.max(length,maxLength);
            }
        }
        return maxLength;
    }
}
