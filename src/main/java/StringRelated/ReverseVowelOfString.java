package StringRelated;

public class ReverseVowelOfString {
    public String reverseVowels(String s) {
        char[] charArray=s.toCharArray();
        int left=0;
        int right=charArray.length-1;
        while(left<right){
            while(left<right && !isVowel(charArray[left])){
                left++;
            }
            while(left<right && !isVowel(charArray[right])){
                right--;
            }
            char temp=charArray[left];
            charArray[left]=charArray[right];
            charArray[right]=temp;
            left++;
            right--;
        }
        return new String(charArray);
    }


    public static boolean isVowel(char c){
        return "AEIOUaeiou".indexOf(c)!=-1;//true means vowel
    }
}
