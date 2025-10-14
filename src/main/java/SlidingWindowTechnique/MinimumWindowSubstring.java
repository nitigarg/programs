package SlidingWindowTechnique;

import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstring {
    //leetcode problem 76
    public String minWindow(String s, String t) {
        if(s.length()<t.length()){
            return "";
        }
        Map<Character,Integer> map1=new HashMap<>();
        Map<Character,Integer>map2=new HashMap<>();
        int desired_matchCount=t.length();
        int matchCount=0;
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            map2.put(ch,map2.getOrDefault(ch,0)+1);
        }
        int i =-1;
        int j=-1;
        String ans="";
        String potential_ans="";
        while(true){
            boolean f1=false;
            boolean f2=false;
            //acquire
            while(i<s.length()-1 && matchCount < desired_matchCount){
                i++;
                char ch=s.charAt(i);
                map1.put(ch,map1.getOrDefault(ch,0)+1);
                if(map1.getOrDefault(ch,0)<=map2.getOrDefault(ch,0)){
                    matchCount++;
                }
                f1=true;
            }
            //collect ans & release
            while(j<i && matchCount==desired_matchCount){
                potential_ans=s.substring(j+1,i+1);
                if(ans.length()==0||potential_ans.length()<ans.length()){
                    ans=potential_ans;
                }
                j++;
                char ch=s.charAt(j);
                if(map1.get(ch)==1){
                    map1.remove(ch);
                }else{
                    map1.put(ch,map1.get(ch)-1);
                }
                if(map1.getOrDefault(ch,0)<map2.getOrDefault(ch,0)){
                    matchCount--;
                }
                f2=true;
            }
            if(f1==false && f2==false){
                break;
            }
        }
        return ans;
    }
}
