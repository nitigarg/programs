package StringRelated;

public class ValidPalindrome {
    //non-optimal Solution
    public boolean isPalindrome(String s) {
        if(s.length()==0 || s.isEmpty()){
            return true;
        }
        String s1 =s.toLowerCase().replaceAll("\\s+","").
                replaceAll("[^A-Za-z0-9]","");
        String reverse=new StringBuilder (s1).reverse().toString();
        if(s1.equals(reverse)){
            return true;
        }
        return false;
    }
    //optimal Solution
    //two pointer approach
    public boolean isPalindromeOptimal(String s) {
        if(s==null || s.isEmpty()){
            return true;
        }
        int start=0;
        int end=s.length()-1;
        while(start<end){
            while(start<end && !Character.isLetterOrDigit(s.charAt(start))){
                start++;
            }
            while(start<end && !Character.isLetterOrDigit(s.charAt(end))){
                end--;
            }
            if(Character.toLowerCase(s.charAt(start))!=Character.toLowerCase(s.charAt(end))){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}

