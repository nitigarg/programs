package SlidingWindowTechnique;

public class LongestSubstringWithoutRepeatingCharacter {
    public int lengthOfLongestSubstring(String s) {
        int [] count=new int[128];
        int left=0;
        int maxLength=0;
        for(int right=0;right<s.length();right++){
            count[s.charAt(right)]++;

            while(count[s.charAt(right)]>1){
                count[s.charAt(left)]--;
                left++;
            }
            maxLength=Math.max(maxLength,(right-left+1));
        }
        return maxLength;
    }
}
