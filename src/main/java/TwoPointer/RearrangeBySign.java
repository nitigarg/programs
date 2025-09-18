package TwoPointer;

public class RearrangeBySign {
    //Given an array of integers, rearrange the array so that positive and negative numbers are placed alternatively.
    //without order preservation
    public void rearrangeArray(int[] nums){
        //Input:  [3, -2, 5, -7, -1, 4]
        //Output: [-2, 3, -7, 5, -1, 4]
        int even=0;
        int odd=1;
        while(even<nums.length && odd<nums.length){
            if(nums[even]<0){
               even+=2;

            }
            else if(nums[odd]>0){
                odd+=2;
            }
            else{
                swap(nums,even,odd);
                even+=2;
                odd+=2;
            }

        }
    }
    public void swap(int[] nums, int even, int odd){
            int temp=nums[even];
            nums[even]=nums[odd];
            nums[odd]=temp;
    }
}
