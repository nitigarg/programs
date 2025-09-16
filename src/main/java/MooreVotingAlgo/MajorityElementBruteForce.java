package MooreVotingAlgo;

public class MajorityElementBruteForce {
    public int majorityElement(int[] nums) {
        //brute force approach
        int freq=0;
        int result=-1;
        for(int num:nums){
            freq=0;
            for(int val:nums){
                if(val==num)
                {
                    freq++;
                }
            }
            if(freq>nums.length/2){
                result=num;
                return result;
            }
        }
        return result;
    }
}
