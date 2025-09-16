package LCS;

public class LongestCommonSubsequence_ThreeStrings {
    //Given three srings we have to find longest common subsequence among them
    static int lcs(int m, int n, int l, String a, String b, String c){
        int dp [][][]=new int [m+1][n+1][l+1];
        for(int i=0;i<=m;i++){
            {
                for(int j=0;j<=n;j++){
                    for(int k=0;k<=l;k++){
                        dp[i][j][k]=-1;
                    }
                }
            }
        }
        return lcsUtil(m,n,l,a,b,c,dp);
    }
    static int lcsUtil(int m, int n, int l, String a, String b, String c, int[][][]dp){
       if(m==0||n==0||l==0){
            return 0;
       }
       if(dp[m][n][l]!=-1){
         return dp[m][n][l];
       }
       if((a.charAt(m-1)==b.charAt(n-1))&& c.charAt(l-1)==b.charAt(n-1)){
          return dp[m][n][l]=1+lcsUtil(m-1,n-1,l-1,a,b,c,dp);
       }
       else{
           return dp[m][n][l]=Math.max(Math.max(lcsUtil(m-1,n,l,a,b,c,dp),lcsUtil(m,n-1,l,a,b,c,dp)),lcsUtil(m,n,l-1,a,b,c,dp));
       }
    }
}
