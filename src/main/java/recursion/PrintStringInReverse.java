package recursion;

public class PrintStringInReverse {
    public static void reverse(String s,int n){
        if(n==0){
            System.out.print(s.charAt(n));
            return  ;
        }
        System.out.print(s.charAt(n));
        reverse(s,n-1);

    }
    public static void main(String[] args) {
        String s="abcd";
        int n=s.length()-1;
        reverse(s,n);
    }
}
