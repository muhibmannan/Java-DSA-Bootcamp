package com.muhib;

public class CountNumbers {
    public static void main(String[] args) {

        /* Q - Find the number of digits in a given value.

        int n = 23123;

        int count = 0;
        while(n > 0) {
            int rem = n % 10;
            if (rem == 2) {
                count++;
            }
            n = n / 10;
        }
        System.out.println(count);

         */

        /* Count ALL digits


        int number = 4564;

        int count = 0;

        while(number > 0){
            int rem = number % 10;
            if (rem > 0) {
                count++;
            }
            number /= 10;
        }
        System.out.println(count);
         */

        /* Sum of digits
        int number = 45;

        int sum = 0;

        while(number>0) {
            int remainder = number % 10;
            sum += remainder;
            number = number / 10;
        }
        System.out.println(sum);
         */

    }
}
