package TwoPointer;

public class RearrangeBySignAndKeepOrder {
    //int[] nums = {-1, 3, -5, 7, -2, 9, 4, -6}
    //Negatives in order: -1, -5, -2, -6
    //
    //Positives in order: 3, 7, 9, 4
    //
    //Expected Output with order preserved:
    //java
    //Copy code
    //[-1, 3, -5, 7, -2, 9, -6, 4]
    //so when we need to preserve order we have to use insertion based approach and not swap based approach
    public void rearrangeBySignPreserveOrder(int[] nums) {
        //check whether at even position we have negative number and at odd we have positive number
        for(int i=0;i<nums.length;i++){
            boolean expectNegative=(i%2==0);
            //if everything is correct we keep scanning elements
            if((expectNegative && nums[i]<0) || (!expectNegative && nums[i]>=0)){
                continue;
            }
            else{
               int j=i+1;
               while(j<nums.length){
                   if((expectNegative && nums[j]<0) || (!expectNegative && nums[j]>=0)){
                       break;
                   }
                   j++;
               }
               if(j==nums.length){
                   break;
               }
               int temp=nums[j];
               for(int k=j;k>i;k--){
                   nums[k]=nums[k-1];
               }
               nums[i]=temp;
            }
        }

    }
}
