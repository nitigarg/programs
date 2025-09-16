package maximumSubArray;

public class PrintMaxSumSubArray {
    /*Input: arr[] = {2, 3, -8, 7, -1, 2, 3}
Output: {7, -1, 2, 3}
Explanation: The subarray {7, -1, 2, 3} has the largest sum 11.*/

    public static void printMaxSumSubArray(int[] nums){
        int maxSum=Integer.MIN_VALUE;
        int start=0;
        int end=0;
        int finalStart=0;
        int currentSum=0;
        for(int i=0;i<nums.length;i++){
            if(currentSum==0){
                start=i;
            }
            currentSum+=nums[i];
            if(currentSum>maxSum){
               maxSum=currentSum;
               finalStart=start;
               end=i;
            }

            if(currentSum<0){
                currentSum=0;
            }
        }
        System.out.println("MaxSum Subarray is ");
        for(int i=finalStart;i<=end;i++){
            System.out.print(nums[i] +" ");
        }
        System.out.println();
        System.out.println("Max Sum is "+maxSum);
    }
    public static void main(String args[]){
        int[] nums={2, 3, -8, 7, -1, 2, 3};
        printMaxSumSubArray(nums);

    }
}
