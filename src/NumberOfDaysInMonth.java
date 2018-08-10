//import LeapYear.java;

public class NumberOfDaysInMonth {

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

    public static int getDaysInMonth (int month, int year) {

        if (month < 0 || month > 12 ) {
            return -1;
        } else if (year < 0 || year > 9999 ) {
            return -1;
        } else {
            switch(month) {
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    return 31;
                case 2:
                    if (isLeapYear(year)) {
                        return 29;
                    } else
                        return 28;
                case 4: case 6: case 9: case 11:
                    return 30;
            }
        }
        return -1;
    }


}
