public class FlourPacker {

    public static boolean canPack (int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        if (goal == ((5 * bigCount) + smallCount)) {
            return true;
        }
        if ((bigCount*5)+ smallCount < goal){
            return false;
        }
        if (smallCount > goal) {
            return true;
        } else if ((goal %5) > smallCount ) {
            return false;
        }
        else
            return true;
    }
}
