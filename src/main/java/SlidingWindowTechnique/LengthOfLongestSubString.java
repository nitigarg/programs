package SlidingWindowTechnique;

import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestSubString {
    //leetcode problem 3
    public int lengthOfLongestSubstring(String s) {
        int start=0;
        int maxLength=0;
        int end=0;
        if(s.length()==0){
            return maxLength;
        }
        Set<Character> set=new HashSet<>();
        while(end<s.length()){
            if(!set.contains(s.charAt(end))){
                set.add(s.charAt(end));
                end++;
                maxLength=Math.max(maxLength,end-start);
            }
            else{
                set.remove(s.charAt(start));
                start++;
            }
        }
        return maxLength;
    }
}
