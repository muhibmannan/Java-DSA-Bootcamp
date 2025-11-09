package com.muhib;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        float num = input.nextFloat();
//        System.out.println("The number is: " + num);
//
//        //type casting
//        int num = (int) 54.89f;
//        System.out.println(num);

        // automatic type promotion in expressions
        byte a = 50;
        byte b = 40;
        byte c = (byte) (a * b);
        System.out.println(c);


    }
}
