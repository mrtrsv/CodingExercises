public class LeapYear {

    public static boolean isLeapYear (int year) {
        if (year >= 1 && year <=9999) {
            int calcLeapYear = year % 4;
            int calcLeapYear2 = year % 100;
            int calcLeapYear3 = year % 400;

            if (calcLeapYear == 0 && calcLeapYear2 > 0 || calcLeapYear3 ==0 ) {
                return true;
            } else
                return false;
        }
        return false;
    }



}
