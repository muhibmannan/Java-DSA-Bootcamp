package com.muhib;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {

        int number = 5466;

        int reverseNumber = 0;

        while(number > 0){
            int remainder = number % 10;
            number /= 10;
            reverseNumber = reverseNumber * 10 + remainder;
        }
        System.out.println(reverseNumber);
    }
}
