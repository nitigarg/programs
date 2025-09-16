package SlidingWindowTechnique;

import java.util.HashSet;
import java.util.Set;

public class PrintLongestSubStringWithoutRepeatingCharacters {
    public static void longestSubstringWithoutRepeatingCharacter(String s){
        int maxStart=0;
        int maxLength=0;
        int end=0;
        int start=0;
        if(s.length()==0){
            System.out.println("maximum length is "+ maxLength);
            System.out.println("Maximum Substring is "+"");
            return;
        }
        Set<Character> set=new HashSet<>();
        while(end<s.length()){
            if(!set.contains(s.charAt(end))){
                set.add(s.charAt(end));
                end++;
                if(maxLength<end-start){
                    maxLength=end-start;
                    maxStart=start;
                }
            }
            else{
                set.remove(s.charAt(start));
                start++;
            }
        }
        System.out.println("Maximum length of substring is "+maxLength);
        System.out.println("Max substring is "+s.substring(maxStart,maxStart+maxLength));
    }
 public static void main(String args[]){
        String s="abcabcbb";
        String s1="bbbbb";
        String s2="pwwkew";
     longestSubstringWithoutRepeatingCharacter(s);
     longestSubstringWithoutRepeatingCharacter(s1);
     longestSubstringWithoutRepeatingCharacter(s2);
 }
}
