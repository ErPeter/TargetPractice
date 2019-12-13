import java.security.PrivilegedExceptionAction;

public class Switch {
    public static void main(String[] args) {
        int switchValue = 3;
        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("was a 3 or 4 or 5");
                System.out.println("Actually it was a "+ switchValue);
                break;
            default:
                System.out.println("was not 1 or 2");
                break;
        }
        char switchChar = 'A';
        switch (switchChar){
            case 'A':
                System.out.println("The letter was A");
                break;
            case 'B':
                System.out.println("The letter was B");
                break;
            case 'C':
                System.out.println("The letter was C");
                break;
            case 'D':
                System.out.println("The letter was D");
                break;

            case 'E':
                System.out.println("The letter was E");
                break;
            default:
                System.out.println("The letter was NOT A, B, C, D, or E");
                break;
        }
        printDayOfTheWeek(3);

        int days = 0;
        days = getDaysInMonth(2, 5);
        System.out.println(days);
    }
    public static void printDayOfTheWeek (int day){
        switch (day){
            case 0:
                System.out.println("Monday");
                break;
            case 1:
                System.out.println("Tuesday");
                break;
            case 2:
                System.out.println("Wednesday");
                break;
            case 3:
                System.out.println("Thursday");
                break;
            case 4:
                System.out.println("Friday");
                break;
            case 5:
                System.out.println("Saturday");
                break;
            case 6:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }

    }
    public static void printNumberInWord (int number){
        switch (number){
            case 0:
                System.out.println("ZERO");
                break;
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
            default:
                System.out.println("OTHER");
        }
    }

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

    public static int getDaysInMonth(int month, int year){
        if (month < 1 || month > 12){
            return -1;
        }
        if (year < 1 || year > 9999){
            return -1;
        }
        int days = 0;
        switch (month){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                days = 31;
                break;
            case 2:
                if (isLeapYear(year)){
                    days = 29;
                }else {
                    days = 28;
                }
                break;
            case 4: case 6: case 9: case 11:
                days = 30;
                break;
            default:
                days = -1;
                break;
        }
        return days;
    }
}
