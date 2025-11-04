package recursion.advanced;

public class InviteGuestInParty {
    public static int callGuest(int n){
        if(n<=1){
            return 1;
        }
        int ways1=callGuest(n-1);//for calling single guest
        int ways2=(n-1)*callGuest(n-2);//for calling in pairs
        return ways1+ways2;
    }

}
