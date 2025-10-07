package prefixSum;

public class RangeOfSumArray {
    //leetcode 303
    private int prefixSum[];
    public RangeOfSumArray(int[]nums){
        this.prefixSum=new int[nums.length];
        prefixSum[0]=nums[0];
        for(int i=1;i<nums.length;i++){
           prefixSum[i]=prefixSum[i-1]+nums[i];
        }
    }
    public int SumRange(int left, int right){
        if(left==0){
            //then we will ahve sum of entire array which will be given by last value in prefixSum
            return prefixSum[right];
        }
        return prefixSum[right]-prefixSum[left-1];
    }
}
