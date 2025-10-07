package SlidingWindowTechnique;

public class LongestRepeatingCharacterReplacement {
    //leetcode problem 424
    public int characterReplacement(String s, int k) {
        int[] count=new int[128]; //took length 128 to accomodate all uppercase, smallercase, digits from range 0-127
        //count[index] will denote each char for example count[65] will denote A and will keep its count
        int left=0;
        int result=0;
        int maxFreq=Integer.MIN_VALUE;
        //Approach to solve this problem is that if in particular window or substring
        //we know the character with maximum freqiency and we already know that no. of operations we can perform
        //we also know the window size beginning with 1 char then we have everything to find out longest substring by
        //keep increasing the window by right pointer and decreasing count and increasing left pointer
        //if window becomes invalid
        for(int right=0;right<s.length();right++){
            //step first we should have frequency of each character
            count[s.charAt(right)]++;
            int freq=count[s.charAt(right)];
            maxFreq=Math.max(freq,maxFreq);
            //step 2 we will change left pointer and move it towards right if we have invalid window
            while((right-left+1)-maxFreq>k){
                count[s.charAt(left)]--;//decrementing count of first char as we will move window
                left++;//moving window to right side
            }
          result=Math.max(result,(right-left+1));
        }
        return result;
    }
}
