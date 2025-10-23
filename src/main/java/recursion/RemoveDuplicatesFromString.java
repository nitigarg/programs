package recursion;

import java.util.Arrays;

public class RemoveDuplicatesFromString {
    public static String removeDuplicates(String s,int[]arr,int length,StringBuilder ans){
        if(length==s.length()){
            return ans.toString();
        }
        if(arr[s.charAt(length)]==-1){
            arr[s.charAt(length)]=0;
            ans.append(s.charAt(length));
        }
        return removeDuplicates(s,arr,length+1,ans);
    }

    public static void main(String[] args) {
        String s="aabbccdd";
        //int[] arr=new int[26];//if only lowercase are present
        int[] arr=new int[256];
        Arrays.fill(arr,-1);
        System.out.println(removeDuplicates(s,arr,0,new StringBuilder()));
    }
}
