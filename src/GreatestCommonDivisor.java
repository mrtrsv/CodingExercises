public class GreatestCommonDivisor {


    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }
        int divisor = 1;
        int maxDivisor = 1;
        int smaller = 0;
        if (first < second) {
            smaller = first;
        } else
            smaller = second;
        while ( divisor <= smaller ) {
            if (first % divisor == 0 && second % divisor == 0) {
                maxDivisor = divisor;
            }
            divisor++;
        }
        return maxDivisor;
    }
}
