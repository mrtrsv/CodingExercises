public class BarkingDog {

    public static boolean bark(boolean barking, int hourOfDay) {
        if (barking == false) {
            return false;
        } else if (hourOfDay < 0 || hourOfDay > 23 ) {
            return false;
        } else if (hourOfDay <8 ) {
            return true;
        } else if (hourOfDay > 22 && hourOfDay <= 23 ) {
            return true;
        }
        return false;
    }

}
