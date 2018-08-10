public class NumberPalindrome {

    public static boolean isPalindrome(int number ) {
        int reverse = 0;
        int origNumber = number;
        while (number !=0) {
            reverse = reverse * 10;
            reverse += number % 10;
            number = number / 10;
        }

        if (origNumber == reverse ) {
            return true;
        }
        return false;
     }
}
