package Exercise;

import java.util.Scanner;

public class ProductOfTwoNumber {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int firstNumber = in.nextInt();

        System.out.print("Enter second number: ");
        int secondNumber = in.nextInt();

        System.out.println("The product of two numbers is: " + product(firstNumber, secondNumber));

    }

    static int product (int a, int b) {
        return a * b;
    }
}
