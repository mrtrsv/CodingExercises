public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double a, double b) {
        double sum = 0;
        if (a > b) {
//            System.out.println("a > b");
            sum = a - b;
        } else {
//            System.out.println("b > a");
            sum = b - a;
        }
//        System.out.println(sum);
        if (sum <= 0.0009) {
            return true;
        } else
        return false;
    }
}
