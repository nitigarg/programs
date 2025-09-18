package TwoPointer;

public class MoveNegativeElementsInFront {
    public void moveNegativesToFront(int[] nums) {
        int j=0;
        int temp = 0;
        for(int i=0;i<nums.length;i++){
                if(nums[i]<0){
                   temp=nums[i];
                }
                    //then we should save this element in temp because we will shift elements from i-1 to j
                    for(int k=i;k>j;k--){
                        nums[k]=nums[k-1];
                    }
            // Insert the negative number at position j
                    nums[j]=temp;
            // Move j to next insert position
                    j++;
                }
        }
}
