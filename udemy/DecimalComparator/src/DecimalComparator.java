import java.text.DecimalFormat;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces (double numberOne, double numberTwo){
        int dif = ((int)(numberOne * 1000 - numberTwo * 1000));

        System.out.println(numberOne);
        System.out.println(numberTwo);
        if (dif != 0){
            return false;
        }else{
            return true;
        }

    }

    public static void main(String[] args) {
        double numTestOne = 3.1756;
        double numTestTwo = 3.1755;

        System.out.println("Are the numbers equal? " + areEqualByThreeDecimalPlaces(numTestOne, numTestTwo));
    }
}
