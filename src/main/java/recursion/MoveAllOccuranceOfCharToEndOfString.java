package recursion;

import java.util.Arrays;

public class MoveAllOccuranceOfCharToEndOfString {
    //xxbcxxd-> move all x to end of String
    public static void moveAllOccurancesToEnd(String s, int index,char ele,char[]charArray,int i,int count){
        //base case
        if(index==s.length()){
            while(count!=0){
                charArray[i++]=ele;
                count--;
            }
            System.out.println("new string is "+ new String(charArray));
            return;
        }
        char currentChar=s.charAt(index);
        if (currentChar == ele) {
            count++;  // don't add to charArray, just count it
            moveAllOccurancesToEnd(s, index + 1, ele, charArray, i, count);  // note: i is unchanged
        } else {
            charArray[i] = currentChar;
            moveAllOccurancesToEnd(s, index + 1, ele, charArray, i + 1, count);  // increment i only when added a char
        }
    }
    public static void main(String[] args) {
        String s="xxbcxd";
        char[] charArray=new char[s.length()];
        moveAllOccurancesToEnd(s,0,'x',charArray,0,0);
    }

}
