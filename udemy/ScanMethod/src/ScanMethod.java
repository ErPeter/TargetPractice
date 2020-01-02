import java.util.Scanner;

public class ScanMethod {
    public static void main(String[] args) {
        //tenNumber();
        //maxAndMinNumber();
        //inputThenSumAndAverage();
        int need = getBucketCount(0.75,0.75,0.5,0);
        System.out.println(need);
    }


    public static int getBucketCount (double width, double height, double areaPerBucket, int extraBuckets){
        double area;
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0){
            return -1;
        }

        area = width * height / areaPerBucket;

        int areaInt = (int) Math.ceil(area);
        System.out.println(areaInt);

        return areaInt - extraBuckets;
    }

    public static int getBucketCount (double width, double height, double areaPerBucket){
        double area;
        if (width <= 0 || height <= 0 || areaPerBucket <= 0){
            return -1;
        }

        area = width * height / areaPerBucket;

        int areaInt = (int) area;

        return areaInt;
    }
    public static int getBucketCount (double area, double areaPerBucket){
        if (area <= 0 || areaPerBucket <= 0){
            return -1;
        }
        int buckets;

        buckets = (int) (area/areaPerBucket);
        return buckets;
    }


    public static void inputThenSumAndAverage (){
        Scanner scanner = new Scanner(System.in);
        boolean scannerInt;
        int sum = 0;
        double avg = 0;
        int counter = 1;
        int scannedNumber;
        while (true){
            scannerInt = scanner.hasNextInt();
            if(scannerInt){
                scannedNumber = scanner.nextInt();
                sum += scannedNumber;
                avg = (double)sum / (double) counter;
                counter++;
            }
            else {
                System.out.println("SUM = " + sum + " AVG = " + Math.round(avg));
                break;
            }
        }
    }

    public static void maxAndMinNumber (){
        Scanner scanner = new Scanner(System.in);
        boolean scannerInt;
        int max = 0 , min = 0;
        int scannedNumber;
        while (true){
            System.out.println("Enter your number: ");
            scannerInt = scanner.hasNextInt();
            if(scannerInt){
                scannedNumber = scanner.nextInt();
                if(scannedNumber < min){
                    min = scannedNumber;
                }
                if (scannedNumber > max) {
                    max = scannedNumber;
                }
            }
            else {
                System.out.println("Invalid number the loop has ended.");
                break;
            }
        }
        System.out.println("Your max is: "+max+" and your min is: " + min);

    }

    public static void tenNumber() {
        Scanner scanner = new Scanner(System.in);
        int counter = 1;
        int sum = 0;
        int number = 0;
        boolean scannerInt;
        while (counter <= 10){
            System.out.println("Enter your #" + counter +" number:");
            scannerInt = scanner.hasNextInt();
            if (scannerInt){
                number = scanner.nextInt();
                scanner.nextLine();
                sum += number;
                counter++;
            } else {
                System.out.println("You should have enter only numbers");
                scanner.nextLine();
            }
        }
        System.out.println("The sum is: " +sum);
    }

}
