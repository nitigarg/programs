package Arrays;

public class NextPermutation {
    //leetcode problem 31
    public void nextPermutation(int[] nums) {
        int pivot=-1;
        int n=nums.length;
        //finding pivot
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                pivot=i;
                break;
            }
        }
        if(pivot==-1){
//this means we have array in decreasing order and we need to reverse it
            reverse(nums);
            return;
        }
        //After finding pivot we will find rightmost element of pivot
        //next rightmost element which is greater than pivot
        for(int i=n-1;i>pivot;i--){
            if(nums[i]>nums[pivot]){
                //swap pivot element and that rightmost element
                swap(nums,i,pivot);
                break;
            }
        }
        //reversing array after pivot element
        int i=pivot+1;
        int j=n-1;
        while(i<=j){
            swap(nums,i,j);
            i++;
            j--;
        }
    }
    public void reverse(int[] nums){
        int n=nums.length;
        int i=0;
        int j=n-1;
        while(i<=j){
            swap(nums,i,j);
            i++;
            j--;
        }
    }
    public void swap(int[] nums,int a, int b){
        int temp=0;
        temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
}
