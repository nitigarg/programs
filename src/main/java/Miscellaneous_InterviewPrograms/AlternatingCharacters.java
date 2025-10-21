package Miscellaneous_InterviewPrograms;

public class AlternatingCharacters {
    public int deletionsRequired(String s){
        //edge case
        if(s.length()==0 || s==null){
            return 0;
        }
        int count=0;
       for(int j=1;j<s.length();j++){
           if(s.charAt(j-1)==s.charAt(j)){
               count++;
           }
       }
       return count;
    }
}
