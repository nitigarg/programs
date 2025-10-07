package StringRelated;

public class ReverseStringII {
    public String reverseStr(String s, int k) {
        int start=0;
        char[] c=s.toCharArray();
        while(start<c.length){
            int end=Math.min(start+k-1,c.length-1);
            reverse(c,start,end);
            start=start+2*k;
        }
        return new String(c);
    }
    public static void reverse(char[] c, int start, int end){
        while(start<end){
            char temp=c[start];
            c[start]=c[end];
            c[end]=temp;
            start++;
            end--;
        }
    }
}
