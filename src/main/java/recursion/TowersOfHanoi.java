package recursion;

public class TowersOfHanoi {
    //logic behind transfer will be that first we will transfer n-1 disks from source to helper
    //one disk from source to destination
    //n-1 disk from helper to source and then finally to destination
    public static void towerOfHanoi(int n, String src, String helper, String destination){
        if(n==1){
            System.out.println("Transferred disk "+n+"from "+src+"to"+destination);
            return;

        }
        towerOfHanoi(n-1,src,destination,helper);
        System.out.println("Transferred disk "+n+"from "+src+"to"+destination);
        towerOfHanoi(n-1,helper,src,destination);
    }
    public static void main(String[] args) {
        int n=2;
        String src="S";
        String helper="H";
        String destination="D";
        towerOfHanoi(n,src,helper,destination);
    }

}

