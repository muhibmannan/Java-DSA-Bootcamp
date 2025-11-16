package com.muhib;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        // For loop
        /*  Syntax:

            for (initialisation; condition; increment/decrement) {
                body
            }
         */

        // Q. Print numbers from 1 to 10

//        for (int num = 1; num <=10; num++) {
//            System.out.println(num);
//        }

        // Q. Print numbers from 1 to n

//        Scanner input = new Scanner (System.in);
//        int n =  input.nextInt();
//
//        for (int num = 0; num <= n; num++) {
//            System.out.println("Hello World!");
//        }

        // While loop
        /*  Syntax:
            while (condition) {
                //body
         */

//        Scanner input = new Scanner (System.in);
//        int n = input.nextInt();
//
//        int num = 0;
//        while (num <= n) {
//            System.out.println(num);
//            num++;
//        }

        // Do while loop
        /*  Syntax
                do {
                    //body
                } while (condition);
         */

        Scanner input = new Scanner (System.in);
        int n = input.nextInt();

        int num = 0;

        do {
            System.out.println(num);
            num++;
        } while (num <= n);

    }
}
