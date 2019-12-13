public class MinutesToYearsAndDaysCalculator {
    public static void main(String[] args) {
        long min = 1440L;

        printYearsAndDays(min);
    }

    public static void printYearsAndDays(long minutes){
        if (minutes < 0){
            System.out.println("Invalid Value");
        }else {
            long years, days, hours;
            hours = minutes / 60;
            days = (hours / 24) % 365;
            years = (hours / 24) / 365;

            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }
    }

}

