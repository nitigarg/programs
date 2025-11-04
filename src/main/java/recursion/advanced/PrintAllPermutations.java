package recursion.advanced;

public class PrintAllPermutations {
    //time complexity O(n!)
    public static void printPermutations(String str, String perm){
        //base case
        if(str.length()==0){
            System.out.println(perm);
            return;
        }
        for(int i=0;i<str.length();i++){
            char currentChar=str.charAt(i);
            String newString=str.substring(0,i)+str.substring(i+1);
            printPermutations(newString,perm+currentChar);
        }
    }
    public static void main(String[] args) {
            String str="abc";
            printPermutations(str,"");
    }

}
