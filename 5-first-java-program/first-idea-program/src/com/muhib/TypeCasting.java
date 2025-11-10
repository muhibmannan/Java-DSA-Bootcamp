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

//        int a = 257;
//        byte b = (byte) a;

//        byte a = 50;
//        byte b = 40;
//        byte c = 100;
//        int d = a * b / c;
//        System.out.println(d);

//        byte b = 50;
//        b = b * 2;

//        int number = 'A';
//        System.out.println(number);


        byte b = 65;
        char c = 'a';
        short s = 1541;
        int i = 65465;
        float f = 654.65f;
        double d = 0.216454;

        double result = (f * b) + (i / c) - (d * s);

        System.out.println((f * b) +" "+ (i / c) +" "+ (d * s));
        System.out.println(result);



    }
}
