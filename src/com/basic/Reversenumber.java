package com.basic;

 public class Reversenumber 
 {


    public static void main(String[] args) {

        int num = 1234, Reversed = 0;

        while(num != 0) {
            int digit = num % 10;
            Reversed = Reversed * 10 + digit;
            num /= 10;
        }

        System.out.println("Reversed Number: " + Reversed);
    }
 }

