package com.muhib;

import java.util.Scanner;

public class LargestNumber {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        int num1 = sc.nextInt();
        System.out.println();
        int num2 = sc.nextInt();
        System.out.println();
        int num3 = sc.nextInt();

        int max = num1;

        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }

        System.out.println(max);
    }
}
