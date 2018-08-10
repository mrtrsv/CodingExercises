public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes (int kiloBytes) {
        if (kiloBytes >= 0) {
            int megaBytes = kiloBytes / 1024;
            int remKiloBytes = kiloBytes - (megaBytes*1024);
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remKiloBytes + " KB");
        }
        else
            System.out.println("Invalid Value");
    }

}
