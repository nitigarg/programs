package recursion;

import java.util.ArrayList;
import java.util.List;

public class PrintAllSubsequencesOfString {
    public static void printSubsequence(String s, int index, StringBuilder sb){
        if(index==s.length()){
            System.out.println(sb.toString());
            return;
        }
        char currentChar=s.charAt(index);
        //char want to be added in String
        printSubsequence(s,index+1,sb.append(currentChar));
        //do not want to be added in String
        //remove previous added char
        sb.deleteCharAt(sb.length()-1);//we need to remove that char which we just added
        printSubsequence(s,index+1,sb);
    }
    //another variation where we want to return all subsequences instead of printing
    public static List<String> subsequences(String s , int index, StringBuilder sb, List<String>result){
        //base case
        if(index==s.length()){
            result.add(sb.toString());
            return result;
        }
        subsequences(s,index+1,sb.append(s.charAt(index)),result);
        sb.deleteCharAt(sb.length()-1);
        subsequences(s,index+1,sb,result);
        return result;
    }
    public static void main(String[] args) {
        String s="abc";
        List<String> list=new ArrayList<>();
       // printSubsequence(s,0,new StringBuilder());
        System.out.println(subsequences(s,0,new StringBuilder(),list));
    }
}
