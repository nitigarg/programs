package FastAndSlowPointerPatterns;

public class FindDuplicateNumberBetter {
    //problem 287
    public int findDuplicate(int[] nums) {
        int slow=0;
        int fast=0;
        while(fast<nums.length){
            slow=nums[slow];
            fast=nums[nums[fast]];
            if(slow==fast){
                slow=0;
                while(slow!=fast){
                    slow=nums[slow];
                    fast=nums[fast];
                }
                return slow;
            }
        }
        return -1;
    }
}
