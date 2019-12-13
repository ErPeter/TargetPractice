package Challenge;

import java.util.function.BinaryOperator;

public class OperatorChallenge {
    public static void main(String[] args){

        double firstDouble = 20.00d;
        double secondDouble = 80.00d;
        double sum = (firstDouble + secondDouble) * 100.00d;
        sum %= 40.00d;

        System.out.println("The result is: " + sum);

        boolean result = (sum == 0.0) ? true : false;

        System.out.println("The boolean is: " + result);

        if (!result){
            System.out.println("Got some remainder");
        }
    }
}