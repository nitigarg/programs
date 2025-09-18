package TwoPointer;

public class RemoveDuplicateMaintainOrder {
    // in this problem we have to preserve order so we cannot use last values
    //If the problem requires order to be preserved, use a "copy forward" approach (one pointer that tracks where to write next).
    //
    //If the problem does not require order, you can do "swap with last" logic (like Leetcode 27).
public int removeDuplicates(int[] nums, int val){
    int j=0;
    for(int i=0;i<nums.length;i++){
        if(nums[i]!=val){
            nums[j]=nums[i];
            j++;
        }
    }
    return j++;
}
}
