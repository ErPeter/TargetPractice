public class OverloadMethod {

    public static void main(String[] args) {
        int feet = 3, inches = 10, inch = 30;
        int seconds = 4000;
        int second = 50, minutes = 72;
        System.out.println(feet + " Feet and " + "inches " + inches + " in cm is: " + calcFeetAndInchesToCentimeters(feet,inches));
        System.out.println(inch + " Is " + calcFeetAndInchesToCentimeters(inch) + " cm");

        System.out.println(seconds + " Is " + getDurationString(seconds));
        System.out.println(second + " seconds and " + minutes +" minutes are: "+ getDurationString(minutes, second));

    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        double centiMeters;
        if (feet < 0 || (inches < 0 || inches > 12)) {
            return -1;
        }else{
            centiMeters = (12 * feet + inches) * 2.54;
        }
        return centiMeters;
    }
    public static double calcFeetAndInchesToCentimeters(double inches) {
        double feets;
        if (inches < 0) {
            return -1;
        }
        feets = (int) inches / 12;
        double inche = (int) inches % 12;
        return (calcFeetAndInchesToCentimeters(feets, inche));
    }


    public static String getDurationString (int minutes, int seconds){
        if (minutes < 0 || (seconds < 0 || seconds > 59)){
            return "Invalid Values";
        }
        int hours, minute, second;
        minute = minutes + seconds / 60;
        second = seconds % 60;
        hours = minute / 60;
        minute = minutes % 60;

        String duration = hours+"h " + minute + "m "+ second +"s ";
        return duration;
    }
    public static String getDurationString (int seconds){
        if (seconds < 0){
            return "Invalid Value";
        }
        int hours, minute, second;

        second = seconds % 60;
        minute = (seconds % 3600) / 60;
        hours = seconds / 3600;

        String duration = hours+"h " + minute + "m "+ second +"s ";
        return duration;
    }
}
