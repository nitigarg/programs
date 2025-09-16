public class FindDuplicateNumber {
    public int findDuplicate(int[] nums) {
        //leetcode problem 287
        //solve by slow and fast pointer approach to do this problem in Space complexity of O(1)
        //https://www.youtube.com/watch?v=0Fxc_jKj2vo
        int slow=nums[0];
        int fast=nums[0];
        do{
            slow=nums[slow];
            fast=nums[nums[fast]];
        }while(slow!=fast);
        slow=nums[0];
        while(slow!=fast){
            slow=nums[slow];
            fast=nums[fast];
        }
        return slow;
    }
}
