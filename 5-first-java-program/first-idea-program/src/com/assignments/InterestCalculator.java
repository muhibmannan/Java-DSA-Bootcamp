package com.assignments;

import java.util.Scanner;

public class InterestCalculator {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Principal: ");
        int principal = input.nextInt();

        System.out.print("Enter the time: ");
        int time = input.nextInt();

        System.out.print("Enter the rate: ");
        float rate = input.nextFloat();

        float simpInterest = (principal * time * rate) / 100;
        float interest = simpInterest + principal;


        System.out.println("The Total is: " +interest);
    }
}
