package MergingProblems;

public class MergeSortedArray {
    //OR this is also called as Merge sorting Stream in place
    //whenever we are given that one sorted array have extra space than other sorted
    //array then we will do merging from end and compare elements of both array from the end
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index=m+n-1;
        int i=m-1;
        int j=n-1;
        while(i>=0 && j>=0){
            if(nums1[i]>=nums2[j]){
                nums1[index]=nums1[i];
                index--;
                i--;
            }
            else{
                nums1[index]=nums2[j];
                index--;
                j--;
            }
        }
        while(j>=0){
            nums1[index]=nums2[j];
            j--;
            index--;
        }
    }
}
