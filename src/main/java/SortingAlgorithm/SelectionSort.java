package SortingAlgorithm;

public class SelectionSort {
    //Selection Sort repeatedly selects the smallest element
    // from the unsorted portion of the array and places it at the beginning.
    //in selection sort swapping is only done once unlike bubble sort which involves multiple time swapping
    public static int[] selectionSort(int[] nums){
        int n=nums.length;
        for(int i=0;i<n;i++){
            int minIndex=i;
            for(int j=i+1;j<n;j++){
                if(nums[j]<nums[minIndex]){
                   minIndex=j;
                }
            }
            int temp=nums[i];
            nums[i]=nums[minIndex];
            nums[minIndex]=temp;

        }
        return nums;
    }

}
