package com.sohel;

public class factorialUsingRecursion {
    public static void main(String[] args){
        // Java program to find factorial using Recursion
        int num = 7;
        int factorial = multiplyNumber(num);

        System.out.println("Factorial of "+ num +" = " + factorial);
    }

    public static int multiplyNumber(int num) {
        if (num >=1) {
            return num * multiplyNumber(num -1);
        }
        else{
            return 1;
        }
    }
}
