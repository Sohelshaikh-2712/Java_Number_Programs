package com.sohel;

public class OddNumbersInHundred {
    public static void main(String [] args){

        for(int i = 1; i <= 100; i++ ){
            if(i % 2 != 0){
                System.out.println("Odd Number :" + i);
            }
        }
    }
}
