package recursion;

public class PrintNumbers {
        public static void print(int n){
            if(n==0){
                return;
            }
            //System.out.print(n+" "); //for decreasing order
            print(n-1);
            System.out.print(n+" ");
        }
    public static void main(String[] args) {
        int n=5;
        print(n);
    }

}
