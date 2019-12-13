public class IntEqualityPrinter {
    public static void main(String[] args) {

    }

    public static void printEqual (int numberOne, int numberTwo, int numberThree){
        if (numberOne < 0 || numberTwo < 0 || numberThree < 0){
            System.out.println("Invalid Value");
        }else if(numberOne == numberThree && numberOne == numberTwo){
            System.out.println("All number are equal");
        }else if (numberOne != numberThree && numberOne != numberTwo && numberTwo != numberThree){
            System.out.println("All number are different");
        }else{
            System.out.println("Neither all are equal or different");
        }
    }
}
