package SortingAlgorithm;

public class QuickSort {
    /*
    * Quick Sort is a divide-and-conquer algorithm that works by:

Picking a pivot element.

Partitioning the array so that:

Elements smaller than pivot → left side

Elements greater than pivot → right side

Recursively sorting the left and right parts.
* */
    public static void quickSort(int[] nums,int low, int high) {
        if (low < high) {
            int partionIndex = partition(nums, low, high);

            quickSort(nums, low, partionIndex - 1);//sort left array of pivot
            quickSort(nums, partionIndex + 1, high);//sort right array of pivot;
        }
    }
    static int partition(int[] nums, int low, int high){
        int i=low-1;
        int pivot=nums[high];
        for(int j=low;j<high;j++){
            if(nums[j]<=pivot){
                i++;
                //swap
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
            }
        }
        //swap pivot to its correct place
        int temp=nums[i+1];
        nums[i+1]=nums[high];
        nums[high]=temp;
        return i+1;
    }
}
