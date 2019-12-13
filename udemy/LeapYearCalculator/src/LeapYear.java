import org.w3c.dom.ls.LSOutput;

public class LeapYear {
    public static boolean isLeapYear(int year) {
        if(year < 1 || year > 9999){
            return false;
        }
        if (year % 4 == 0 ){
            if (year % 100 != 0){
                return true;
            }else if(year % 400 == 0){
                return true;
            }else {
                return false;
            }
        }else{
            return false;
        }
}

    public static void main(String[] args) {
        int years = 1923;
        System.out.println(years + " Is leap year? " + isLeapYear(years));
    }
}
