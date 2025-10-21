package recursion;

public class OccuranceOfElement {
    //provide first and last occurance of element in STring
    //input ="abaacdaefaaah"
    public static void occurance(String s,int idx,Character ele,int[] result){
        if(idx==s.length() ){
            System.out.println("first occurance is "+result[0]+"and last occurance is "+result[1]);
            return;
        }
        Character currentChar=s.charAt(idx);
        if(currentChar==ele){
            if(result[0]==-1){
                result[0]=idx;
            }

                result[1]=idx;

        }
        occurance(s,idx+1,ele,result);


    }
    public static void main(String[] args) {
        String s="abaacdaefaaah";
        int[] result={-1,-1};
        occurance(s,0,'a',result);
    }
}
