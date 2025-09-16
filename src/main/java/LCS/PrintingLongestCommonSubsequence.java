package LCS;

import java.util.HashMap;
import java.util.Map;

public class PrintingLongestCommonSubsequence {

    /*Given two sequences, print the longest subsequence present in both of them.
     Examples:
     LCS for input Sequences “ABCDGH” and “AEDFHR” is “ADH” of length 3.
    LCS for input Sequences “AGGTAB” and “GXTXAYB” is “GTAB” of length 4
    Steps
    1. we check if String is empty then we will return empty String because we won't have any String
    2. If base case is not valid then we will compare the last character of two Strings and then check if last
   character is equal or not. If last char is equal then we add that to our solution String
   removing those character from Main String and passing new String to LCS function to calculte further until we
   reached at base step
   3. If last char of two Strings are not equal then we will remove char from each String one at a time and find
   longest among those two and store that result in our solution String
    */

    // key will be either a|b and value will be LCS String
    /*
    * 🧩 Why We Need a Key: a + "|" + b

Let’s say:

a = "AGGTAB"

b = "GXTXAYB"

Now, in the recursion, we often take substrings of a and b, like:

"AGGTA" and "GXTXAY"

"AGGT" and "GXTXA"

"AG" and "GX"

We want to cache the LCS result for each unique pair of substrings.

📌 Key = "a|b" — Uniquely identifies each subproblem

We use the concatenated string a + "|" + b as a key in the memoization map:

String key = a + "|" + b;


This allows us to store the result like this:

memo.put("AGG|GXT", "G");


"AGG" and "GXT" is different from "AG" and "GGT" — so we need unique keys!

🧪 Example Walkthrough

Let’s say we reach this recursive call:

LCS_core("AGG", "GXT")


We compute its result:

Last characters: 'G' vs 'T' → Not equal

So we try:

LCS_core("AG", "GXT")

LCS_core("AGG", "GX")

Eventually we find:

LCS_core("AGG", "GXT") = "G"


Now we store:

memo.put("AGG|GXT", "G");


Next time the code again tries:

LCS_core("AGG", "GXT")


It first checks:

if (memo.containsKey("AGG|GXT")) {
    return memo.get("AGG|GXT"); // returns "G" instantly, skips recursion
}


✅ This avoids redundant recursion, saving time and stack space.

📌 Why Use | Between Strings?

Without a separator like |, a key like:

a = "AB", b = "C" → "ABC"
a = "A", b = "BC" → "ABC"


would produce the same key ("ABC") for different subproblems, which is wrong.

By using a delimiter like "|":

"AB|C" ≠ "A|BC" ✅

This ensures every pair is uniquely identified.*/
private static  Map<String,String> dp=new HashMap<>();

    static String printLCS(String a, String b){
      String result=  lcsUtil(a,b);
        return reverse(result);
    }
    public static void main(String[] args) {
        String a = "AGGTAB";
        String b = "GXTXAYB";
        System.out.println(printLCS(a, b));
    }
 static String reverse(String s){
        StringBuilder sb= new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            sb.append(s.charAt(i));
        }
        return sb.toString();
 }
  static String lcsUtil(String a, String b){
        int l1=a.length();
        int l2=b.length();
            if(a.length()==0||b.length()==0){
                return "";
            }
        String key=a+"|"+b;
            if(dp.containsKey(key)){
                return dp.get(key);
            }
        String result="";
            if(a.charAt(l1-1)==b.charAt(l2-1)){
                result=a.charAt(l1-1)+lcsUtil(a.substring(0,l1-1),b.substring(0,l2-1));
            }
            else{
               result= maxString(lcsUtil(a.substring(0,l1-1),b),lcsUtil(a,b.substring(0,l2-1)));
            }
            dp.put(key,result);
            return result;
  }
  //we need this function to find max length String among the two
    static String maxString(String a , String b){
        return a.length()>b.length()?a:b;
    }


}
