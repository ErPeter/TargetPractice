import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static int[] array(){
        System.out.println("How many numbers do you wish to revers? \r");
        int count = scanner.nextInt();
        int[] array = new int[count];
        for(int i = 0; i < array.length; i++){
            array[i] = scanner.nextInt();
        }

        return array;
    }

    public static int[] reversedArray(int[] array){
        int[] reversedArray =new int[array.length];

        for(int i = 0; i < array.length; i++){
            reversedArray[reversedArray.length -1 - i] = array[i];
        }
        return reversedArray;
    }

    public static void main(String[] args) {
        int[] array = array();
        int [] reversedArray = reversedArray(array);

        System.out.println("Your array is: \n" + Arrays.toString(array));
        System.out.println("Your reversed array is: \n" + Arrays.toString(reversedArray));
    }
}
