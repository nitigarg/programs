package org.example;
//leetcode problem 704
//Always remember binary search will be applied on sorted Array
//Given we have to solve problem in time complexity of O(log n)
public class BinarySearch {
    public int search(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        int mid;
        while(left<=right){
            mid=(left+right)/2;
            if(nums[mid]>target){
                right=mid-1;
            }
            else if(nums[mid]<target) {
                left=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
