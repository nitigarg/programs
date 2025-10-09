package prefixSum;

import java.util.HashMap;
import java.util.Map;

public class ContinousArrayWithEqualZeroAndOnes {
    //leetcode problem 525
    public int findMaxLength(int[] nums) {
        int maxLength=0;
        int sum=0;
        int length=0;
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);//in map we have sum as key and index corresponding to that sum as value
        //we have kept 0,-1 in map because at index -1 which is before zeroth index our sum is zero
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                sum+=-1;
            }
            else {
                sum+=1;
            }
            if(map.containsKey(sum)){
                length=i-map.get(sum);
            }
            else{
                map.put(sum,i);
            }
            if(maxLength<length){
                maxLength=length;
            }
        }
        return maxLength;
    }
}
