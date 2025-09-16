package MooreVotingAlgo;

public class MooreVotingAlgorithm {
    public int majorityElement(int[] nums) {
        //Moores algo
        int freq=0; int ans=0;
        for(int i=0;i<nums.length;i++){
            if(freq==0){
                ans=nums[i];
            }
            if(nums[i]==ans){
                freq++;
            }
            else{
                freq--;
            }
        }
        return ans;
    }
}
