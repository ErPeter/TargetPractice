package erpeter.packagechallange;


public class Series {

    public int nSum(int n){
        int sum = 0;
        int temp = 0;
        if(n == 0){
         return 0;
        }
        while(temp < n){
            sum = sum + temp;
            temp++;
        }
        return sum;
    }

    public int factorial(int n){
        int temp = n;
        int factorial = 1;
        if(n == 0)
            return 1;
        while (temp > 1){
            factorial = factorial * temp;
            temp--;
        }
        return factorial;
    }

    public int fibonacci(int n){
        if(n == 0) {
            return 0;
        } else if( n < 2 ){
            return 1;
        }
        int fibonacci1 = 0;
        int fibonacci2 = 1;
        int temp = 0, fibSum = 0;
        while (temp < n-1){
            fibSum = fibonacci1 +  fibonacci2;
            fibonacci1 = fibonacci2;
            fibonacci2 = fibSum;
            temp++;
        }
        return fibSum;

    }

}
