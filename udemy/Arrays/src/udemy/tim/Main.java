package udemy.tim;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arrayInt = getIntegers(5);

        for(int i =0; i < arrayInt.length; i++){
            System.out.println("The " + i + " element of the array is: " + arrayInt[i]);
        }
        sortArray(arrayInt);
        System.out.println("The sorted array is: ");
        for(int i =0; i < arrayInt.length; i++){
            System.out.println("The " + i + " element of the array is: " + arrayInt[i]);
        }
    }

    public static int[] getIntegers(int number){
        int[] array = new int[number];
        System.out.println("Type "+ number+ " int to make your array \r");
        for(int i=0; i <array.length; i++ ){
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static int[] sortArray(int[] array){
        int temp = 0;
        boolean flag = true;
        while(flag) {
            flag = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] < array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return array;
    }
}
