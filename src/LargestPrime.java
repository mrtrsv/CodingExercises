public class LargestPrime {

    public static int getLargestPrime(int number) {

        if (number < 2) {
            return -1;
        }

        int i = 2;

        while ( i < number ) {
            if (number % i == 0) {
                number = number / i;
                i--;
            }
            i++;
        }

        if (i > 1) {
            return i;
        } else
            return -1;

    }
}
