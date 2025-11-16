package com.assignments;

import java.util.Scanner;

public class TwoNumbersAndOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter Second Number: ");
        int num2 = input.nextInt();

        input.nextLine();

        System.out.print("Enter the operator (+, -, *, /): ");
        String op = input.nextLine();

        if (op.equals("+")) {
            System.out.println(num1 + num2);
        } else if (op.equals("-")){
            System.out.println(num1 - num2);
        } else if (op.equals("*")) {
            System.out.println(num1 * num2);
        } else if (op.equals("/")) {
            System.out.println(num1 / num2);
        } else {
            System.out.println("Invalid Operator!!");
        }
    }
}
