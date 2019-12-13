public class BarkingDog {
    public static boolean shouldWakeUp (boolean barking,int hourOfDay){
        if (hourOfDay < 0 || hourOfDay > 23) {
            return false;
        }else if(barking && 8 > hourOfDay || 22 < hourOfDay){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("Do we have to wake up? " + shouldWakeUp(false, 7));
    }
}
