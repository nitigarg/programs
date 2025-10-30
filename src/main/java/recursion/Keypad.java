package recursion;

public class Keypad {
    public static String keypad[]={".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void printCombinations(String s, int index, StringBuilder sb){
        if(index==s.length()){
            System.out.println(sb.toString());
            return;
        }
        String mapping=keypad[s.charAt(index)-'0'];
        for(int i=0;i<mapping.length();i++){
            sb.append(mapping.charAt(i));
            printCombinations(s,index+1,sb);
            sb.deleteCharAt(sb.length()-1);
        }

    }
    public static void main(String[] args) {
        String s="23";
        printCombinations(s,0,new StringBuilder());
    }
}
