package SortingAlgorithm;

public class InsertionSort {
    public static int[] insertionSort(int[] nums){

        /*
         * Instead of swapping, insertion sort focuses on shifting elements to create
         * space for the insertion of elements. The average and worst time complexity
         * for Insertion Sort is O(n²), but the best-case time complexity is O(n)
         */
        /*
Key Points to Remember

🧠 How to remember insertion sort logic:

“Pick → Compare → Shift → Place”

Pick the next element (key = arr[i])

Compare it with elements to its left (arr[j])

Shift larger elements one step right

Place the key in the correct spot (arr[j+1] = key
         */

        int n=nums.length;
        for(int i=1;i<n;i++){
           int key=nums[i];
           int j=i-1;
           while(j>=0 && nums[j]>key){
               nums[j+1]=nums[j];
               j--;
           }
           nums[j+1]=key;
        }
        return nums;
    }

}
