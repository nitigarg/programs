package FastAndSlowPointerPatterns;

public class FindDuplicateNumber {
    //leetcode problem 287
    //very important for flyod detection principle and pigeonhole principle
    public int findDuplicate(int[] nums) {
        int slow=nums[0];
        int fast=nums[0];
        do{
            slow=nums[slow];
            fast=nums[nums[fast]];}
        while(slow!=fast);

        slow=nums[0];
        while(slow!=fast){
            slow=nums[slow];
            fast=nums[fast];
        }
        return slow;
    }
    //Second approach to solve this problem through Binary search
}
