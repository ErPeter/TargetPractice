import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int count, min;
        count = countScanner();
        int[] array;
        array = readIntegers(count);
        min = findMin(array);

        System.out.println("Your array is: ");
        System.out.println(Arrays.toString(array));
        System.out.println("The minimum value is: " + min);
    }
    public static int countScanner(){
        Scanner countScanner = new Scanner(System.in);
        int count;

        System.out.println("Enter how many numbers do you want to read! \r");
        count = countScanner.nextInt();
        return count;
    }

    public static int[] readIntegers(int count){
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[count];

        System.out.println("Please enter " + count + " integers to make your array!");

        for(int i = 0; i < array.length; i++){
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static int findMin(int[] array){
        int minValue = array[0];
        for (int i = 1; i < array.length; i++){
            if(array[i] < minValue){
                minValue = array[i];
            }
        }
        return minValue;
    }
}
