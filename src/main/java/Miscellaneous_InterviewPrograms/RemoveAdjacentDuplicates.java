package Miscellaneous_InterviewPrograms;

import java.util.Stack;

public class RemoveAdjacentDuplicates {
    public String removeDuplicates(String s) {
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(!stack.isEmpty()&& stack.peek()==c){
                stack.pop();
            }
            else{
                stack.push(c);
            }
        }
        StringBuilder result=new StringBuilder();
        for(char c:stack){
            result.append(c);
        }
        return result.toString();
    }
}
