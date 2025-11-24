package Exercise;

import java.util.Enumeration;
import java.util.Scanner;

public class FactorialOfNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");

        int num = in.nextInt();

        factorial(num);

        System.out.println("Factorial of Number is: " + factorial(num));
    }

    static int factorial(int a) {
        int result = 1;
        for (int i = 1; i <= a ; i++) {
            result = result * i;
        }
        return result;
    }
}
