package com.sohel;

public class TotalNumOfOddNum {
    public static void main(String[]args){

        int count = 0;

        for(int i = 1; i <= 100; i++){
            if(i % 2 != 0){
                count++;
                System.out.println("The Odd Numbers are :" + i);

            }
        }

        System.out.println("The Count of Odd Numbers Between 1 to 100 is: " + count);
    }
}
