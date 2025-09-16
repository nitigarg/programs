package LCS;

import java.util.HashSet;
import java.util.Set;
/*The idea is to use Hashing. We first insert all elements in a Hash Set. Then, traverse over all
the elements and check if the current element can be a starting element of
a consecutive subsequence. If it is then start from X and keep on removing elements
 X + 1, X + 2 .... to find a consecutive subsequence.

To check if the current element,
 say X can be a starting element, check if (X - 1) is present in the set.
  If (X - 1) is present in the set, then X cannot be starting of a consecutive subsequence.
* */
public class LongestConsecutiveSubsequence {
    public int longestConsecutive(int[] nums) {
        int maxLength=0;
        int length=0;
        //we are putting in set to avoid duplicate element and to get average time O(1)
        Set<Integer> set=new HashSet<>();
        //Added all unique elements in set
        for(int i: nums){
            set.add(i);
        }
//Iterate through whole array until we find starting sequence and then we will update length
        for(int i=0;i<nums.length;i++){
            int currentNum=nums[i];
            if(set.contains(currentNum) && !set.contains(currentNum-1)){
// it means we have starting sequence
                length=1;
                while(set.contains(currentNum+1)){
                    //Make sure to remove that starting sequence from Set
                    // as we don't want to repeat same process again
                    // and again for single starting sequence

                    //avoiding recomputation
                    set.remove(currentNum);
                    currentNum++;
                    length++;
                }
                maxLength=Math.max(length,maxLength);
            }
        }
        return maxLength;
    }
}
