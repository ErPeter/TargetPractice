public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
 if (kiloBytes >= 0){
        int megaBytes = 0;
        int remainedKiloBytes = 0;
        megaBytes = kiloBytes / 1024;
        remainedKiloBytes = kiloBytes % 1024;
        System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainedKiloBytes + " KB");
    }else{
     System.out.println("Invalid Value");
 }
}
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
    }
}
