public class SpeedConverter {
    public static long toMilesPerHour (double kilometersPerHour){
        if (kilometersPerHour < 0.00){
            return -1L;
        }else{
            kilometersPerHour /= 1.609;
        }
        kilometersPerHour = Math.round(kilometersPerHour);
        long milesPerHour;
        milesPerHour = (long) kilometersPerHour;
        return milesPerHour;
    }

    public static void printConversion (double kilometersPerHour) {
        double miPerHour;
        if (kilometersPerHour>= 0) {
            miPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = " + (int) miPerHour + " mi/h");
        }else{
            System.out.println("Invalid value");
        }
    }
    public static void main(String[] args) {
        long a;

        a = toMilesPerHour(-2);
        System.out.println("The value is: " + a);

        double test = 2.1d;
        printConversion(test);
    }
}
