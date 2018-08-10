public class NumberToWords {

    public static void numberToWords (int number) {

        if (number < 0) {
            System.out.println("Invalid Value");
        }

        int count = digitCount(number);

        number = reverse(number);

        int lastDigit = 0;
        while (number > 0 ||  count > 0) {
            lastDigit = number % 10;
            switch (lastDigit) {
                case 0 :
                    System.out.printf("Zero ");
                    break;
                case 1 :
                    System.out.printf("One ");
                    break;
                case 2 :
                    System.out.printf("Two ");
                    break;
                case 3 :
                    System.out.printf("Three ");
                    break;
                case 4 :
                    System.out.printf("Four ");
                    break;
                case 5 :
                    System.out.printf("Five ");
                    break;
                case 6 :
                    System.out.printf("Six ");
                    break;
                case 7 :
                    System.out.printf("Seven ");
                    break;
                case 8 :
                    System.out.printf("Eight ");
                    break;
                case 9 :
                    System.out.printf("Nine ");
                    break;
            }
            number = number / 10;
            count--;

        }


    }

    public static int reverse (int inputNumber) {

        int reversed = 0;
        while (inputNumber != 0) {
            reversed = reversed * 10 + inputNumber % 10;
            inputNumber = inputNumber / 10;
        }
        return reversed;


    }

    public static int digitCount (int number ) { // max integer is 2,147,483,647
        if (number < 0) {
            return -1;
        }

        int count = 0;

        do {
            count++;
            number = number / 10;
        } while (number > 0);
            return count;
        }
}
