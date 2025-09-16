package maximumSubArray;

public class MaximumProductSubArray {
    //leetcode problem 152
    //Input: nums = [2,3,-2,4]
    //Output: 6
    //Explanation: [2,3] has the largest product 6.

    public int maxProduct(int[] nums) {
        int prefix=1;
        int suffix=1;
        int maxProduct=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            prefix= prefix*nums[i];
            suffix=suffix*nums[nums.length-1-i];
            maxProduct=Math.max(maxProduct,Math.max(prefix,suffix));
            if(prefix==0){
                prefix=1;
            }
            if(suffix==0){
                suffix=1;
            }
        }
        return maxProduct;
    }
}
