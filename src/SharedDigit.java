public class SharedDigit {

    public static boolean hasSharedDigit (int a, int b) {

        if (a < 10 || a>99 || b < 10 || b > 99) {
            return false;
        }

        int aDigits = 0;
        int bDigits = 0;

        while (a != 0) {
            aDigits  = a % 10;
                while (b !=0 ) {
                    bDigits = b % 10;
                    if (aDigits == bDigits) {
                        return true;
                    }
                    b = b / 10;

                }
                a = a / 10;
        }
        return false;
    }
}
