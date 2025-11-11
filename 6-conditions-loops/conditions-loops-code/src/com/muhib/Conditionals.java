package com.muhib;

import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        System.out.print("Enter the Salary: ");

        // **IF-ELSE** //

        /* Syntax

        if (boolean statement T or F) {
            Do this
            } else {
            Do this
            }
         */

//        int salary = input.nextInt();
//        if (salary >10000) {
//            salary += 2000;
//        } else {
//            salary += 1000;
//        }
//        System.out.println(salary);

        // **MULTIPLE IF-ELSE** //

        int salary = input.nextInt();
        if (salary > 30000) {
            salary += 3000;
        } else if (30000 > salary && salary > 10000) {
            salary += 2000;
        } else {
            salary += 1000;
        }

        System.out.println(salary);
    }
}
