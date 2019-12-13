public class LoopChallenges {

    public static boolean isOdd(int number){
        if (number < 0){
            return false;
        }
        return number % 2 == 1;
    }

     /*public static int sumOdd(int start, int end){
        int sum = 0;
        if (start < 0 || end < start){
            return -1;
        }
        for (int loopStart = start; loopStart <= end; loopStart++){
         if (isOdd(loopStart)){
             sum += loopStart;
         }
        }
        return sum;
    } */

    public static int sumDigits (int number){
        if(number < 10){
            return -1;
        }
        int sum = 0;
        int num = number;
        while (num != 0){
            sum = sum + num % 10;
            num /= 10;
        }
        return sum;
    }

    public static boolean isPalindrome (int number){
        int intPalindrome;
        String tempString = Integer.toString(number);
        StringBuilder ifPalindrome = new StringBuilder();
        if (number < 0){

         int i = 1;
         while (i != tempString.length()){
             ifPalindrome.insert(0, tempString.charAt(i));
             i++;
         }
         ifPalindrome.insert(0, "-");
         System.out.println(ifPalindrome);
         intPalindrome = Integer.parseInt(ifPalindrome.toString());
            return number == intPalindrome;
        }else{
         int i = 0;
         while (i != tempString.length()){
             ifPalindrome.insert(0, tempString.charAt(i));
             i++;
         }
         System.out.println(ifPalindrome);
         intPalindrome = Integer.parseInt(ifPalindrome.toString());
         if(number == intPalindrome){
             return true;
         }
         return false;
     }
    }

    public static int sumLastAndFirstDigit (int number){
        if (number < 0){
            return -1;
        }
        if(number == 0){
            return 0;
        }
        int temp = number, counter = 0;
        int sum = number % 10;
        System.out.println(sum);
        while (temp != 0){
           temp = temp / 10;
           counter++;
        }
        System.out.println("Counter is: " +counter);
        System.out.println((int)Math.pow(10,counter));
        sum =( number / ((int)Math.pow(10,counter-1)) )+ sum;
        return sum;
    }

    public static int getEvenDigitSum(int number){
        int sum = 0, temp = number;
        if (number < 0){
            return -1;
        }
        while (temp != 0){
            if ((temp % 10) % 2 == 0){
                sum += temp % 10;
            }
            temp /= 10;
        }
        return sum;
    }

    public static boolean hasSharedDigit(int numberOne, int numberTwo){
        if (numberOne < 10 || numberOne > 99 || numberTwo < 10 || numberTwo > 99){
            return false;
        }
        boolean first = false, second = false;
        int temp = 0;
        while (temp < 10){
            System.out.println("The temp is: " +temp);
            while (numberOne != 0){
                System.out.println(numberOne%10);
                if ((numberOne % 10) == temp) {
                    first = true;
                    break;
                }
                numberOne = numberOne / 10;
            }
            while (numberTwo != 0){
                if ((numberTwo % 10) == temp){
                    second = true;
                    break;
                }
                numberTwo = numberTwo / 10;
            }
            if (first && second) {
                System.out.println(temp);
                return true;
            }
            temp++;
        }
        return false;
    }

    public static void main(String[] args) {
         int sum = 35;
         int temp = 13;
        /* int count = 0;
        for (int i = 1; i <= 1000; i++){
            if (i % 3 == 0 && i % 5 == 0){
                sum = sum + i;
                System.out.println("The added number is: " + i);
                count++;
            }
            if (count > 4){
                System.out.println("We have reached the brake point witch is 5");
                break;
            }
        }
        System.out.println("The sum is: " + sum);
        int sumOfOdds = 0;
        sumOfOdds = sumOdd(10,45);
        System.out.println("The sum of odd numbers between of 10 and 45 is: " + sumOfOdds);

        System.out.println("The sum of the digits is: " + sumDigits(73));


        System.out.println("Is the " + temp + " number palindrome? " + isPalindrome(temp));
        int theNumber = sumLastAndFirstDigit(132);
        System.out.println(theNumber);
       // sum = getEvenDigitSum(temp);
        System.out.println("The sum of the even digits is: " +sum);*/
        System.out.println("The two number are : " + temp +  " and " + sum);
        System.out.println(hasSharedDigit(sum,temp));
    }

}
