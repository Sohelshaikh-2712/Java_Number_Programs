package com.sohel;

public class SumOfN_Numbers {
    public static void main(String[]args){

        int sum =0;
        int n = 100;

        for(int i = 1; i <= n; i++){
            sum = sum +i;
        }
        System.out.println("The Sum of " + n + " numbers is :" + sum);
    }
}
