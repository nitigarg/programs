package maximumSubArray;

public class MaximumSubArrayWithRepeatedNumbers {
    //Given an array and a number k, find the largest sum of contiguous array in the modified array which is formed by repeating the given array k times.
    //
    //Examples :
    //
    //Input  : arr[] = {-1, 10, 20}, k = 2
    //Output : 59
    //After concatenating array twice, we get {-1, 10, 20, -1, 10, 20} which has maximum subarray sum as 59.
    //
    //Input  : arr[] = {-1, -2, -3}, k = 3
    //Output : -1
//Leetcode problem 1191
    public static int maxSumWithRepeatedConcatenations(int[] nums, int k){
        int result=0;
        return result;
    }
    public static void main(String args[]){
        int[] nums={-1, 10, 20};
        int k=2;
        System.out.println(maxSumWithRepeatedConcatenations(nums,k));
    }
}
