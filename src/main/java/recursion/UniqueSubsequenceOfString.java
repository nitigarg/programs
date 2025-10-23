package recursion;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class UniqueSubsequenceOfString {
    //NOTE
    /*3️⃣ When to remove it

If your application requires only non-empty subsequences, you can filter it like this:

if(index == s.length()){
    if(sb.length() > 0) set.add(sb.toString());
    return;
}


This prevents the empty string from being added to the result.

✅ Summary

Empty string as a subsequence is correct — it represents the choice of taking no characters.

Only remove it if your specific requirement excludes empty subsequences.*/
    public static void subsequences(String s, int index, StringBuilder sb, Set<String>set){
        if(index==s.length()){
            set.add(sb.toString());
            return ;
        }
        subsequences(s,index+1,sb.append(s.charAt(index)),set);
        sb.deleteCharAt(sb.length()-1);
        subsequences(s,index+1,sb,set);

    }
    public static void main(String[] args) {
        String s="abc";
        Set<String>set=new HashSet<>();
        subsequences(s,0,new StringBuilder(),set);
        System.out.println(new ArrayList(set));
    }
}
