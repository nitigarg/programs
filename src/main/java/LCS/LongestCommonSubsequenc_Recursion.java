package LCS;

public class LongestCommonSubsequenc_Recursion {
    //this is non optimised recursive approach with time complexity of 2^n
    public static int lcs(int m, int n, String a, String b){
        return lcsUtil(m,n,a,b);
    }
    static int lcsUtil(int m, int n, String a, String b){
        if(m==0||n==0){
            //if length of any string is zero then we will not have any common subsequence
            return 0;
        }
        if(a.charAt(m-1)==b.charAt(n-1)){
            //if last character of both strings are equal then we can break it in sub problem
            return 1+lcsUtil(m-1,n-1,a,b);
        }
        else{
            return Math.max(lcsUtil(m,n-1,a,b),lcsUtil(m-1,n,a,b));
        }
    }

}
