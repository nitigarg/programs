package recursion;

public class PowerOfN {
    //print x^n
    public static int print(int x, int n){
        if(n==0){
            return 1;
        }
        if(x==0){
           return 0;
        }
        int ans=x* print(x,n-1);
        return ans;
    }

    public static void main(String[] args) {
        int x=2;
        int n=4;
        System.out.println(print(x,n));
    }
    //above method with logn levels
    public static int print1(int x, int n){
        if(n==0){
            return 1;
        }
        if(x==0){
           return 0;
        }
        if(n%2==0){
            return print1(x,n/2)*print1(x,n/2) ;
        }
       else{
         return   print1(x,n/2)*print1(x,n/2) * x;
        }

    }
}
