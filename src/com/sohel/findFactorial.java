package com.sohel;

public class findFactorial {
    public static void main(String[] args){
        // Java program to find factorial of a number
        int num = 10;
        int factorial = 1;

        for(int i = 1; i <= num; i++){

            //formula to calculate factorial
            // factorial = factorial * i

            factorial *= i;
        }

        System.out.println("factorial of" + " "+ + num + "=" + " " + factorial);
    }
}
