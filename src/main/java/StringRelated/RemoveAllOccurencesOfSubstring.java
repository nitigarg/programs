package StringRelated;

public class RemoveAllOccurencesOfSubstring {
    //Solution in which we should know few methos of StringBuilder
    //like substring method : sb.substring(int) here we provide start index from where we want to extract substring till length of stringbuilder
    //for example sb.subtstring(5) from "HELLOWORLD" will give WORLD
    //delete method-> provide start index inclusive and end index exclusive
    public String removeOccurrences(String s, String part) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            sb.append(s.charAt(i));
            if (sb.length() >= part.length()) {
                if (sb.substring(sb.length() - part.length()).equals(part)) {
                    sb.delete(sb.length() - part.length(), sb.length());
                }
            }
        }
        return sb.toString();
    }

        //Another solution if we don't remember stringbuilder functions
        //mostly we use two pointer and another data structure to store resultant string at each step
        //We will use charArray as stack
        public String removeOccurrencesAnother(String s, String part) {
            char[] stack=new char[s.length()];
            int index=0;
            for(int i=0;i<s.length();i++){
                stack[index++]=s.charAt(i);
                if(index>=part.length()){
                    boolean match=true;
                    for(int j=0;j<part.length();j++){
                        if(stack[index-part.length()+j]!=part.charAt(j)){
                            match=false;
                            break;
                        }
                    }
                    if(match){
                        index=index-part.length();
                    }

                }
            }
            return new String(stack,0,index);
        }
    }

