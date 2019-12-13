public class EqualSumChecker {
    public static boolean hasEqualSum (int numberOne, int numberTwo, int numberThree){
        if (numberOne + numberTwo == numberThree){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(hasEqualSum(3,-1,2));
    }
}
