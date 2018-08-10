public class SecondsAndMinutesChallenge {

    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";

    private static String getDurationString(int minutes, int seconds) {

        if (minutes > 0 && seconds >= 0 && seconds <= 59) {
            int hours = minutes / 60;
            String hoursString = hours + "h ";
            if (hours < 10) {                                                   // This could be done as method as well and reused for hours, minutes, seconds!
                hoursString = "0" + hoursString;
            }

            int remainingMinutes = minutes % 60;
            String minutesString = remainingMinutes + "m ";
            if (remainingMinutes < 10) {
                minutesString = "0" + minutesString;
            }
            String secondsString = seconds + "s";
            if (seconds < 10) {
                secondsString = "0" + secondsString;
            }

            return hoursString + minutesString + secondsString;
        }

        return INVALID_VALUE_MESSAGE;
    }

    private static String getDurationString(int seconds) {

        if (seconds >= 0 ) {
            int minutes = seconds / 60;
            int remainingSeconds = seconds % 60;
            System.out.println(minutes + ":" + remainingSeconds);

            return getDurationString(minutes,remainingSeconds);

        }

        return INVALID_VALUE_MESSAGE;
    }

}
